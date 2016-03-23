import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-03-20.
 */
public class Problem8595Refactoring {
    public static void main(String[] args) throws IOException{
        String numbe = "";
        long sum = 0;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine() , 10);
        String text = br.readLine();
        for(int i=0;i<loop;i++) {
            char cNum = text.charAt(i);
            if (cNum >= 48 && cNum <= 57) {
                if(numbe.length()>6) {
                    count -= numbe.length();
                } else {
                    numbe+= cNum;
                    count++;
                    if(i == loop-1) {
                        sum += Integer.parseInt(numbe);
                    }
                }

            } else {
                if(numbe.length()!=0 && numbe.length()<7) {
                    sum+=Integer.parseInt(numbe);
                    numbe = "";
                } else if(numbe.length() > 6) {
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
