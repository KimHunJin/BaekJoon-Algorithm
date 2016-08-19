import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-05-12.
 */
public class Problem10219 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine(),10);
        for(int loop=0; loop < max;loop++) {
            String a[] = br.readLine().split(" ");
            int row = Integer.parseInt(a[0]); // 3
            int col = Integer.parseInt(a[1]); // 4
            char form[][] = new char[row][col];

            for(int i=0;i<row;i++) {
                String str = br.readLine();
                for(int j=0;j<col;j++) {
                    form[i][col-j-1] = str.charAt(j);
                 }
            }

            for(int i=0;i<row;i++) {
                for(int j=0;j<col;j++) {
                    System.out.print(form[i][j]);
                }
                System.out.println();
            }
        }
    }
}
