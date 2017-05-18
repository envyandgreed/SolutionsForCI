package chapter3;

/**
 * Created by sihanwang on 2017/5/17.
 */
public class newThirtyThree {
    public static void sumMin(int[] A){
        if (A == null || A.length == 0){
            return;
        }
        String[] str = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            str[i] = Integer.toString(A[i]);
        }

        sort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }

    public static void sort(String[] B){
        for (int i = 1; i < B.length; i++) {
            for (int j = i; j > 0 && less(B[j],B[j-1]); j--) {
                exch(B,j,j-1);
            }
        }
    }


    public static boolean less(String a,String b){
        String ab = a + b;
        String ba = b + a;
        if (ab.compareTo(ba) > 0){
            return false;
        }else{
            return true;
        }
    }

    private static void exch(String[] a, int i, int j){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3,32,321};
        sumMin(a);
    }
}
