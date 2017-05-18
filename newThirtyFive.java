package chapter3;

/**
 * Created by sihanwang on 2017/5/17.
 */
public class newThirtyFive {
    public static char firstNoRepeat(String str){
        if (str.length() == 0 || str == null){
            return str.toCharArray()[0];
        }
        char res = 0;
        char standard = 'a';
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - standard]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - standard] == 1){
                res = str.charAt(i);
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String A = "abaccdeff";
        firstNoRepeat(A);
    }
}
