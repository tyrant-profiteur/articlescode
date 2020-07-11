package com.tyrant.equalshashcode;

/**
 * @author:profiteur
 * @create 2020-07-10 17:13
 **/
public class MainFunction3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("--------------不重写 hashcode-----------------");
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
        System.out.println(user.hashCode() == user1.hashCode());//false
        System.out.println(user.hashCode() == user2.hashCode());//true
        System.out.println(user.hashCode() == user3.hashCode());//false
        System.out.println(user.hashCode() == user4.hashCode());//false
        System.out.println("--------------重写 hashcode-----------------");
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
        System.out.println(userOverride.hashCode() == userOverride1.hashCode());//true
        System.out.println(userOverride.hashCode() == userOverride2.hashCode());//true
        System.out.println(userOverride.hashCode() == userOverride3.hashCode());//true
        System.out.println(userOverride.hashCode() == userOverride4.hashCode());//true
    }
}
