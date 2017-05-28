package chapter8;

/**
 * Created by sihanwang on 2017/5/25.
 */
public class newFiftyFour {
    public boolean isNumeric(char[] str){
        int length = str.length;
        int index = 0;

        if (length == 0 || str == null){
            return false;
        }

        while(index < length && str[index] == ' '){
            index++;
        }
        while(str[length - 1] == ' '){
            index--;
        }


        if (str[index] == '-' || str[index] == '+'){
            index++;
        }
        if (index == length){
            return false;
        }


        if (index < length && str[index] >= '0' && str[index] <= '9'){
                index++;
        }

        if (index == length){
            return  true;
        }

        if (str[index] == '.'){
            index++;
            if (index == length){
                return true;
            }
            while(index < length && str[index] >= '0'&& str[index] <= '9'){
                index++;
            }
            if (index == length){
                return  true;
            }
        }

        if (str[index] == 'e' || str[index] == 'E'){
            index++;
            if (index == length){
                return false;
            }
            if (str[index] == '-' || str[index] == '+'){
                index++;
            }
            while(index < length && str[index] >= '0'&& str[index] <= '9'){
                index++;
            }
            if (index == length){
                return  true;
            }
        }
        return false;
    }

}
