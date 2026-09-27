class Solution {
    public List<Integer>G_Row(int row){
        List<Integer>list=new ArrayList<>();
        long ans=1;
        list.add((int)ans);
        for(int col=1; col<row; col++){
            ans=ans*(row-col);
            ans=ans/col;
            list.add((int)ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            ans.add(G_Row(i));
        }
        return ans;
    }
}