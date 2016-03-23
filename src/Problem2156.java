import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-17.
 */
public class Problem2156 {
    public static void main(String[] args) throws Exception{

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(sc.readLine(), 10);

        int[][] disMax = new int[number][2];
        int b = 0;

        for (int i=0;i<number;i++) {
            int a = Integer.parseInt(sc.readLine(), 10);
            if(i == 0) {
                b = a;
                disMax[i][1] = a;
                disMax[i][0] = a;
            }
            else if(i == 1) {
                disMax[i][0] = a;
                a = a+b;
                disMax[i][1] = Math.max(disMax[i][0],a);
            }
            else if(i > 1) {
                disMax[i][0] = a+disMax[i-2][1];
                a = a+disMax[i-1][0];
                disMax[i][1] = Math.max(Math.max(a,disMax[i][0]),disMax[i-1][1]);
            }
        }

        System.out.println(disMax[number-1][1]);
    }
}
