package chapter3;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/5/10.
 */
public class newTwenty {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printOne(int[][] num){
        int row = num.length;
        int columns = num[0].length;
        if (num == null || columns <= 0 || row <= 0){
            return null;
        }
        int start = 0;
        while(columns > start * 2 && row > start * 2){
            printTwo(num,columns,row,start);
            ++start;
        }

        return list;
    }

    public void printTwo(int[][] num,int columns,int row,int start){
        int endX = columns - 1 - start;
        int endY = row - 1 - start;

        for (int i = start;i <= endX;++i){
            int number = num[start][i];
            list.add(number);
        }

        if (start < endY){
            for (int i = start + 1;i <= endY;i++){
                int number = num[i][endX];
                list.add(number);
            }
        }

        if (start < endX && start < endY){
            for (int i = endX -1;i >= start;i--){
                int number = num[endY][i];
                list.add(number);
            }
        }

        if (start < endX && start < endY - 1){
            for (int i = endY - 1;i >= start+1;i--){
                int number = num[i][start];
                list.add(number);
            }
        }

    }
}
