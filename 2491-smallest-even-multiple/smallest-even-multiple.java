class Solution {
    public int smallestEvenMultiple(int n) {
        int i=n;
        while(true) {
            if(i%n==0&&i%2==0)
                return i;
            i++;
        }   
    }
}