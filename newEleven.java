package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/4.
 */
public class newEleven {
    public static double powerCos(int base,int exp){
        double res = 1;
        int flag = exp;
        if (exp == 0){
            return 1;
        }
        if (exp == 1){
            return base;
        }
        exp = Math.abs(exp);
        while(exp!=0){
            if ((exp & 1) != 0){
                res = res * base;
            }
            base = base*base;
            exp = exp >> 1;
        }
        System.out.println(flag >= 0?res:(1.0/res));
        return flag >= 0?res:(1.0/res);
    }

    public static void main(String[] args) {
        powerCos(2,-6);
    }

}
