package base1;

/**
 * Created by sihanwang on 2017/4/26.
 */
public class newThree {
    public static boolean Find(int target, int [][] array) {
        if(array.length > 0){
            int row = 0;
            int column = array[0].length - 1;
            System.out.println(column);
            while(column >= 0 && row < array.length){
                if(array[row][column] == target){
                    System.out.println("true");
                    return true;
                }else if(array[row][column] > target){
                    --column;
                }else{
                    ++row;
                }
            }
            System.out.println("false");
            return false;
        }
        System.out.println("null object");
        return false;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] test2 = {};
        Find(66,test2);
    }
}
