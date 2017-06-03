package chapter8;

/**
 * Created by sihanwang on 2017/6/3.
 */
public class newSixtySix {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix == null || rows < 1 || cols < 1 || str == null){
            return false;
        }


        if (str.length > matrix.length){
            return false;
        }
    }
}
