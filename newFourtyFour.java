package chapter6;

/**
 * Created by sihanwang on 2017/5/23.
 */
public class newFourtyFour {
    public static boolean isContinous(int[] A){
        if (A == null || A.length == 0){
            return false;
        }
        sort(A);
        int numOfZero = 0;
        int numOfInterval = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0){
                numOfZero++;
                continue;
            }
            //System.out.println(1);
            if (A[i] == A[i+1]){
                return false;
            }
            //System.out.println(2);
//            if (A[i+1] - A[i] - 1 != 0){
//                numOfInterval++;
//            }
            numOfInterval += A[i+1] - A[i] - 1;
            System.out.println(numOfInterval);

        }
        if (numOfZero >= numOfInterval){
            System.out.println("true");
            return true;
        }

        return false;
    }

    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i;(j>0) && (a[j] < a[j-1]);j--){
                exch(a,a[j],a[j-1]);
            }
        }
    }

    public static void exch(int[] A,int a,int b){
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }


    public static void main(String[] args) {
        int[] a = {4,3,1,2,5};
        isContinous(a);
    }
}
