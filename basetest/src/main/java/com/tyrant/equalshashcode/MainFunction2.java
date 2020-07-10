package com.tyrant.equalshashcode;

/**
 * @author:profiteur
 * @create 2020-07-10 17:13
 **/
public class MainFunction2 {
    public static void main(String[] args){
        //引用类型
        //无参构造
        UserOverride user = new UserOverride();
        user.setName("老王");
        user.setAge("24");
        UserOverride user1 = new UserOverride();
        user1.setName("老王");
        user1.setAge("24");
        UserOverride user4 = new UserOverride();
        user4.setName("老王");
        user4.setAge("20");
        UserOverride user2 = user;
        //有参构造
        UserOverride user3 = new UserOverride("老王","24");
        System.out.println(user.equals(user1));//true
        System.out.println(user.equals(user2));//true
        System.out.println(user.equals(user3));//true
        System.out.println(user.equals(user4));//false
    }
}
