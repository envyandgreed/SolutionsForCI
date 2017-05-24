package chapter7;

/**
 * Created by sihanwang on 2017/5/23.
 */
public class newFourtyNine {
    public static int strToInt(String str){
        int length = str.length();
        if (str.equals("") || length == 0){
            return 0;
        }

        int result = 0;
        char ch = str.charAt(0);
        if (ch >= '0' && ch <= '9'){
            result += ch - '0';
        }else if (!(ch == '-' || ch == '+')){
            return 0;
        }

        for (int i = 1; i < length; i++){
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                return 0;
            }
            int value = str.charAt(i) - '0';
            result = result * 10 + value;
        }
        System.out.println(result);
        return (ch == '-')?-result:result;
    }

    public static void main(String[] args) {
        String str = "123";
        strToInt(str);
    }
}
