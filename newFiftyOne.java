package chapter8;

/**
 * Created by sihanwang on 2017/5/24.
 */
public class newFiftyOne {
    public static boolean duplicate(int[] A){
        if (A == null || A.length == 0){
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 || A[i] > A.length - 1){
                return false;
            }
        }
        int res = 0;
        for (int i = 0;i < A.length;i++){
            while(A[i] != i){
                if (A[i] == A[A[i]]){
                    res = A[i];
                    System.out.println(res);
                    return true;
                }
                int temp = A[i];
                A[i] = A[A[i]];
                A[A[i]] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {0,2,2,3,4,5,5};
        duplicate(a);
    }
}
