class Solution {
    public String reverseWords(String s) {
        Stack<String>st=new Stack<>();
        s=s.trim();
        for(String word:s.split("\\s+")){
            st.push(word);
        }
        String res="";
        while(!st.isEmpty()){
            res=res+st.pop();
            if(!st.isEmpty()){
                res=res+" ";
            }
        }
        return res;
    }
}