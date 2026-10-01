class Solution {
    public boolean isValid(String s) {
        Stack<Character>str=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                str.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(str.isEmpty()){
                    return false;
                }
            char top=str.pop();
            if((ch==')' && top !='(')|| 
            (ch=='}' && top!='{') || 
            (ch==']' && top!='[')){
                return false;
            }
            }
        }
        return str.isEmpty();
    }
}