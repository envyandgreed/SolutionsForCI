package chapter3;

/**
 * Created by sihanwang on 2017/5/13.
 */
public class newTwentyNine {
    public static int morethanhalf(int[] arr){
        if (arr.length == 0 || arr == null){
            System.out.println("array is invalid");
            return -1;
        }

        int res = arr[0];
        int times = 1;
        int counts =0;
        for (int i = 1;i<arr.length;i++){
            if (times == 0){
                res = arr[i];
                times =1;
            }else if (res == arr[i]){
                times++;
            }else{
                times--;
            }
        }

        for (int j =0;j<arr.length;j++){
            if (res == arr[j]){
                counts++;
            }
        }
        if (counts * 2 <= arr.length){
            System.out.println("None");
            return -1;
        }else{
            System.out.println(res);
            return res;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        morethanhalf(arr);
    }

}
