class demo {

    static int parent[];
    public static int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public static void main(String[] args) {
        parent = new int[]{0, 1, 2, 2};
        System.out.println("Parent of 0 : " + find(0));
        System.out.println("Parent of 1 : " + find(1));
        System.out.println("Parent of 2 : " + find(2));
        System.out.println("Parent of 3 : " + find(3));
    }
}