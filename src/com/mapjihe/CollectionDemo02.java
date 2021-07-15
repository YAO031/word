package src.com.mapjihe;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合存的对象
 *
 * 存的对象的引用，对象通过外力改变了，那么，集合中的内容也会变。
 */

public class CollectionDemo02 {

    public static void main(String[] args) {
        Test fansisi=new Test() ;
        fansisi.setName("范思思");
        fansisi.setHeiht(156);
        fansisi.setAge(16);

        ArrayList c=new ArrayList();
        ((ArrayList) c).add(fansisi);

        for (Object o : c) {

            System.out.println(o);

        }
        fansisi.setHeiht(400);
        fansisi.setAge(30);
        fansisi.setName("贾玲");

        for (Object o : c) {


            System.out.println(o);
        }


    }
}
