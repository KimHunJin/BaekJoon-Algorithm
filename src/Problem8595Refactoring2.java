import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-03-23.
 */
public class Problem8595Refactoring2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine(), 10);
        char cNum;
        int count = 0;
        long sum = 0;
        String number = "";
        for (int i = 0; i < loop; i++) {
            cNum = (char) br.read();
            if (cNum >= 48 && cNum <= 57) {
                if(number.length()>6) {
                    count -= number.length();
                } else {
                    number+= cNum;
                    count++;
                    if(i == loop-1) {
                        sum += Integer.parseInt(number);
                    }
                }
            } else {
                if(number.length()!=0 && number.length()<7) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }

        if(count < 2) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }
    }
}
