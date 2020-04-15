import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  计算字符串最后一位单词的长度
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
            System.out.println(str.substring(str.lastIndexOf(" ")+1).length());
        } catch (Exception e) {
        }
    }
}
