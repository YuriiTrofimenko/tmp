package org.tyaa.demo.java.testing.gradle;

public class CustomCharWrapper {

    private char value;

    public CustomCharWrapper() {}

    public CustomCharWrapper(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
