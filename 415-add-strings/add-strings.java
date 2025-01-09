import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger b1=new BigInteger(num1);
        BigInteger b2=new BigInteger(num2);
        String sum=String.valueOf(b1.add(b2));
        return sum;   
    }
}