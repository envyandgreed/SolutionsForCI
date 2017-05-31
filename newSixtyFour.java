package chapter8;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by sihanwang on 2017/5/31.
 */
public class newSixtyFour {
    int count;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });



    public void Insert(Integer num) {
        count++;
        if ((count & 1) == 0){
            if (!maxHeap.isEmpty() && num < maxHeap.peek()){
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        }else{
            if (!minHeap.isEmpty() && num > minHeap.peek()){
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }

    }
//
//    public Double GetMedian() {
//        if (count == 0){
//
//        }
//    }
}
