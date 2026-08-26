class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        for(int len=k; len<=n; len++){
            String res="";
            for(int start=0; start<=n-len; start++){
                String temp=s.substring(start,start+len);
                int ones=0;
                for(char ch:temp.toCharArray()){
                    if(ch=='1'){
                        ones++;
                    }
                }
                if(ones==k){
                if(res.isEmpty()|| temp.compareTo(res)<0){
                    res=temp;
                }
                }
            }
            if(!res.isEmpty()){
                return res;
            }
        }
        return "";
    }
}