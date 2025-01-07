class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            if(stack.empty())
                stack.push(ch);
            else if(ch>='0'&& ch<='9'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }   
        StringBuilder bi=new StringBuilder();
        while(!stack.isEmpty()){
            bi.append(stack.pop());
        }
        bi.reverse();
        return bi.toString();
    }
}