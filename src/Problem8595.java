import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-19.
 */
public class Problem8595 {
    public static void main(String[] args) throws IOException{
        String number = "";
        int count = 0;
        int start = 0;
        int end = 0;
        long sum = 0;
        boolean isCheck = false;

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int loop = Integer.parseInt(br.readLine() ,10);
//        String text = br.readLine();

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String text = sc.next();

        for (int i = 0; i < loop; i++) {
            char cNum = text.charAt(i);
            number = "";
            if (cNum >= 48 && cNum <= 57) {
                count++;
                if(isCheck == false) {
                    start = i;
                    isCheck = true;
                }
                if(isCheck == true && i==loop-1) {
                    if(loop - start > 6) {
                        count = count-(start - loop);
                    } else {
                        for (int j = start; j < loop; j++) {
                            number += text.charAt(j);
                        }
                        sum += Integer.parseInt(number);
                    }

                }
            } else {
                if(isCheck == true) {
                    end  = i;
                    if(end-start > 6) {
                        count = count - (end - start);
                    } else {
                        for (int j = start; j < end; j++) {
                            number += text.charAt(j);
                        }
                        sum += Integer.parseInt(number);
                    }
                    isCheck = false;

                }
            }
        }
        if(count <2) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }
    }
}
