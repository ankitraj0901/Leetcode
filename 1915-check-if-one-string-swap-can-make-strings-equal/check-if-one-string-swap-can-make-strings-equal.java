class Solution {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        int i=0,j=0,k;
        char temp;
        char []c;
        char []d;
        c=s1.toCharArray();
        d=s2.toCharArray();
        for(i=0;i<c.length;i++){
            for(j=i+1;j<c.length;j++){
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                for(k=0;k<c.length;k++){
                    if(c[k]!=d[k])
                        break;
                }
                if(k==c.length)
                    return true;
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
        }
        return false;
    }
}