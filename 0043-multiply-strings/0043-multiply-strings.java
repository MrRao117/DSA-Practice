import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1 = BigInteger.ZERO;
        BigInteger n2 = BigInteger.ZERO;
        for (int i = 0; i <num1.length(); i++) {
            int r = num1.charAt(i) -'0';
//            n1= n1*10+r;
            n1 = n1.multiply(BigInteger.TEN).add(BigInteger.valueOf(r));
        }

        for (int i = 0; i <num2.length(); i++) {
            int r = num2.charAt(i) -'0';
//            n2= n2*10+r;
            n2 = n2.multiply(BigInteger.TEN).add(BigInteger.valueOf(r));
        }

        BigInteger result = n1.multiply(n2);
        if(result.equals(BigInteger.ZERO)) return "0";

        StringBuilder sb = new StringBuilder();
        while(result.compareTo(BigInteger.ZERO)>0){
//            char r = (char) (result%10+48);
//            sb.append(r);
//            result = result/10;

            BigInteger[] divAndRem = result.divideAndRemainder(BigInteger.TEN);
            int r = divAndRem[1].intValue();
            char digitchar = (char) (r+48);
            sb.append(digitchar);
            result = divAndRem[0];
        }

        return sb.reverse().toString();
    }
}