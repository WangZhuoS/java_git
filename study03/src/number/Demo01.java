package number;

import com.sun.jdi.IntegerValue;

public class Demo01 {

    public static void main (String []args){

//        int a = 12;
//        int b = 20;
//        System.out.println(Math.max(a, b));
        float a = 1.25f;
        float b = 1.12f;
        float c = a-b;
        System.out.println(c);
        if (Math.abs(c)<0.2){
            System.out.println("计算有效");
        }else{
            System.out.println("计算无效");
        }

    }


}
