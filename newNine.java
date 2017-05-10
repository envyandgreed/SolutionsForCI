package base1;

/**
 * Created by sihanwang on 2017/5/3.
 */
public class newNine {
    public static int Fibonacci(int n){
        int[] res = {0,1};
        if (n <= 1){
            return res[n];
        }
        int paraOne = 1;
        int paraTwo = 0;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = paraOne + paraTwo;
            paraTwo = paraOne;
            paraOne = sum;
        }
        return n;
    }
    public static int jumpFloor(int n){
        if (n<=2){
            return n;
        }
        int paraOne = 2;
        int paraTwo = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = paraOne + paraTwo;
            paraTwo = paraOne;
            paraOne = sum;
        }
        return n;
    }
    public static int JumpII(int n){
        if (n<=2){
            return n;
        }
        return 2 * JumpII(n-1);
    }
}
