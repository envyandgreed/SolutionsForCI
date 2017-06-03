package chapter8;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by sihanwang on 2017/6/2.
 */
public class newSixtyFive
{
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        LinkedList<Integer> indexLink = new LinkedList<>();

        if (num == null){
            return ret;
        }
        if (num.length < size || size <= 0){
            return ret;
        }

        for (int i = 0; i < size -1; i++) {
            while(!indexLink.isEmpty() && num[i] > num[indexLink.getLast()]){
                indexLink.removeLast();
            }
            indexLink.addLast(i);
        }

        for (int j = size - 1;j < num.length;j++){
            while(!indexLink.isEmpty() && num[j] > num[indexLink.getLast()]){
                indexLink.removeLast();
            }
            indexLink.addLast(j);
            if (j - indexLink.getFirst() + 1 > size){
                indexLink.removeFirst();
            }
            ret.add(num[indexLink.getFirst()]);
        }
        return ret;

    }
}
