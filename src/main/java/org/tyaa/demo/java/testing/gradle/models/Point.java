package org.tyaa.demo.java.testing.gradle.models;

import org.tyaa.demo.java.testing.gradle.interfaces.IShape;

public class Point extends AbstractShape implements IShape {

    public String color;

    public Point(Double x0, Double y0) {
        super(x0, y0);
    }

    @Override
    public Double getLength() {
        return 0d;
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public <T> void setColor(T color) {
        this.color = (String) color;
    }

    @Override
    public String toString() {
        return "Point{" +
            "x0=" + x0 +
            ", y0=" + y0 +
            '}';
    }
}
