import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by HunJin on 2016-03-28.
 */
public class Problem11947 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine(),10);

        while (loop-- > 0) {
            Long number = Long.parseLong(br.readLine(),10);
            long len = (long)Math.pow(10, number.toString().length());
            BigInteger result;
            if(number < len / 2) {
                len = len - 1 - number;
                result = new BigInteger(""+number);
                result = result.multiply(new BigInteger(""+len));
            } else {
                result = new BigInteger(""+len/2);
                len = len - 1 - len/2;
                result = result.multiply(new BigInteger(""+len));
            }
            System.out.println(result);
        }
    }
}
