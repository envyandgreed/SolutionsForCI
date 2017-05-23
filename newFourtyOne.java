package chapter6;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/5/21.
 */
public class newFourtyOne {
    public  static void findNum(int[] data,int k){
        if (data == null || data.length == 0){
            return;
        }
        int start = 0;
        int end = data.length - 1;
        while(end > start){
            int sum = data[start] + data[end];
            if (sum > k){
                end--;
            }else if (sum < k){
                start++;
            }else {
                System.out.println("result:" + data[start] + " and "+ data[end]);
                break;
            }
        }
    }


    public static void findSequence(int s){
        int mid = (1 + s)/2;
        int start = 1;
        int end = 2;
        if (s < 3){
            return;
        }
        int sum = start + end;

        while(start < mid){
            if (sum < s){
                end++;
                sum += end;
            }else if (sum > s){
                sum -= start;
                start++;
            }else {
                printArray(start,end);
                end++;
                sum += end;
            }

        }
    }

    public static void printArray(int start,int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] a = {1,2,4,7,11,15};
//        findNum(a,15);
        findSequence(15);
    }
}
