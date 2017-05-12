package chapter3;

import java.util.Arrays;

/**
 * Created by sihanwang on 2017/5/11.
 */
public class newTwentyFour {
    public static boolean isBST(int[] seq){
        if (seq.length == 0){
            return false;
        }
        return isBSTtodo(seq,0,seq.length - 1);
    }

    public static boolean isBSTtodo(int[] seq, int start,int end){
        if (start >= end){
            return true;
        }

        int i = start;
        for (;i < end;i++){
            if (seq[i] > seq[end]){
                break;
            }
        }

        int j = i;
        for (;j < end;j++){
            if (seq[j] < seq[end]){
                return false;
            }
        }

        return isBSTtodo(seq,start,i -1 ) && isBSTtodo(seq,i,end -1);

    }
}
