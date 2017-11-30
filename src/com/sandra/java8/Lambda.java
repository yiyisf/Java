package com.sandra.java8;

import com.sandra.test.User;

import java.util.Arrays;

/**
 *
 * 在编程中，Lambda表达式（或函数）只是一个匿名函数，也就是一个没有名字并且没有被绑定到标识符的函数。
 *
 * 典型的lambda表达式语法如下所示：
 *
 * (x, y) -> x + y 	//This function takes two parameters
 *                  //and return their sum.
 *
 */

public class Lambda {

    public static void main(String[] args) {
//        //old write method
//
//        new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("Old write method!");
//                    }
//                }
//        ).start();
//
//        // new a function interface
//        new Thread(
//                () -> {
//                    System.out.println("My runneable!");
//                }
//        ).start();
//        System.out.println("Main thread!");

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//
//        // old model
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//
//        //com.sandra.java8.Lambda model
//        list.forEach(System.out::println);

        //Sort User objects by their name
        User[] users = {
                new User("a"),
                new User("d"),
                new User("b"),
                new User("c"),
                new User("c"),
                new User("a"),
                new User("e")
        };

        System.out.println("Befor Sorting Names:" + Arrays.toString(users));

        Arrays.sort(users, User::nameCompare);

        System.out.println("After Sorting Names:" + Arrays.toString(users));



    }

}
