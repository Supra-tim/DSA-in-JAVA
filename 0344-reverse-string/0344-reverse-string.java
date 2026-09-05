class Solution {
    public void swap(int a , int b, char s[]){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
    public void rec(int l, int r, char s[]){
        if(l>=r){
            return;
        }
        swap(l,r, s);
        rec(l+1, r-1,s);
    }
    public void reverseString(char[] s) {
        int n=s.length;
        rec(0,n-1, s);
    }
}