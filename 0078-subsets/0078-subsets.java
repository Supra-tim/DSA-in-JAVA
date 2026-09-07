class Solution {
    public void fc(int indx, int arr[], List<List<Integer>>ans, List<Integer>ds){
        if(indx==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[indx]);
        fc(indx+1, arr, ans, ds);
        ds.remove(ds.size()-1);
        fc(indx+1, arr, ans, ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        fc(0, nums, ans, new ArrayList<>());
        return ans;
    }
}