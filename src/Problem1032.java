import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-08-13.
 */
public class Problem1032 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine(), 10);
        StringBuffer pattern = new StringBuffer(br.readLine());
        for(int i=1;i<number;i++) {
            String test = br.readLine();
            for(int j=0;j<pattern.length();j++) {
                if(pattern.charAt(j)!=test.charAt(j)) {
                    pattern.replace(j,j+1,"?");
                }
            }
        }
        System.out.println(pattern);
    }
}
