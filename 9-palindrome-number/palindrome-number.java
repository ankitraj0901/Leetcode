class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int rem,num=0,temp=x;
        while(x!=0){
            rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        return temp==num;
        
    
    }
}