class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int[][] litterIndex = new int[m][n];

        int startX = 0, startY = 0;
        int litterCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startX = i;
                    startY = j;
                } 
                else if (ch == 'L') {
                    litterIndex[i][j] = litterCount;
                    litterCount++;
                }
            }
        }
        if (litterCount == 0) {
            return 0;
        }
        int fullMask = (1 << litterCount) - 1;
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << litterCount];
        java.util.Queue<int[]> queue = new java.util.ArrayDeque<>();

        queue.offer(new int[] {
            startX,
            startY,
            energy,
            fullMask
        });

        visited[startX][startY][energy][fullMask] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            while (size-- > 0) {

                int[] state = queue.poll();

                int x = state[0];
                int y = state[1];
                int currEnergy = state[2];
                int mask = state[3];
                if (mask == 0) {
                    return moves;
                }
                if (currEnergy == 0) {
                    continue;
                }

                for (int k = 0; k < 4; k++) {

                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                        continue;
                    }
                    if (classroom[nx].charAt(ny) == 'X') {
                        continue;
                    }

                    char cell = classroom[nx].charAt(ny);
                    int newEnergy = currEnergy - 1;
                    if (cell == 'R') {
                        newEnergy = energy;
                    }
                    int newMask = mask;

                    if (cell == 'L') {
                        int bit = litterIndex[nx][ny];
                        newMask &= ~(1 << bit);
                    }
                    if (!visited[nx][ny][newEnergy][newMask]) {

                        visited[nx][ny][newEnergy][newMask] = true;

                        queue.offer(new int[] {
                            nx,
                            ny,
                            newEnergy,
                            newMask
                        });
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}