class Solution {
    public void reverse(StringBuilder sb, int left, int right){
        while(left<right){
            char temp=sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer>S=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                S.push(res.length());
            }
            else if(ch==')'){
                int l=S.peek();
                S.pop();
                reverse(res, l, res.length()-1);
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}