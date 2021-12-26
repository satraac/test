package xiangmu;

import java.util.ArrayList;
import java.util.Scanner;

public class xuesheng01 {

    public static void main(String[] args) {
        ArrayList<xuesheng> array = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    add(array);

                    break;
                case "2":
                    System.out.println("删除学生");
                    dedlt(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    update(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    fiand(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);//java虚拟机退出

            }
        }
    }
//添加学生信息
    public static void add(ArrayList<xuesheng> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        //使用循环
        while (true){
        System.out.println("请输入学生学号");
        sid = sc.nextLine();
        boolean b = inused(array, sid);
        if (b){
            System.out.println("此学号被使用，请重新输入");
              }else {
            break;
        }
        }
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String address = sc.nextLine();
        xuesheng s = new xuesheng();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加成功");
    }
    //判断学号是否会使用
    public static boolean inused(ArrayList<xuesheng> array,String sid){
        boolean flag=false;

        for (int i=0;i<array.size();i++){
          xuesheng s=array.get(i);
          if (s.getSid().equals(sid)){
              flag=true;
          }
        }
        return flag;
    }

    public static void fiand(ArrayList<xuesheng> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先查询信息");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        for (int i = 0; i < array.size(); i++) {
            xuesheng s = array.get(i);
            System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    public static void dedlt(ArrayList<xuesheng>array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想要删除的学生的学号");
        String sid=sc.nextLine();
        int idex =-1;
        for (int i=0;i<array.size();i++){
            xuesheng x=array.get(i);
            if(x.getSid().equals(sid)){
                idex=i;
                break;
            }
        }
        if (idex==-1){
            System.out.println("该信息不存在，你输入的信息有误");
        }else{
            array.remove(idex);
            System.out.println("删除学生成功");
        }

    }

    public static void update(ArrayList<xuesheng>array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid=sc.nextLine();
        int idex=-1;
        for (int i=0;i<array.size();i++){
            xuesheng x = array.get(i);
            if(x.getSid().equals(sid)){
                idex=i;
                break;
            }
        }
        if(idex==-1){
            System.out.println("该信息有误，请重新输入");
        }else{System.out.println("请输入学生的新名字");
            String name=sc.nextLine();
            System.out.println("请输入学生的新年龄");
            String age=sc.nextLine();
            System.out.println("请输入学生的新居住地");
            String address=sc.nextLine();
            xuesheng s=new xuesheng();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(idex,s);
            System.out.println("修改学生信息成功");
        }

    }
}
