    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    /**
     * @Description
     *   计算字符包含的个数
     * @Date 2020/4/15 22:07
     * @Author zhouyq
     */
    public class Test2 {
        public static void main(String[] args) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = bufferedReader.readLine();
                String cha = bufferedReader.readLine();
                str =  str.toLowerCase();
                cha = cha.toLowerCase();
                int count = 0;
                while (str.length() >= 1) {
                    if (str.indexOf(cha) > -1) {
                        count++;
                        str = str.substring(str.indexOf(cha)+1);
                    } else {
                        break;
                    }
                }
                System.out.println(count);
            } catch (Exception e) {
            }
        }
    }
