package chapter3;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/5/17.
 */
public class newThirtyFour {
    public static int uglyNum(int n){
        if (n <= 0){
            return 0;
        }
        int a=0,b=0,c=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        while(list.size() < n){
            int res0 = list.get(a) * 2;
            int res1 = list.get(b) * 3;
            int res2 = list.get(c) * 5;

            int min = Math.min(res2,Math.min(res1,res0));
            list.add(min);
            if (min == res0) a++;
            if (min == res1) b++;
            if (min == res2) c++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //System.out.println(list.get(list.size() - 1));
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        uglyNum(7);
    }
}
