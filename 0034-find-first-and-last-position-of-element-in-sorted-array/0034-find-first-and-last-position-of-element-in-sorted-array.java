class Solution {
    public int LowerBound(int a[], int x){
        int str=0; int end=a.length-1;
        int ans=a.length;
        int mid;
        while(str<=end){
            mid=(str+end)/2;
            if(a[mid]>=x){
                ans=mid;
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        return ans;
    }
    public int UpperBound(int a[], int x){
        int str=0; int end=a.length-1;
        int ans=a.length;
        int mid;
        while(str<=end){
            mid=(str+end)/2;
            if(a[mid]>x){
                ans=mid;
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        int Lower_Bound=LowerBound(nums, target);
        int Upper_Bound=UpperBound(nums, target);
        if(Lower_Bound==nums.length || nums[Lower_Bound]!=target){
            return arr;
        }
        else{
            arr[0]=Lower_Bound;
            arr[1]=Upper_Bound-1;
        }
        return arr;
    }
}