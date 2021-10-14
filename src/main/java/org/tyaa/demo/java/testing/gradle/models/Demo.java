package org.tyaa.demo.java.testing.gradle.models;

import java.util.Objects;

public class Demo {

    public Integer x;
    public Integer y;

    public Demo(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return x.equals(demo.x) &&
            y.equals(demo.y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (x == null ? 0 : x.hashCode());
        hash = 31 * hash + (y == null ? 0 : y.hashCode());
        return hash;
    }
}
