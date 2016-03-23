import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-14.
 *
 * 7 = 44
 * 7 = 1 + 1 + 1 + 1 + 1 + 1 + 1 / 1
 * 7 = 2 + 1 + 1 + 1 + 1 + 1 / 6
 * 7 = 3 + 1 + 1 + 1 + 1 / 5
 * 7 = 2 + 2 + 1 + 1 + 1 / 10
 * 7 = 2 + 2 + 3 / 3
 * 7 = 2 + 2 + 2 + 1 / 4
 * 7 = 3 + 2 + 1 + 1 / 12
 * 7 = 3 + 3 + 1 / 3
 *
 * 6 = 23
 * 6 = 1 + 1 + 1 + 1 + 1 + 1 / 1
 * 6 = 2 + 1 + 1 + 1 + 1 / 5
 * 6 = 2 + 2 + 1 + 1 / 6
 * 6 = 3 + 1 + 1 + 1 / 3
 * 6 = 3 + 2 + 1 / 6
 * 6 = 2 + 2 + 2  / 1
 * 6 = 3 + 3 / 1
 *
 *5 = 13
 * 5 = 1 + 1 + 1 + 1 + 1 / 1
 * 5 = 2 + 1 + 1 + 1 / 4
 * 5 = 3 + 1 + 1 / 3
 * 5 = 2 + 2 + 1 / 3
 * 5 = 3 + 2 / 2
 *
 * 4 = 7
 * 4 = 1 + 1 + 1 + 1  / 1
 * 4 = 2 + 1 + 1  / 3
 * 4 = 3 + 1 / 2
 * 4 = 2 + 2 / 1
 *
 * 3 = 4
 * 3 = 1 + 1 + 1 /1
 * 3 = 2 + 1 / 2
 * 3 = 3 / 1
 *
 * 2 = 2
 * 2 = 1 + 1
 * 2 = 2
 *
 * 1 = 1
 * 1 = 1
 *
 */
public class Problem9095 {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bf.readLine(),10);

        while (number-- >0) {
            int numCase = Integer.parseInt(bf.readLine(),10);

        }

    }
}
