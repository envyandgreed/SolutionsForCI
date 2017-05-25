package chapter8;

/**
 * Created by sihanwang on 2017/5/25.
 */
public class newFiftyTwo {
    public static  int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];
        B[0] = 1;
        for (int i = 0; i < length; i++) {
            B[i] = B[i-1]*A[i-1];
        }
        int a = A[length - 1];
        for (int i = length-2; i >= 0; i--) {
            B[i] *= a;
            a *= A[i];
        }
        return B;
    }
}
