package chapter6;

/**
 * Created by sihanwang on 2017/5/23.
 */
public class newFourtySeven {
    public static int addTwo(int num1,int num2){
        while(num2 != 0){
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        System.out.println(num1);
        return num1;
    }

    public static void main(String[] args) {
        addTwo(5,7);
    }
}
