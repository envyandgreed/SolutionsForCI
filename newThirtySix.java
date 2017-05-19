package chapter3;

/**
 * Created by sihanwang on 2017/5/18.
 */
public class newThirtySix {
    int count = 0;
    public int InversePairs(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        mergeUp(array,0,array.length - 1);
        return count;
    }

    public void mergeUp(int[] A,int start,int end){
        if (start >= end){
            return;
        }
        int mid = (end + start)>>1;
        mergeUp(A,start,mid);
        mergeUp(A,mid+1,end);
        mergeDown(A,start,mid,end);
    }

    public void mergeDown(int[] A,int start,int mid,int end){
        int[] temp= new int[end-start+1];
        int i = start, j = mid + 1,index = 0;
        while(i <= mid && j <= end){
            if (A[i] > A[j]){
                temp[index++] = A[j++];
                count += mid - i + 1;
            }else{
                temp[index++] = A[i++];
            }
        }
        while(i <= mid) temp[index++] = A[i++];
        while(j <= end) temp[index++] = A[j++];
        for (int k = 0; k < temp.length; k++) {
            A[start+k] = temp[k];
        }
    }
}
