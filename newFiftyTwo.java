package chapter8;

/**
 * Created by sihanwang on 2017/5/25.
 */
public class newFiftyTwo {
    public static  int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];
        if (length != 0){
            B[0] = 1;
            for (int i = 1; i < length; i++) {
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            for (int j = length-2;j>=0;j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(B[i] + " ");

        }
        return B;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        multiply(a);
    }
}
