class Solution {
    public List<Integer> getRow(int rowIndex) {
        int r=rowIndex+1;
        ArrayList<Integer>list=new ArrayList<>();
        long ans=1;
        list.add((int)ans);
        for(int i=1; i<r; i++){
            ans=ans*(r-i);
            ans=ans/i;
            list.add((int)ans);
        }
        return list;
    }
}