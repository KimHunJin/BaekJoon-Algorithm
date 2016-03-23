import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-13.
 */
public class Problem11722  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        int count = 0;
        int[] input = new int[t];
        int[] arrCount = new int[t];
        for(int i=0;i<t;i++) {
            input[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0;i<input.length;i++) {
            count = 0;
            max = input[i];
            count++;
            for(int j=i;j<input.length;j++) {
                if(max > input[j]) {
                    count++;
                    max = input[j];
                }
            }
            arrCount[i] = count;
        }

        for (int i=0;i<arrCount.length;i++) {
            System.out.println("i" + i + " : " + arrCount[i]);
        }
    }
}
