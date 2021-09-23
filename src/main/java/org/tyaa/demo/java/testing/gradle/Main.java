package org.tyaa.demo.java.testing.gradle;

public class Main {
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
        char ch1 = '0';
        System.out.println((short)ch1);
        ch1++;
        System.out.println((short)ch1);
        System.out.println(ch1);
        for (int i = 0; i < 50; i++) {
            System.out.println(++ch1);
        }
    }
    public static char increasePrimitiveChar(char x) {
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
    }
}
