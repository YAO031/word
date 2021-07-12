package src.com.util;

/**
 * 文本信息的工具类.
 * 以后修改文本信息,直接去修改这里就剋有了
 */
public class TextUitl {

    // welcome的界面
    // static 修饰方法, 1. 可以 直接 被 类名.方法() 调用  2. 在内存中只有1份, 其他修改,他会跟着修改
    // 还有. 关于 static 静态 代码块.  他一般适用于 界面场景的提前加载, 如 王者荣耀中 峡谷的轮廓永远优先英雄出现.
    //    static{
    //        // 这就叫做 静态代码块
    //    }

    public static  void welcome(){
        System.out.println("************");
        System.out.println("先生/女士");
        System.out.println("欢迎使用ATM取款机");
        System.out.println("************");
    }

    // 客户的 1级 选择
    public static void oneLeveOption(){
        System.out.println("*****************************************");
        System.out.println("********请输入你想要的操作类型：*********");
        System.out.println("********1.余额查询        2.取款*********");
        System.out.println("********3.转账            4.存款*********");
        System.out.println("********5.退卡                  *********");
        System.out.println("*****************************************");
    }
    public static  void welcome1(){
        System.out.println("************");
        System.out.println("先生/女士");
        System.out.println("欢迎下次使用ATM取款机");
        System.out.println("************");
    }

}
