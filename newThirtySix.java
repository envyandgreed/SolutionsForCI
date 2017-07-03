package chapter3;

/**
 * Created by sihanwang on 2017/5/18.
 */
public class newThirtySix {
    public int InversePairs(int [] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        
        int count = InversePairsCore(array,copy,0,array.length-1);
        return count;
    }
    
    public int InversePairsCore(int[] array,int[] copy,int low,int high){
        if(low == high){
            return 0;
        }
        
        int mid = low+(high-low)/2;
        int count = 0;
        int leftCount = InversePairsCore(array,copy,low,mid);
        int rightCount = InversePairsCore(array,copy,mid+1,high);
        int i = mid,j = high,index = high;
        while(i >= low && j > mid){
            if (array[i] > array[j]){
                count += j - mid;
                copy[index--] = array[i--];
            }else {
                copy[index--] = array[j--];
            }
        }
        
        while(i >= low){
            copy[index--] = array[i--];
        }
        
        while(j > mid){
            copy[index--] = array[j--];
        }
        
        //这里与默认的归并排序不同是因为，默认排序的临时数组是在第二个函数里创建的，长度为high-low+1，而这个数组长度为array.length，所以字节对应
        //位置放入数据即可。
        for (int k = low; k <= high; k++) {
            array[k] = copy[k];
        }
        
        return (leftCount + rightCount + count);
    }
}
