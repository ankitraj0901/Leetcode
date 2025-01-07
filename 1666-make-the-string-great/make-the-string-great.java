class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            if(stack.empty())
                stack.push(ch);
            else{
                if((int)ch==((int)stack.peek())+32 ||(int)ch==((int)stack.peek())-32){
                    stack.pop();
                    continue;
                }
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