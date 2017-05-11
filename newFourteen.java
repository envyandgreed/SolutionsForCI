package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/9.
 */
public class newFourteen {
    public static void exchangeNum(int[] arr){
        if (arr.length == 0 || arr == null){
            return;
        }
        int lt = 0;
        int rt;
        while(lt<arr.length){
            while(lt< arr.length && isEven(arr[lt]) != true){
                lt++;
            }
            rt = lt+1;
            while(rt< arr.length && isEven(arr[rt]) == true ){
                rt++;
            }


            if (rt< arr.length){
                int temp = arr[rt];
                for (int j = rt -1;j>=lt;j--){
                    arr[j+1] = arr[j];
                }
                arr[lt++] = temp;
            }
        }
        return;
    }

    static  boolean isEven(int num){
        if ((num & 1)==  0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean A = false;
        A = isEven(201);
        System.out.println(A);
    }
}
