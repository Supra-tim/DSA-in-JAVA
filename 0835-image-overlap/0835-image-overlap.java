class Solution {
    public int overlap(int A[][], int B[][], int rowoff, int coloff){
        int n=A.length;
        int cnt=0;
        for(int i=0;  i<n; i++){
            for(int j=0; j<n; j++){
                int B_i=i+rowoff;
                int B_j=j+coloff;
                if(B_i<0 || B_i>=n || B_j<0 || B_j>=n){
                    continue;
                }
                if(A[i][j]==1 && B[B_i][B_j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
        for(int rowoff=-n+1; rowoff<n; rowoff++){
            for(int coloff=-n+1; coloff<n; coloff++){
                int cnt=overlap(img1, img2, rowoff, coloff);
                max=Math.max(max, cnt);
            }
        }
        return max;
    }
}