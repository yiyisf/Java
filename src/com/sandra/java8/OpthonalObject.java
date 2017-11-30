package com.sandra.java8;

import com.sandra.test.User;

import java.util.Optional;

public class OpthonalObject {
    public static void main(String[] args) throws IllegalAccessException {
//        //创建对象
//        Optional<Integer> optional = Optional.empty();
//        optional.ifPresent(System.out::println);
//        optional = Optional.of(5);
//        //判断变量是否有值
//        optional.ifPresent(System.out::println);
//
//        //缺省值处理
//        Optional<User> user = Optional.empty();
//
//        User u = user.orElse(new User("default")); //缺省默认新建一个
//        System.out.println(u);
//
//        u = user.orElseThrow(IllegalAccessException::new); //缺省值时抛出异常

        //使用过滤方法拒绝某些值
        Optional<User> user = Optional.empty();

        user.filter(user1-> "default".equals(user1.getName())).ifPresent((user2)->{
            System.out.println("OK");
        });

        user = Optional.of(new User("default"));

        user.filter(user1-> "default".equals(user1.getName())).ifPresent((user2)->{
            System.out.println("OK");
        });
    }
}
