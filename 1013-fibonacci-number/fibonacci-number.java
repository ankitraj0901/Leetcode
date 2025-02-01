class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        int a=0,b=1,x=1;
        return fab(a,b,x,n);
    }
    public static int fab(int a,int b,int x,int n){
        int c=0;
        c=a+b;
        a=b;
        b=c;
        if(x==n)
            return a;
        return fab(a, b, x+1, n);
    }
}