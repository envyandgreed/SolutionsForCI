package chapter8;

/**
 * Created by sihanwang on 2017/5/25.
 */
public class newFiftyThree {
    public boolean match(char[] str,char[] pattern){
        if (str == null || pattern == null){
            return false;
        }
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str,strIndex,pattern,patternIndex);
    }

    public boolean matchCore(char[] str,int strIndex,char[] pattern,int patternIndex){
        if (str.length == strIndex && pattern.length == patternIndex){
            return  true;
        }

        if (str.length != strIndex && pattern.length == patternIndex){
            return false;
        }


        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*'){
            if ((pattern[patternIndex] == '.' && strIndex != str.length) || (str.length != strIndex && pattern[patternIndex] == str[strIndex])){
                return matchCore(str,strIndex,pattern,patternIndex+2)
                        || matchCore(str,strIndex+1,pattern,patternIndex+2)
                        || matchCore(str,strIndex+1,pattern,patternIndex);
            }else {
                return matchCore(str,strIndex,pattern,patternIndex+2);
            }
        }

        if ((str.length != strIndex && pattern[patternIndex] == str[strIndex]) || (strIndex != str.length && pattern[patternIndex] == '.')){
            return matchCore(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;
    }
}
