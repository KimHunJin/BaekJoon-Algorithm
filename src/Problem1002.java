import java.util.Scanner;

/**
 * Created by HunJin on 2016-02-16.
 *
 * fail
 */
public class Problem1002 {
    public static void main(String[] args) {
        int T,x1, y1, r1, x2, y2, r2;
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i=0;i<T;i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();

            double ab = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
            double ac = r1;
            double bc = r2;

            double min1, min2;

            double max = ab;
            if(max<ac) {
                min1 = max;
                max = ac;
            } else {
                min1 = ac;
            }
            if(max<bc) {
                min2 = max;
                max = bc;
            } else {
                min2 = bc;
            }

            if(max > min1+min2) {
                System.out.println(0);
            } else if(Math.abs((ac+bc))==ab) {
                System.out.println(1);
            } else if(x1==x2&&y1==y2&&r1==r2) {
                System.out.println(-1);
            } else{
                System.out.println(2);
            }
        }
    }
}
