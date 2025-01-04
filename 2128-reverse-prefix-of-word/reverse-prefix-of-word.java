class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        char arr[]=new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arr[i]=word.charAt(i);
        }
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            if(arr[i]==ch)
                count++;
        }
        if(count==0)
            return word;
        
        char c;
        for (int i = 0; i < word.length(); i++) {
            c=word.charAt(i);
            if(ch==c){
                stack.push(c);
                break;
            }
            stack.push(c);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ch){
                arr[i]=stack.pop();
                break;
            }
            arr[i]=stack.pop();            
        }
        String str=new String(arr);
        return str;
    }
}