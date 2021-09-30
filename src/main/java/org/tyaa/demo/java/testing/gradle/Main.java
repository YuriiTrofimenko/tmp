package org.tyaa.demo.java.testing.gradle;

import org.tyaa.demo.java.testing.gradle.delegates.ICustomComparator;
import org.tyaa.demo.java.testing.gradle.interfaces.IAreable;
import org.tyaa.demo.java.testing.gradle.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    // private static int lambdaCalls = 0;

    public static void main(String[] args) {
        // 1. The difference between char and Character types
        /* char primitiveChar = 'A';
        Character referenceChar = 'A';
        CustomCharWrapper customChar = new CustomCharWrapper('A'); */

        // System.out.println(increasePrimitiveChar(primitiveChar));
        // System.out.println(primitiveChar);

        // System.out.println(increaseReferenceChar(referenceChar));
        // System.out.println(referenceChar);

        // System.out.println(increaseCustomChar(customChar));
        // System.out.println(customChar);

        // 2. Characters as symbols and short numbers
        /* char ch1 = '0';
        System.out.println((short)ch1);
        ch1++;
        System.out.println((short)ch1);
        System.out.println(ch1);
        for (int i = 0; i < 50; i++) {
            System.out.println(++ch1);
        } */

        /* List<Integer> integers = new ArrayList<>(List.of(2, 0, -5, 40, 100, 0, 1));
        List<Order> orders = new ArrayList<>(List.of(
            new Order("Keyboard", 500d, 1),
            new Order("Display", 2500d, 2),
            new Order("Processor", 50000d, 1)
        )); */

        // integers.sort(Integer::compareTo);
        // integers.sort((i1, i2) -> i2 - i1);
        /* integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        }); */

        // CustomSorters.sort(integers);
        /* CustomSorters.sort(integers, new ICustomComparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2 - t1;
            }
        }); */

        /*final */ // int lambdaCalls = 0;
        // CustomSorters.sort(integers, (t1, t2) -> t2 - t1);
        // CustomSorters.sort(orders, (t1, t2) -> t1.getTotalPrice().compareTo(t2.getTotalPrice()));
        // CustomSorters.sort(orders, (t1, t2) -> t2.getTotalPrice().compareTo(t1.getTotalPrice()));
        // CustomSorters.sort(orders, (t1, t2) -> t1.productName.compareTo(t2.productName));
        /* CustomSorters.sort(orders, (t1, t2) -> {
            lambdaCalls++;
            // System.out.println(lambdaCalls);
            return t1.productName.compareTo(t2.productName);
        });

        System.out.println(lambdaCalls);
        // integers.forEach(System.out::println);
        orders.forEach(System.out::println); */
        List<AbstractShape> orders = new ArrayList<>(List.of(
            new Point(200d, 300d),
            new Line(0d, 0d, 100d, 200d),
            new Rectangle(100d, 50d, 200d, 350d),
            new Triangle(100d, 100d, new Point(50d, 300d), new Point(250d, 350d))
        ));
        orders.forEach(shape -> {
            System.out.printf(
                "Primitive %s: %s, length is %s\n",
                shape.getName(),
                shape,
                shape.getLength()
            );
            // System.out.printf("Area = %s\n\n", shape.getArea());
            /* if (shape instanceof Rectangle) {
                System.out.printf("Area = %s\n\n", ((Rectangle)shape).getArea());
            } else if (shape instanceof Triangle) {
                System.out.printf("Area = %s\n\n", ((Triangle)shape).getArea());
            } else {
                System.out.println("No area\n");
            } */
            if (shape instanceof IAreable) {
                System.out.printf("Area = %s\n\n", ((IAreable)shape).getArea());
            } else {
                System.out.println("No area\n");
            }
        });
    }
    /* public static char increasePrimitiveChar(char x) {
        return ++x;
    }
    public static char increaseReferenceChar(Character x) {
        return ++x;
    }
    public static CustomCharWrapper increaseCustomChar(CustomCharWrapper x) {
        char oldValue = x.getValue();
        char newValue = ++oldValue;
        x.setValue(newValue);
        return x;
    } */
}
