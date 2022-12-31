import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("这是1");
        }else if(a==2){
            System.out.println("这是2");
        }else if(a==3){
            System.out.println("这是3");
        }else{
            System.out.println("识别不到");
        }
//        String[] str = new String[10];
//        str[0] = "1";
//        str[1] = "2";
//        str[2] = "3";
//        str[3] = "4";
//        str[4] = "5";
//        str[5] = "6";
//
//        int b = 0;
//        while(createdata(b)) {
//            for (String s : str) {
//                if (s == "3") {
//                    System.out.println("开始执行continue");
//                    continue;
//                } else {
//                    System.out.println(s + " ");
//                }
//            }
//            b+=1;
//            if(b==1){
//                continue;
//            }
//        }
    }



    public static Boolean createdata(int b){
        System.out.println("正在判断");
        if(b>=2){
            System.out.println("关闭");
            return false;
        }
        return true;
    }
}
