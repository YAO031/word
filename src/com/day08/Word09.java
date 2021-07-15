package src.com.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Xiloer
 *
 */

public class Word09 {
    public static void main(String[] args) throws ParseException {

        List<Emp> ss=new ArrayList<>();
        System.out.println("你要输入几次？");
        Scanner nn=new Scanner(System.in);
        String dd=nn.nextLine();
        int f=Integer.parseInt(dd);
        for (int i = 0; i <f ; i++) {
            zhuce(ss);
        }

        System.out.println("ss= " + ss.toString());
        for (Emp s : ss) {
            System.out.println(s.toString());

        }












    }

    private static void zhuce(List<Emp> ss) throws ParseException {
        Emp emp=new Emp();
        System.out.println("请输入姓名");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("请输入年龄");
        Scanner age=new Scanner(System.in);
        String ages=sc.nextLine();
        int agess=Integer.parseInt(ages);
        System.out.println("请输入性别");
        Scanner gender=new Scanner(System.in);
        String genders=sc.nextLine();
        System.out.println("请输入工资");
        Scanner salary=new Scanner(System.in);
        String salarys=sc.nextLine();
        int salaryss=Integer.parseInt(salarys);
        System.out.println("请输入入职时间");
        Scanner hiredate=new Scanner(System.in);
        String hiredates=sc.nextLine();


        String  pattern="yyyy-MM-dd";
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        //字符串 专日期

        Date parse = sdf.parse(hiredates);


        Calendar calendar = Calendar.getInstance();

        calendar.setTime(parse);
        calendar.add(Calendar.MONTH,3);

        Date ssss=calendar.getTime();
        long dddd=ssss.getTime();


        String time=String.format("%tc",ssss);//这是将data格式化成星期二 一月 21 08:12:00 CST 2020形式。

        String  tt= String.valueOf(time.charAt(2));


        //入职时间tuisuan
        if (tt.equals("一") ) {
            dddd=dddd+4*1000*60*60*24;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


           // System.out.println("转正时间在本周的周五"+guo1);
            emp.setShijain(guo1);

        }
        if (tt.equals("二") ) {
            dddd=dddd+3*1000*60*60*24;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


            System.out.println(guo1);
            emp.setShijain(guo1);
//                System.out.println("当周的周三"+gou);

        }
        if (tt.equals("三") ) {
            dddd=dddd+2*1000*60*60*24;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


           // System.out.println("入职时间在本周的周五"+guo1);
            emp.setShijain(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("四") ) {
            dddd=dddd+1000*60*60*24;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


            //System.out.println("入职时间在本周的周五"+guo1);
            emp.setShijain(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("五")) {
            dddd=dddd;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


           // System.out.println("入职时间在本周的周五"+guo1);
            emp.setShijain(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("六") ) {
            dddd=dddd-1*1000*60*60*24;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


           // System.out.println("入职时间在本周的周五"+guo1);
            emp.setShijain(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("日")) {
            dddd=dddd-2*1000*60*60*24;
            ssss.setTime(dddd);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(ssss);


           // System.out.println("入职时间在本周的周五"+guo1);

//                System.out.println(gou);
            emp.setShijain(guo1);

        }
        emp.setName(name);
        emp.setAge(agess);
        emp.setGender(genders);
        emp.setSalary(salaryss);
        emp.setHiredate(hiredates);

        ss.add(emp);
    }


}





