package chapter3;

/**
 * Created by sihanwang on 2017/5/15.
 */
public class newThirtyOne {
    public static int maxSum(int[] a){
        if (a == null || a.length ==0){
            return 0;
        }
        int currentSum =0;
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0;i<a.length;i++){
            if (currentSum <= 0){
                currentSum = a[i];
            }else {
                currentSum += a[i];
            }
            if (currentSum > finalSum){
                finalSum = currentSum;
            }
        }
        return finalSum;

    }


    public static void main(String[] args) {
        int[] a = {1,-2,3,10,-4,7,2,-5};
        int b = maxSum(a);
        System.out.println(b);
    }
}
