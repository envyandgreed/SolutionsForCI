package base1;

import static base1.Solution.replaceSpace;

/**
 * Created by sihanwang on 2017/4/27.
 */
public class newFour {
    public static char[] replaceBlank(char[] string, int length){
        if (string == null || length == 0){
            return null;
        }
        int originLength = 0;
        int numBlank = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == '\0'){
                break;
            }
            originLength++;
            if (string[i] == ' '){
                numBlank++;
            }
        }
        int newLength = originLength + numBlank * 2;
        if (newLength > length){
            return null;
        }

        int P1 = originLength;
        int P2 = newLength;
        //System.out.println(P1+" 你好"+P2);
        while(P1 >= 0 && P1 < P2){
            if (string[P1] == ' '){
                string[P2 --] = '0';
                string[P2 --] = '2';
                string[P2 --] = '%';
            }else{
                string[P2--] = string[P1];
            }
            P1--;
        }
        return string;
    }
    public static void main(String[] args) {
        StringBuffer stb = new StringBuffer();
        stb.append("we are happy!");
        String res = replaceSpace(stb);
        for (int i = 0; i < res.toCharArray().length; i++) {
            System.out.print(res.toCharArray()[i]);
        }
    }

}

// The second solution

class Solution {
    public static String replaceSpace(StringBuffer str) {
        int spaceNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                spaceNum++;
            }
        }
        int originIndex = str.length() - 1;
        int newLength = originIndex + 2 * originIndex;
        int newIndex = newLength - 1;
        System.out.println(str);

        str.setLength(newLength);
        System.out.println(str);
        for (;originIndex >= 0 && originIndex < newLength; originIndex--){
            if (str.charAt(originIndex) == ' '){
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }else{
                str.setCharAt(newIndex--,str.charAt(originIndex));
            }
        }
        return str.toString();
    }

    public static String replaceFinal(StringBuffer str){
        return str.toString().replaceAll("\\s","%20");
    }
}