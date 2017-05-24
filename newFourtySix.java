package chapter6;

/**
 * Created by sihanwang on 2017/5/23.
 */
public class newFourtySix {
    public static int sumTemp(int n){
        int sum = 0;
        int a = 0;
        boolean temp = ((n>0) && a == (sum = sumTemp(n-1)+n));
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        sumTemp(10);
    }
}
