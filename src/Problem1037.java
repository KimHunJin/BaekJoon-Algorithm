import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-08-19.
 *
 * Problem
 * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아닐 때이다.
 * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
 *
 * Input
 * 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다.
 * 둘째 줄에는 N의 진짜 약수가 주어진다.
 * 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
 *
 * Output
 * 첫째 줄에 N을 출력한다.
 *
 * Example
 *
 * Input        Output
 * 2            8
 * 4 2
 */
public class Problem1037 {
    BufferedReader br;
    public static void main(String[] args) throws Exception{
        Problem1037 main = new Problem1037();
        main.solve();
    }

    public int iRead() throws Exception {
        return Integer.parseInt(readWord());
    }

    public int iChange(String a) throws Exception {
        return Integer.parseInt(a);
    }

    void solve() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        int count = iRead();
        int init = iRead();
        int max, min;
        max = init;
        min = init;
        for(int i=1;i<count;i++) {
            int readNum = iRead();
            if(max < readNum) {
                max = readNum;
            }
            if(min > readNum) {
                min = readNum;
            }
        }

        System.out.println(max * min);
    }

    public String readWord() throws IOException {
        StringBuilder b = new StringBuilder();
        int c;
        c = br.read();
        while (c >= 0 && c <= ' ')
            c = br.read();
        if (c < 0)
            return "";
        while (c > ' ') {
            b.append((char) c);
            c = br.read();
        }
        return b.toString();
    }
}
