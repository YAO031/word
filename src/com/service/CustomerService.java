package src.com.service;

import src.com.bean.Customer;
import src.com.bean.CustomerData;
import src.com.util.TextUitl;

import java.util.List;
import java.util.Scanner;

// 此类是  完成 客户的 所有业务 (增删改查)
public class CustomerService {
  private List<Customer> customerList;
  private Customer currentCustomer;
    // 1. 查, 登录 判断账号密码是否正确
        public void  checkPwd(String cardid, String  cardPwd){
             CustomerData customerData = CustomerData.getInstance();
            customerList  = customerData.getCustomerList();
                // 1. 拿到  carid中的账户名 和 cardPwd  对  list中的数据做对比
            System.out.println("cardid = " + cardid);
            System.out.println("cardPwd = " + cardPwd);

            for (Customer customer : customerList) {
                    if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){
                        // 拿出来这个人
                        currentCustomer=  customer;
                        // 账户正确
                        System.out.println("欢迎"+customer.getCname()+"顾客登录!请注意您的安全"   );
                        TextUitl.oneLeveOption();  // 界面
                        Scanner scanner = new Scanner(System.in);
                        String option = scanner.nextLine();
                        oneOption(option);
                        // 如何 保证 按了 1 3 5... 让他再此回到 此界面呢 ?
                    }
            }
        }

    private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");

                // 查询余额外
                doSelectMoney();
                    // 当按下1 之后,  回退到  1及选项
                goOneHome();
                break;
            case "2":
                System.out.println("取款");
//                goGetMOney();

                dodelMoney();
                goOneHome();
                break;
            case "3":
                System.out.println("转账");

                System.out.println("请输入对方的账号");
                Scanner scanner=new Scanner(System.in);
                String otherAccount=scanner.nextLine();
                System.out.println("请输入你需要的转账的金额");
                String oterMoney=scanner.nextLine();
                Double otermoneyint=Double.parseDouble(oterMoney);

                Double currentmoney=currentCustomer.getMoney()-otermoneyint;
                    Customer oter=null;
                for (Customer customer : customerList) {
                    if (customer.getAccount().equals(otherAccount) ) {
                        oter=customer;
                    }
                }

                double oterOnemoney=oter.getMoney()+otermoneyint;
                currentCustomer.setMoney(currentmoney);//2注意，不能够创建
                double oterOneMoney=oter.getMoney();//别人余额

                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                addMony();
                goOneHome();
                break;
            case "5":

                System.out.println("退卡");
                TextUitl.welcome1();
               break;

        }
    }

    private void goGetMOney() {
        TextUitl.getMoneyUI();
        //让顾客输入金额
        Scanner scanner=new Scanner(System.in);
        String numIn=scanner.nextLine();
        if (numIn.equals("1")) {
            double money = currentCustomer.getMoney();
            money=money-100;
            currentCustomer.setMoney(money);
            System.out.println("你的余额是："+money);
            //取完

        }
    }

    // 查询余额
    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println(" 余额是 " +money);
    }

    //取款
    private void dodelMoney(){

            double money=currentCustomer.getMoney();
        System.out.println("请输入你要去的面额");
            Scanner scanner=new Scanner(System.in);
            String  a= scanner.nextLine();
            int a1=Integer.parseInt(a);
            double money1=money-a1;
        System.out.println(money1);
        currentCustomer.setMoney(money1);




    }
    //存款
    public void addMony(){
        double money=currentCustomer.getMoney();
        System.out.println("请输入你要去的面额");
        Scanner scanner=new Scanner(System.in);
        String  a= scanner.nextLine();
        int a1=Integer.parseInt(a);
        double money1=money+a1;
        System.out.println(money1);
        currentCustomer.setMoney(money1);

    }

    private  void goOneHome( ){
        TextUitl.oneLeveOption();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);  // 递归算法
    }


}
