class Solution {
public:
    int countSymmetricIntegers(int low, int high) {
        int i,j,count=0,len=0,temp=0,sum1=0,sum2=0,rem=0;
        for(i=low;i<=high;i++){
            temp=i;
            len=0;
            while(temp!=0){
                len++;
                temp=temp/10;
            }
            if(len%2==0){
                sum1=0;
                sum2=0;
                temp=i;
                for(j=len;j>=1;j--){
                    if(j<=len/2){
                        rem=temp%10;
                        sum1=sum1+rem;
                        temp=temp/10; 
                    }
                    else{
                        rem=temp%10;
                        sum2=sum2+rem;
                        temp=temp/10; 
                    }
                       
                }
                if(sum1==sum2)
                    count++;
            }
        }
        return count;
    }
};