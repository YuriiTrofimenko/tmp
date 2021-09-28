package org.tyaa.demo.java.testing.gradle.models;

public class Point extends AbstractShape {

    public Point(Double x0, Double y0) {
        super(x0, y0);
    }

    @Override
    public Double getLength() {
        return 0d;
    }

    @Override
    public String toString() {
        return "Point{" +
            "x0=" + x0 +
            ", y0=" + y0 +
            '}';
    }
}
