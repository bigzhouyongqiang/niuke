import java.util.*;

/**
 * @Description
 *  合并记录， 使用TreeMap（自带排序）
 * @Date 2020/4/16 22:38
 * @Author zhouyq
 */
public class Test8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.valueOf(sc.nextLine());

        while (sc.hasNext()) {
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < count; i++) {
                String str = sc.nextLine();
                String[] strs = str.split(" ");
                if (map.containsKey(Integer.valueOf(strs[0]))) {
                    int temp = map.get(Integer.valueOf(strs[0]));
                    temp += Integer.valueOf(strs[1]);
                    map.put(Integer.valueOf(strs[0]), temp);
                } else {
                    map.put(Integer.valueOf(strs[0]), Integer.valueOf(strs[1]));
                }
            }
            for (Map.Entry<Integer, Integer> s : map.entrySet()) {
                System.out.print(s.getKey() + " ");
                System.out.println(s.getValue());
            }
        }


    }
}
