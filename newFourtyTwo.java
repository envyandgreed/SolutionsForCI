package chapter6;

/**
 * Created by sihanwang on 2017/5/23.
 */
public class newFourtyTwo {
    public static String reversestring(String str){
        if (str.trim().equals("") || str.length() <= 0){
            return str;
        }
        String[] a = str.split(" ");
        StringBuffer sb = new StringBuffer();
        int i;
        for (i = a.length-1;i>0;i--){
            sb.append(a[i]+" ");
        }
        sb.append(a[0]);
        System.out.println(sb);
        return sb.toString();
    }


    public static String reverseStringTwo(String str){
        char[] chars = str.toCharArray();
        reverse(chars,0,chars.length - 1);
        int blank = -1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                int nextBlank = i;
                reverse(chars,blank+1,nextBlank-1);
                blank = nextBlank;
            }
        }
        reverse(chars,blank+1,chars.length - 1);
        System.out.print(chars);
        return new String(chars);
    }

    private static void reverse(char[] data, int begin, int end){
        while(begin < end){
            char temp = data[begin];
            data[begin] = data[end];
            data[end] = temp;
            begin++;
            end--;
        }
    }



    public static void leftRotate(String str,int k){
        if (k <= 0|| k > str.length() || str.length() == 0){
            return;
        }
        char[] chars = str.toCharArray();
        reverse(chars,0,k-1);
        reverse(chars,k,chars.length-1);
        reverse(chars,0,chars.length-1);
        System.out.println(chars);
    }


    public static void main(String[] args) {
        String s = "I am a student.";
        //reversestring(s);
        //reverseStringTwo(s);
        String a = "abcdefg";
        leftRotate(a,2);
    }
}
