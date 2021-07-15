package src.com.mapjihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
斗地主 模拟 洗牌

拍数54 ：

A B C D
 */
public class Doudizhu {

    public static void main(String[] args) {
        //先造出四个花色

        List<String> colors=new ArrayList<>();
        colors.add("A");//红心
        colors.add("B");//黑桃
        colors.add("C");//梅花
        colors.add("D");//方块

        //早出 2~10
        List<String> number=new ArrayList<>();

        for (int i = 2; i <11 ; i++) {



            number.add(i+"");

        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        System.out.println(number);

        // colors  number  进行整合
        //     放入一个新的集合


        List<String> pai=new ArrayList<>();
        for (String color : colors) {

            for (String s : number) {

                String ss=color+s;
                System.out.println(ss);
                pai.add(ss);



            }

        }


        pai.add("Bigking");
        pai.add("littleking");

        System.out.println("pai = " + pai);

        //使用set 无法分开排序
        //因set是无序的

        Collections.shuffle(pai);//打乱排序
        System.out.println("pai = " + pai);

        //发牌
        List<String> wanjia1=new ArrayList<>();
        List<String> wanjia2=new ArrayList<>();
        List<String> wanjia3=new ArrayList<>();
        List<String> dipai=new ArrayList<>();
        for (int i = 0; i < pai.size(); i++) {
           String pName= pai.get(i);//每张扑克牌
            if (i >=51) {
                dipai.add(pName);//这是最后三张底牌
            }else{

                //给玩家发牌
                if ( i%3==0) {
                    wanjia1.add(pName);

                }else if(i%3==1){
                    wanjia2.add(pName);

                }else{
                    wanjia3.add(pName);

                }

            }

        }

        Collections.sort(pai);//打乱顺序

        System.out.println("pai = " + pai);

        System.out.println("dipai = " + dipai);





        for (String s : wanjia1) {
            if (s.equals("A3")) {

                String ss="玩家1是地主";
                System.out.println(ss);




            }



        }
        for (String s : wanjia2) {
            if (s.equals("A3")) {
                String ss="玩家2是地主";
                System.out.println(ss);
            }



        }
        for (String s : wanjia3) {
            if (s.equals("A3")) {
                String ss="玩家3是地主";
                System.out.println(ss);

            }



        }
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        if (ss.equals("1")){
            wanjia1.add(dipai.get(0));
            wanjia1.add(dipai.get(1));
            wanjia1.add(dipai.get(2));

        }else if (ss.equals("2")) {
            wanjia2.add(dipai.get(0));
            wanjia2.add(dipai.get(1));
            wanjia2.add(dipai.get(2));

        }else if (ss.equals("3")) {
            wanjia3.add(dipai.get(0));
            wanjia3.add(dipai.get(1));
            wanjia3.add(dipai.get(2));

        }



        System.out.println("wanjia1 = " + wanjia1);
        System.out.println("wanjia1 = " + wanjia2);
        System.out.println("wanjia1 = " + wanjia3);
        System.out.println("wanjia1 = " + wanjia1.size());
        System.out.println("wanjia1 = " + wanjia2.size());
        System.out.println("wanjia1 = " + wanjia3.size());

    }





}
