package com.sandra.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 方法引用
 *
 */
public class MethodRefrences {
    public static void main(String[] args) {
        IntStream is = new Random().ints(10);
        //调用静态方法 - Class::staticMethodName
        OptionalInt max = is.reduce(Math::min);
        //调用实例方法 - ClassInstance::instanceMethodName,
        //System.out::println equivalent to System.out.println(x)
        max.ifPresent(System.out::println);

        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sorted);

        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)  //引用类型类的方法
                .collect(Collectors.toList());

        System.out.println(sortedAlt);


        List<Integer> list = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new)); //引用构造器方法 - Class::new

        System.out.println(list);

        Optional<Integer> m = list.stream().reduce(Math::max);
        m.ifPresent(System.out::println);

    }
}
