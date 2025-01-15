class Solution {
    public int alternateDigitSum(int n) {
        int sum=0,count=0,rem=0;
        int num=n;
        int remm=0,rev=0;
        while(num!=0){
            remm=num%10;
            rev=rev*10+remm;
            num=num/10;
        }
        n=rev;
        while(n!=0){
            count++;
            rem=n%10;
            if(count%2!=0){
                sum=sum+rem;
            }
            else{
                sum=sum-rem;
            }
            n=n/10;
        }   
        return sum;
    }
}