class Solution {
    public boolean sumGame(String num) {
        int leftcount=0;
        int rightcount=0;
        int leftQmark=0;
        int rightQmark=0;
        int n=num.length();
        for(int i=0; i<n; i++){
            if(num.charAt(i)=='?'){
                if(i<n/2){
                    leftQmark++;
                }
                else{
                    rightQmark++;
                }
            }
            else{
                if(i<n/2){
                    leftcount+=num.charAt(i)-'0';
                }
                else{
                    rightcount+=num.charAt(i)-'0';
                }
            }
        }
        int tot=leftQmark+rightQmark;
        if(tot%2==1){
            return true;
        }
        int Left=2*leftcount+9*leftQmark;
        int Right=2*rightcount+9*rightQmark;
        if(Left==Right){
            return false;
        }
        else{
            return true;
        }
    }
}
