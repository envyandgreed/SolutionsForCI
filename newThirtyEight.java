package chapter3;

/**
 * Created by sihanwang on 2017/5/19.
 */
public class newThirtyEight {
    public static int getFirstNum(int[] array,int k,int start,int end){
        if (start > end){
            return  -1;
        }

        int mid = (start + end) / 2;
        int midData = array[mid];


        if (midData == k){
            if ((mid > 0 && array[mid - 1] != k )|| mid == 0){
                return mid;
            }else{
                end = mid - 1;
            }

        }else if (midData > k){
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        return getFirstNum(array,k,start,end);
    }


    public static int getEndNum(int[] array,int k,int start,int end){
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        int midData = array[mid];

        if (midData == k){
            if ((mid < array.length - 1 && array[mid + 1] != k) || mid == array.length - 1){
                return mid;
            }else {
                start = mid + 1;
            }
        }else if (midData > k){
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        return getEndNum(array,k,start,end);
    }


    public static int getFinalNum(int[] array,int k){
        int num = 0;
        if (array != null && array.length > 0){
            int fist = getFirstNum(array,k,0,array.length - 1);
            int end = getEndNum(array,k,0,array.length - 1);

            if (fist > -1 && end > -1){
                num = end - fist + 1;
            }

        }
        System.out.println(num);
        return  num;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5};
        getFinalNum(a,3);
    }
}
