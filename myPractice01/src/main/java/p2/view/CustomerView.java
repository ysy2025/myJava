package p2.view;

import p2.Util.CMUtility;
import p2.bean.Customer;
import p2.service.CustomerList;

/*
CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {

    CustomerList customerList = new CustomerList(10);


    public CustomerView(){
        Customer customer = new Customer("zhangsan", 'F', 1, "12312312311", "a1@qq.com");
        customerList.addCustomer(customer);


    }
    /**
     * 进入主页面
     */
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag){
            //开幕雷击
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            // 用户选择
            char menu = CMUtility.readMenuSelection();

            switch(menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("退出!!!!!!!!!!!!");
                    System.out.println("Y/N:");
                    char isExit = CMUtility.readConfirmSelection();
                    System.out.println(isExit);
                    if (isExit == 'Y'){
                        isFlag = false;
                    }else{
                        System.out.println("enter wrong!");
                    }
            }

            //退出的标志
//            isFlag = false;
        }
    };


    /**
     * 添加客户
     */
    private void addNewCustomer() {
        System.out.println("                   1 添 加 客 户");
        System.out.println("请输入姓名: ");
        String name = CMUtility.readString(10);

        System.out.println("请输入性别: ");
        char gender = CMUtility.readChar();

        System.out.println("请输入年龄: ");
        int age = CMUtility.readInt();

        System.out.println("请输入手机: ");
        String phone = CMUtility.readString(13);

        System.out.println("请输入邮箱: ");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        customerList.addCustomer(customer);
        
    };

    /**
     * 修改客户
     */
    private void modifyCustomer(){
        System.out.println("                   2 修 改 客 户");
    };

    /**
     * 删除客户
     */
    private void deleteCustomer(){
        System.out.println("                   3 删 除 客 户");
    };

    /**
     * 显示客户列表
     */
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");


        int total = customerList.getTotal();
        if(total ==0){
            System.out.println("没有任何客户记录！");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] allCustomers = customerList.getAllCustomers();
            for (int i=0; i<allCustomers.length; i++){
                Customer cust = allCustomers[i];
                System.out.println((i+1) + "\t" + cust.getName() + "\t"+cust.getGender()+"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail()+"\t");
            }
        }
//        CustomerList cl = new CustomerList();

        System.out.println("-------------------------客户列表完成-------------------------");
    };


    public static void main(String[] args){

        CustomerView cv = new CustomerView();

        cv.enterMainMenu();

        CustomerList myList = new CustomerList(10);


    };

}
