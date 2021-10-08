package org.tyaa.demo.java.testing.gradle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Tmp2 {
    public static void main(String[] args) {
        // List<Integer> integers = List.of(1, -5, 6); // can throw java.lang.UnsupportedOperationException

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(-5);
        integers.add(6);
        integers.add(600);
        integers.add(-50);
        integers.add(100);
        integers.add(0);
        /* Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer currentInteger = iterator.next();
            System.out.println(currentInteger);
            if (currentInteger < 0) {
                iterator.remove();
            }
        }
        System.out.println("\n");
        while (iterator.hasNext()) {
            Integer currentInteger = iterator.next();
            System.out.println(currentInteger);
        } */

        /* for (Integer currentInteger : integers) {
            System.out.println(currentInteger);
            if (currentInteger < 0) {
                integers.remove(currentInteger);
            }
        }
        System.out.println("\n");
        for (Integer currentInteger : integers) {
            System.out.println(currentInteger);
        } */

        /* int listSize = integers.size();
        for (int i = 0; i < listSize; ) {
            Integer currentInteger = integers.get(i);
            System.out.println(currentInteger);
            if (currentInteger < 0) {
                integers.remove(currentInteger);
                listSize = integers.size();
            } else {
                i++;
            }
        }
        System.out.println("\n");
        for (Integer currentInteger : integers) {
            System.out.println(currentInteger);
        } */

        integers.forEach(System.out::println);
        System.out.println("\n");
        integers.removeIf(integer -> integer < 0);
        integers.forEach(System.out::println);

        /* integers.forEach(System.out::println);
        System.out.println("\n");
        integers.stream().filter(integer -> integer >= 0)
            .forEach(System.out::println); */
    }
}
