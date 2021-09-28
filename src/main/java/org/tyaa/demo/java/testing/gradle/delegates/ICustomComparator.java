package org.tyaa.demo.java.testing.gradle.delegates;

@FunctionalInterface
public interface ICustomComparator<T> {
    int compare(T t1, T t2);
}
