import java.util.Scanner;

/**
 * @Description
 *      字符串8位填充
 * @Date 2020/4/15 23:37
 * @Author zhouyq
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[2];
        for (int i = 0; i < 2; i++) {
            strs[i] = sc.next();
        }

        for (String str : strs) {
            int length = str.length();
            int times = length/8;
            for (int i = 0; i < times; i++) {
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
            if (str.length() > 0 ) {
                System.out.print(str);
                for (int i = 0; i < 8-str.length(); i++) {
                    System.out.print(0);
                }
                System.out.println();
            }
        }


    }
}
