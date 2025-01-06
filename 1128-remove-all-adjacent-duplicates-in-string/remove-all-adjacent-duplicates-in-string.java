class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<Character>();
        char ch;int i;
        for (i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            //System.out.print(ch);
            if(stack.isEmpty()){
                stack.push(ch);
                // System.out.println();
                // System.out.print(ch);
            }
            else{
                if(ch!=stack.peek()){
                    //System.out.print(ch);
                    stack.push(ch);
                    continue;
                }
                stack.pop();
            }
        }
        stack.forEach(System.out::print);
        StringBuilder bi =new StringBuilder();
        while (!stack.empty()) {
            bi.append(stack.pop());
        }
        bi.reverse();
        return bi.toString();
    }
}