/**
 * Created by HunJin on 2016-04-02.
 */
public class Problem10944 {
    public static void main(String[] args) {
        int coumt = 0;

        while (true) {
            int number = (int)(Math.random()*10000)+1;
            if(number == 1247) {
                System.out.println(number);
                System.out.println(coumt);
                break;
            }
            else {
                coumt++;
            }
        }
    }
}
