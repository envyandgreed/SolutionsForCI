package chapter8;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/5/28.
 */
public class newFiftyFive {
    //Insert one char from stringstream
    int[] array = new int[150];
    ArrayList<Character> list = new ArrayList<>();
    public void Insert(char ch)
    {
        array[ch]++;
        list.add(ch);

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (Character c:list){
            if (array[c] == 1){
                return c;
            }
        }
        return '#';
    }
}
