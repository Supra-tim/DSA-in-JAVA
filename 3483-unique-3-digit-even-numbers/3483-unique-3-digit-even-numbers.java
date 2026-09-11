class Solution {
    HashSet<Integer>set=new HashSet<>();
    public void solve(int digits[], boolean used[], int num, int cnt){
        if(cnt==3){
            if(num%2==0){
                set.add(num);
            }
            return;
        }
        for(int i=0; i<digits.length; i++){
            if(used[i]){
                continue;
            }
            if(cnt==0 && digits[i]==0){
                continue;
            }
            used[i]=true;
            solve(digits, used, num*10+digits[i], cnt+1);
            used[i]=false;
        }
    }
    public int totalNumbers(int[] digits) {
        boolean used[]=new boolean[digits.length];
        solve(digits, used, 0, 0);
        return set.size();
    }
}