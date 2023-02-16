package Stringdemo;

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        boolean flag = true;
        StringBuffer stu = new StringBuffer();
        while (flag){
            Menu.meNu();
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("请输入学生信息:");
                    String s = scanner.next();
                    stu.append(addinfoMation(s));
                    break;
                case 2:
                    System.out.println("请输入修改学校的信息:");
                    String s1 = scanner.next();
                    updateinfoMation(stu,s1);
                case 3:
//                      delinfoMation();
                default:
                    System.out.println("输入错误");
            }
        }
    }
    //信息添加
    public static String addinfoMation(String info){
        String[] arr = info.split(";");
        Student student = new Student();
        student.setName(arr[0]);
        student.setGarde(arr[1]);
        student.setSchool(arr[2]);
        student.setAge(arr[3]);
        student.setSex(arr[4]);
        student.setPhone(arr[5]);
        System.out.println(student.toString());
        return student.toString();
    }


    //信息修改
    public static  int updateinfoMation(StringBuffer stringBuffer,String s){
        String str =  stringBuffer.toString();
        String[] arr = str.split(",");
        int end = 0;
        end = arr[0].length()+arr[1].length()+arr[2].length()+2;
        int start = end-7;
        stringBuffer.delete(start,end-1);
        System.out.println(stringBuffer);
        stringBuffer.insert(start,s);
        System.out.println(stringBuffer);
        return 0;
    }


    //信息删除
    public  static  int delinfoMation(Student student){

        return 0;
    }
}
