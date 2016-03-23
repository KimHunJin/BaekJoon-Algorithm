import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-16.
 *
 * >o< : 60 111 62
 * vo^ : 118 111 94
 *
 */
public class Problem2508Refactoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().toString().trim());
        for(int loop=0;loop<t;loop++) {
            sc.nextLine();
            int height; int width;
            int count = 0;

            String[] line = sc.nextLine().toString().trim().split(" ");

            height = Integer.parseInt(line[0]);
            width = Integer.parseInt(line[1]);
            int[][] arrCase = new int[height][width];

            for (int i = 0; i < height; i++) {
                char[] abc = sc.nextLine().toCharArray();
                for (int j = 0; j < width; j++) {
                    arrCase[i][j] = abc[j];
                }
            }

            if(width<3 && height<3) {
                count = 0;
            } else if(width>2 && height<3){
                for(int i=0;i<height;i++) {
                    for(int j=0;j<width-2;j++) {
                        if (arrCase[i][j] == 62 && arrCase[i][j + 1] == 111 && arrCase[i][j + 2] == 60) {
                            count++;
                        }
                    }
                }
            } else if(width<3 && height>2) {
                for(int i=0;i<height-2;i++) {
                    for(int j=0;j<width;j++) {
                        if (arrCase[i][j] == 118 && arrCase[i+1][j] == 111 && arrCase[i+2][j] == 94) {
                            count++;
                        }
                    }
                }
            } else {
                for (int i = 0; i <height; i++) {
                    for (int j = 0; j < width; j++) {
                        if(j+2<width) {
                            if (arrCase[i][j] == 62 && arrCase[i][j + 1] == 111 && arrCase[i][j + 2] == 60) {
                                count++;
                            }
                        }
                        if(i+2<height) {
                            if (arrCase[i][j] == 118 && arrCase[i+1][j] == 111 && arrCase[i+2][j] == 94) {
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
