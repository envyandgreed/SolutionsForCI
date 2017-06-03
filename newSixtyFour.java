package chapter8;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by sihanwang on 2017/5/31.
 */
public class newSixtyFour {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });



    public void Insert(Integer num) {
        if (((minHeap.size() + maxHeap.size()) & 1) == 0){
            if (!maxHeap.isEmpty() && num < maxHeap.peek()){
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        }else {
            if (!minHeap.isEmpty() && num > minHeap.peek()){
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }

    }

    public Double GetMedian() {
        int size = minHeap.size() + maxHeap.size();
        if (size == 0){
            throw new RuntimeException("no available number");
        }
        double res;
        if ((size & 1) == 1){
            res = minHeap.peek();
        }else{
            res = (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
        return res;
    }
}
