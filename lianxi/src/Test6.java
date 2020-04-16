import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2020/4/16 20:55
 * @Author zhouyq
 */
public class Test6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 2;
        while (number != 1) {
            while (number % i == 0){
                System.out.print(i + " ");
                number = number / i;
            }
            i = i + 1;
        }


        // 时间不过关
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            long value = scanner.nextLong();
//            List<Long> list = new ArrayList();
//            boolean fl = false;
//            long v = 2;
//            fa:
//            while (true) {
//                while (true) {
//                    if ((value % v) != 0) {
//                        break;
//                    }
//                    value = value / v;
//                    list.add(v);
//                    if (isOk(value)) {
//                        list.add(value);
//                        for (long ret : list) {
//                            System.out.print(ret+" ");
//                        }
//                        break fa;
//                    }
//                }
//                v = getNext(v);
//            }
//
//
//        }

    }

    static  long getNext(long value){
       while(true) {
           value = value+1;
           long i = value -1;
           for (; i > 1; i--) {
               if ((value % i) == 0 ) {
                   break;
               }
           }

           if (i == 1) {
               return value;
           }

       }
    }

    static boolean isOk(long value){
        long i = value -1;
        for (; i > 1; i--) {
            if ((value % i) == 0 ) {
                break;
            }
        }

        if (i == 1) {
            return true;
        }
        return  false;
    }

}
