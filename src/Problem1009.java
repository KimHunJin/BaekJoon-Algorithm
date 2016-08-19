import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by HunJin on 2016-05-18.
 */
public class Problem1009 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine(),10);

        for(int a = 0; a<loop;a++) {
            String[] str = br.readLine().split(" ");
            int num = Integer.parseInt(str[0]);
            int count = Integer.parseInt(str[1]);
            switch (num%10) {
                case 1 : {
                    System.out.println(1);
                    break;
                }
                case 2 : {
                    switch (count%4) {
                        case 1 : {
                            System.out.println(2);
                            break;
                        }
                        case 2 : {
                            System.out.println(4);
                            break;
                        }
                        case 3 : {
                            System.out.println(8);
                            break;
                        }
                        case 0 : {
                            System.out.println(6);
                            break;
                        }
                    }
                    break;
                }
                case 3 : {
                    switch (count%4) {
                        case 1 : {
                            System.out.println(3);
                            break;
                        }
                        case 2 : {
                            System.out.println(9);
                            break;
                        }
                        case 3 : {
                            System.out.println(7);
                            break;
                        }
                        case 0 : {
                            System.out.println(1);
                            break;
                        }
                    }
                    break;
                }
                case 4 : {
                    switch (count%2) {
                        case 1 : {
                            System.out.println(4);
                            break;
                        }
                        case 0 : {
                            System.out.println(6);
                            break;
                        }
                    }
                    break;
                }
                case 5 : {
                    System.out.println(5);
                    break;
                }
                case 6 : {
                    System.out.println(6);
                    break;
                }
                case 7 : {
                    switch (count%4) {
                        case 1 : {
                            System.out.println(7);
                            break;
                        }
                        case 2 : {
                            System.out.println(9);
                            break;
                        }
                        case 3 : {
                            System.out.println(3);
                            break;
                        }
                        case 0 : {
                            System.out.println(1);
                            break;
                        }
                    }
                    break;
                }
                case 8 : {
                    switch (count%4) {
                        case 1 : {
                            System.out.println(8);
                            break;
                        }
                        case 2 : {
                            System.out.println(4);
                            break;
                        }
                        case 3 : {
                            System.out.println(2);
                            break;
                        }
                        case 0 : {
                            System.out.println(6);
                            break;
                        }
                    }
                    break;
                }
                case 9 : {
                    switch (count%2) {
                        case 1 : {
                            System.out.println(9);
                            break;
                        }
                        case 0 : {
                            System.out.println(1);
                            break;
                        }
                    }
                    break;
                }
                case 0 : {
                    System.out.println(10);
                    break;
                }
            }
        }
    }
}
