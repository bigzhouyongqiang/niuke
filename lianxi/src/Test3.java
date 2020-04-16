import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Description
 *      去重、排序
 * @Date 2020/4/15 22:26
 * @Author zhouyq
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){

                int num = sc.nextInt();
                TreeSet<Integer> set = new TreeSet<Integer>();
                for(int i = 0 ; i < num ;i++){
                    int curr = sc.nextInt();
                    set.add(curr);
                }
                for(Integer i : set){
                    System.out.println(i);
                }
            }

        } catch (Exception e) {
        }
    }
}
