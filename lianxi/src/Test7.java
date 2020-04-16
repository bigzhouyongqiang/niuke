import java.util.Scanner;

/**
 * @Description
 *   四舍五入
 * @Date 2020/4/16 22:27
 * @Author zhouyq
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if (Integer.valueOf(str.substring(str.indexOf(".")+1,str.indexOf(".")+2)) >= 5) {
            System.out.println((int)(Float.valueOf(str)+1));
        } else {
            System.out.println((int)(Float.valueOf(str)+0));
        }
    }
}
