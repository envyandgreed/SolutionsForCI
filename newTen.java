package base1;

/**
 * Created by sihanwang on 2017/5/3.
 */
public class newTen {
    public static int numOf(int n){
        int flag = 1;
        int count = 0;
        while(flag != 0){
            if ((n & flag) !=0){
                ++count;
            }
            flag = flag << 1;
        }
        //System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(10 & 1);
        numOf(9);
    }
}
