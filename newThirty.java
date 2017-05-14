package chapter3;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/5/14.
 */
public class newThirty {
    /*
    快排序是好的
     */
    public static int Partition(int[] arr,int start,int end){
        int i = start,j = end;
        if(start < end){

            int x = arr[start];
            while(i<j){
                while(i<j && arr[j] >= x){
                    j--;
                }
                if (i<j){
                    arr[i++] = arr[j];
                }
                while(i<j && arr[i] <= x){
                    i++;
                }
                if (i<j){
                    arr[j--] = arr[i];
                }
            }
            arr[i] = x;
            Partition(arr,start,i-1);
            Partition(arr,i+1,end);
        }
        return i;
    }

    public static void Kless(int[] input,int k,int[] output){
        if (input == null || input.length == 0){
            return;
        }
        int start = 0;
        int end = input.length -1;
        int index = Partition(input,start,end);
        if (index != k-1){
            if (index > k-1){
                end = index -1;
                index = Partition(input,start,end);

            }else {
                start = index +1;
                index = Partition(input,start,end);
            }
        }
        for (int i = 0;i<k;++i){
            output[i] = input[i];
        }
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,6,2,5,9,3};
        int[] b = new int[10];
        Kless(arr,3,b);
        //Partition(arr,0,5);

    }
}
