import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-13.
 *
 * ASCII
 * . : 46
 * o : 111
 * < : 60
 * > : 62
 * v : 118
 * ^ : 94
 *
 * >o< : 62 111 60
 */
public class Problem2508 extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().toString().trim());

        for(int p=0;p<t;p++) {
            int count = 0;
            sc.nextLine();
            String ab = sc.nextLine();

            String a[] = ab.split(" ");
            int r = Integer.parseInt(a[0]);
            int c = Integer.parseInt(a[1]);

            String[] input = new String[r];

            for(int i=0;i<r;i++) {
                input[i] = sc.nextLine().trim();
                for(int j=0;j<c;j++) {
                    if(c>=3) {
                        String test = input[i].substring(j, j + 3).trim();
                        if(test.equals(">o<")) {
                            count++;
                        }
                        if(j+3 == c) {
                            break;
                        }
                    }
                }
            }

            for(int j=0;j<c;j++) {
                String dd = "";
                for (int i = 0; i < r; i++) {
                    dd += input[i].substring(j, j+1).trim();
                }

                for(int k=0;k<dd.length();k++) {
                    if (dd.length() >= 3) {
                        String test = dd.substring(k, k + 3).trim();
                        if (test.equals("vo^")) {
                            count++;
                        }
                        if (k + 3 == r) {
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
