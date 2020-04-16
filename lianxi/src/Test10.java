import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description
 *   编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，
 *   换行表示结束符，不算在字符里。不在范围内的不作统计。
 * @Date 2020/4/16 23:21
 * @Author zhouyq
 */
public class Test10 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        for (int i=0; i < chars.length; i++) {
            if (chars[i] < 0  && chars[i] > 127) {
                continue;
            }
            if (list.contains(chars[i])) {
                continue;
            }
            list.add(chars[i]);
        }
        System.out.println(list.size());
    }
}
