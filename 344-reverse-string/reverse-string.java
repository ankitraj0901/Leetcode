class Solution {
    public void reverseString(char[] s) {
        int i,j;
        char temp;
        for(i=0,j=s.length-1;i<s.length/2;i++,j--){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}