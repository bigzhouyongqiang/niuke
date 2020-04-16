
import java.util.*;

/**
 * @Description
 *      提取不重复整数，逆序（不是排序，字符串的逆序）输出
 * @Date 2020/4/16 23:10
 * @Author zhouyq
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] chars = in.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = chars.length-1; i >= 0; i--) {
            if (!list.contains(chars[i]))
                list.add(chars[i]);
        }

        for (Character s: list) {
            System.out.print(s);
        }


    }
}
