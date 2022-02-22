package p2.service;

import p2.bean.Customer;

/*
CustomerList为Customer对象的管理模块,内部用数组管理一组Customer对象,并提供相应的添加、修改、删除和遍历方法,供CustomerView调用

 */
public class CustomerList {

    private Customer[] customers;

    //total是customers的长度
    private int total = 0;

    /**
     *用途:构造器,用来初始化customers数组
     *参数:totalCustomer:指定customers数组的最大空间
     * @param totalCustomer
     * @return
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    };

    /**
     *用途:将参数customer添加到数组中最后一个客户对象记录之后
     * 参数:customer指定要添加的客户对象
     * 返回:添加成功返回true；false表示数组已满,无法添加
     * @param customer
     * @return true 成功 false 失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length){
            return false;
        }else{
            customers[total] = customer;
            total++;
            return true;
        }
    };

    /**
     *用途:用参数customer替换数组中由index指定的对象
     * 参数:customer指定替换的新客户对象
     * index指定所替换对象在数组中的位置,从0开始
     * 返回:替换成功返回true；false表示索引无效,无法替换
     * @param index
     * @param cust
     * @return true 成功 false 失败
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){
            return false;
        } else {
            customers[index] = cust;
            return true;
        }

    };

    /**
     *用途:从数组中删除参数index指定索引位置的客户对象记录
     * 参数: index指定所删除对象在数组中的索引位置,从0开始
     * 返回:删除成功返回true；false表示索引无效,无法删除
     * @param index
     * @return true 成功 false 失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }else{
            for(int i = index; index < total; index ++){
                customers[i] = customers[i+1];
            }
            // 最后元素置空
            customers[total - 1] = null;
            total--;
            return true;
        }
    };

    /**
     * 用途:返回数组中记录的所有客户对象
     * 返回: Customer[] 数组中包含了当前所有客户对象,该数组长度与对象个数相同.
     * @return
     */
    public Customer[] getAllCustomers() {

        Customer[] custs = new Customer[total];
        for(int i = 0; i < total; i++){
            custs[i] = customers[i];
        }
        return custs;
    };

    /*



     */

    /**
     * 用途:返回参数index指定索引位置的客户对象记录
     * 参数: index指定所要获取的客户在数组中的索引位置,从0开始
     * 返回:封装了客户信息的Customer对象
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if(index < 0 || index >= total){
            return null;
        }else{
            return customers[index];
        }
    };

    /**
     * 获取客户的数量.
     * @return
     */
    public int getTotal(){
        return total;
//        return customers.length; // 语法不报错,但是实际是错的,因为,数组长度已经固定了,存储客户的数量却没有固定.
    };

}
