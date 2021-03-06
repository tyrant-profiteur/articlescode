package com.tyrant.equalshashcode;

/**
 * @author:profiteur
 * @create 2020-07-10 17:13
 **/
public class MainFunction2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("--------------不重写 equals-----------------");
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
        System.out.println(user.equals(user1));//false
        System.out.println(user.equals(user2));//true
        System.out.println(user.equals(user3));//false
        System.out.println(user.equals(user4));//false
        System.out.println("--------------重写 equals-----------------");
        //无参构造
        UserOverride userOverride = new UserOverride();
        userOverride.setName("老王");
        userOverride.setAge("24");
        UserOverride userOverride1 = new UserOverride();
        userOverride1.setName("老王");
        userOverride1.setAge("24");
        UserOverride userOverride2 = userOverride;
        //有参构造
        UserOverride userOverride3 = new UserOverride("老王","24");
        //clone
        UserOverride userOverride4 = (UserOverride)userOverride.clone();
        System.out.println(userOverride.equals(userOverride1));//true
        System.out.println(userOverride.equals(userOverride2));//true
        System.out.println(userOverride.equals(userOverride3));//true
        System.out.println(userOverride.equals(userOverride4));//true
    }
}
