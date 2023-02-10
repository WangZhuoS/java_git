import java.sql.SQLOutput;

public class Demo {

    private String str = "wangzhuoshi";

    public static void main(String[] args) {
        //用户登录
        String s1 = "Hello";              // String 直接创建
        String s2 = "12345";              // String 直接创建
        Demo demo = new Demo();
        demo.loginUser(s1,s2);


        //拆分
//        String str = "IT男,二次元,野猫,喜欢学习";
//        String[] arr = str.split(",");
//        for(String s: arr){
//            System.out.println(s);
//        }

        //截取
//        String a = "wangzhuoshiasdfghjk";
//        String arr = a.substring(0,11);  //左闭右开[0,11)
//        System.out.println(arr);

        //邮箱验证
//        String a = "123456789@qq.com";
//
//        isMail(a);

        //字符串转化字符数组
//        String a = "Hello";
//        char[] ar = a.toCharArray();
//        for (char s : ar) {
//            System.out.print(s);
//            System.out.print(".");
//        }
    }


    //用户登录
    public  int loginUser(String username,String password){
        String username_succ = "Hello";
        String password_succ = "123456";

        if(username==username_succ&&password==password_succ){
            System.out.println("登陆成功");
            return 1;
        }else{
            System.out.println("登陆失败！！！！！请检查账号密码");
            return 0;
        }
    }

    //更改地址
    public static void loAcl(String address,boolean flag){
        String address_a = "xxxxxxxx";
        if(flag){
            System.out.println("我的地址"+address);
        }else {
            System.out.println("我的地址" + address_a);
        }
    }

    //验证邮箱是否合法
    public static void isMail(String mail){
        char[] ar = mail.toCharArray();
        boolean ischeck = false;
        for(char s : ar) {
            if(s=='@'){
                System.out.println("合法");
                ischeck = true;
            }
        }

        if(!ischeck){
            System.out.println("不合法邮箱");
        }
    }


}
