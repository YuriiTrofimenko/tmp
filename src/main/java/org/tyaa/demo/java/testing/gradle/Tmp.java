package org.tyaa.demo.java.testing.gradle;

import java.util.*;
import java.util.stream.Collectors;

public class Tmp {
    public static void main(String[] args) {
        /* BigDecimal b1 = new BigDecimal("23.47");
        BigDecimal b2 = new BigDecimal("23.47");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1.equals(b2));

        BigDecimal b3 = new BigDecimal("24.00");
        b2 = b2.add(new BigDecimal("0.57"));

        System.out.println(b3.hashCode());
        System.out.println(b2.hashCode()); */

        /* Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1.compareTo(i2)); */

        /*
        *
        * Задание. Ввести n чисел с консоли.
1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

2.     Вывести числа в порядке возрастания (убывания) значений их длины.

3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        *
        * */

        // System.out.println(charArrayToDouble(new char[] {'1', '2', '3'}));

        Scanner sc = new Scanner(System.in);
        List<Number> numbers = new ArrayList<>();
        MAIN_LOOP : while (true) {
            do {
                System.out.println("Введите число и нажмите Ввод. Или наберите X и нажмите Ввод для выхода:");
                String inputString = sc.nextLine();
                try {
                    Integer i = Integer.parseInt(inputString);
                    System.out.println(i);
                    numbers.add(i);
                    break;
                } catch (NumberFormatException ex) {
                    try{
                        Double d = Double.parseDouble(inputString);
                        System.out.println(d);
                        numbers.add(d);
                        break;
                    } catch (NumberFormatException ex2) {
                        if (inputString.toLowerCase().equals("x")) {
                            break MAIN_LOOP;
                        }
                    }
                }
            } while (true);
        }
        if (numbers.size() == 0) {
            System.out.println("No numbers in the list. Exit.");
            System.exit(0);
        }
        List<char[]> chars =
            numbers.stream()
                .map(number -> String.valueOf(number).toCharArray())
                .collect(Collectors.toList());
        // 1
        System.out.println("*** 1 ***");
        char[] minNumberArray = chars.stream().min(Comparator.comparingInt(ch -> ch.length)).get();
        System.out.printf(
            "The shortes number: %s (length: %s)\n",
            charArrayToNumber(minNumberArray),
            minNumberArray.length
        );
        char[] maxNumberArray = chars.stream().max(Comparator.comparingInt(ch -> ch.length)).get();
            System.out.printf(
            "The longest number: %s (length: %s)\n",
            charArrayToNumber(maxNumberArray),
            maxNumberArray.length
        );
        // 2
        System.out.println("*** 2 ***");
        System.out.println("From min to max");
        chars.stream()
            // .sorted(Comparator.comparingInt(n -> n.length))
            // .sorted(Comparator.comparingInt(n -> -n.length))
            .sorted((numberArray1, numberArray2) -> numberArray1.length - numberArray2.length)
            .map(Tmp::charArrayToNumber)
            // .map(array -> charArrayToNumber(array))
            // .map(array -> {
            //     return charArrayToNumber(array);
            // })
            .forEach(System.out::println);
        System.out.println();
        // 3
        System.out.println("*** 3 ***");
        int lengthSum = chars.stream()
            .map(array -> array.length)
            .reduce(Integer::sum).get();
        int numbersSize = numbers.size();
        long lengthAvg = Math.round(((double) lengthSum) / ((double) numbersSize));
        System.out.printf("Avenger length", lengthSum);
        System.out.println();
        System.out.println("Sorted numbers (ASC)");
        chars.stream()
            .filter(array -> array.length < lengthAvg)
            .forEach(System.out::println);
    }

    private static Number charArrayToNumber(char[] chars) {
        String string = String.valueOf(chars);
        if (string.contains(".")) {
            return Double.parseDouble(string);
        } else {
            return Integer.parseInt(string);
        }
    }
}
