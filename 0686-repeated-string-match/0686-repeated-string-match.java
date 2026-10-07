class Solution {
    public int repeatedStringMatch(String a, String b) {
        int lps[]= new int[b.length()];
        int i=1;
        int j=0;
        lps[0]=0;
        while(i<b.length()){
            if(b.charAt(i)==b.charAt(j)){
                lps[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int repeat=(b.length()+a.length()-1)/a.length();
        for(int k=repeat; k<=repeat+1; k++){
            int x=0;
            int y=0;
            int n=k*a.length();
            while(x<n){
                char txt=a.charAt(x%a.length());
                if(txt==b.charAt(y)){
                    x++;
                    y++;
                }
                else{
                    if(y!=0){
                        y=lps[y-1];
                    }
                    else{
                        x++;
                    }
                }
                if(y==b.length()){
                    return k;
                }
            }
        }
        return -1;
    }
}