package com.tyrant.equalshashcode;

/**
 * @author:profiteur
 * @create 2020-06-04 12:48
 **/
public class MainFunction1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //基本类型
        int a = 1,b = 1,c = 2;
        System.out.println(a == b);//true
        System.out.println(a == c);//false
        //引用类型
        //无参构造
        User user = new User();
        user.setName("老王");
        user.setAge("24");
        User user1 = new User();
        user1.setName("老王");
        user1.setAge("24");
        User user2 = user;
        //有参构造
        User user3 = new User("老王","24");
        //clone
        User user4 = (User)user.clone();
        System.out.println(user == user1);//false
        System.out.println(user == user2);//true
        System.out.println(user == user3);//false
        System.out.println(user == user4);//false
    }
}
