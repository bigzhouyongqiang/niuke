import java.util.Scanner;

/**
 * @Description
 *  进制转换
 * @Date 2020/4/15 23:50
 * @Author zhouyq
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String hexStr = sc.next();
            hexStr = hexStr.toUpperCase();
            char[] chars = hexStr.toCharArray();
            double ret = 0;
            for (int i = chars.length-1, j = 0; i > 1; i--, j++) {
                int value;
                double result = 0;
                switch (chars[i]) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        value = Integer.valueOf(String.valueOf(chars[i]));
                        result = value*Math.pow(16,j);
                        break;
                    case 'A':
                        result = 10*Math.pow(16,j);
                        break;
                    case 'B':
                        result = 11*Math.pow(16,j);
                        break;
                    case 'C':
                        result = 12*Math.pow(16,j);
                        break;
                    case 'D':
                        result = 13*Math.pow(16,j);
                        break;
                    case 'E':
                        result = 14*Math.pow(16,j);
                        break;
                    case 'F':
                        result = 15*Math.pow(16,j);
                        break;
                }
                ret = ret+result;
            }
            System.out.println((int)ret);
        }

    }
}
