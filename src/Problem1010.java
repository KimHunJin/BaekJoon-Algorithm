import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-02-22.
 */
public class Problem1010 {
    public static void main(String[] args) throws Exception{
        int loop;
        double inputA, inputB;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        loop = Integer.parseInt(br.readLine(), 10);
        for(int i=0;i<loop;i++) {
            double result = 1;
            String[] garbage = br.readLine().split(" ");
            inputA = Long.parseLong(garbage[0]);
            inputB = Long.parseLong(garbage[1]);

            inputA = Math.min(inputA,inputB-inputA); // 루프를 하나라도 줄이기 위함 : 5C3 = 5C2
            double k = inputA;
            for(int j=0;j<k;j++) {
                result = result * (inputB / inputA); // 오버플로우 해결을 위해 바로바로 계산을 함
                inputB--;
                inputA--;
            }
            System.out.println(Math.round(result));
        }
    }
}
