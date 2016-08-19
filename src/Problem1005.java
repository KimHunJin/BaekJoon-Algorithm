import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by HunJin on 2016-08-09.
 */
public class Problem1005 {

    static int[][] buildRoot;
    static int[] buildingTime;

    public static void main(String[] args) throws Exception {
        int testCase, buildingNumber, buildingPriority;
        String[] buildingGarbage;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine().toString(), 10);

        for (int loop = 0; loop < testCase; loop++) {
            buildingGarbage = br.readLine().split(" "); // 공백 기준으로 숫자 구분
            buildingNumber = Integer.parseInt(buildingGarbage[0]); // 건물 개수
            buildingPriority = Integer.parseInt(buildingGarbage[1]); // 건물 빌드 순서 개수


            buildingGarbage = br.readLine().split(" ");
            buildingTime = new int[buildingGarbage.length]; // 각 건물의 지어지는 시간
            for (int i = 0; i < buildingGarbage.length; i++) {
                buildingTime[i] = Integer.parseInt(buildingGarbage[i]);
            }

            buildRoot = new int[buildingNumber][buildingNumber];

            for(int i=0;i<buildingPriority;i++) {
                buildingGarbage = br.readLine().split(" ");
//                System.out.println(buildingGarbage[0] + " : " + buildingGarbage[1]);
                buildRoot[Integer.parseInt(buildingGarbage[0])-1][Integer.parseInt(buildingGarbage[1])-1]++;
            }

            int findNumber = Integer.parseInt(br.readLine().toString(),10)-1; // 찾고자 하는 숫자 -1 (why? 배열에는 0부터 저장되거든)

            for(int i=0;i<buildRoot.length;i++) {
                for(int j=0;j<buildRoot[i].length;j++) {
                    System.out.print(buildRoot[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            for(int i=buildRoot.length-1;i>=0;i--) {
                for(int j=buildRoot[i].length-1;j>=0;j--) {
                    System.out.print(buildRoot[i][j] + " ");
                }
                System.out.println();
            }

            loop(findNumber);

            System.out.println();

            for (int i=0;i<arr.size();i++) {
                System.out.println(arr.get(i));
            }
        }
    }
    static ArrayList arr = new ArrayList();
    static int sum = 0;
    static int loop(int number) {



        sum = buildingTime[number];
        sum = loop2(number);



        return sum;
    }

    static int loop2(int number) {
        int i;
        for(i=buildRoot[number].length-1;i>=0;i--) {
            if(buildRoot[i][number] == 1) {
                // System.out.println("i : " + (number+1) + " j : " + (i+1));
                System.out.println("sum : " + sum + " | number : " + (number+1) + " |  i : " + (i+1));
                sum += buildingTime[i] + loop2(i);
                if(i==0) {
                    System.out.println(sum);
                    arr.add(sum);


                }
            }
        }
        return sum;
    }
}
