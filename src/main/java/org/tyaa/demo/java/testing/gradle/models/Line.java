package org.tyaa.demo.java.testing.gradle.models;

import org.tyaa.demo.java.testing.gradle.interfaces.IShape;

public class Line extends AbstractShape implements IShape {

    enum Color {
        BLACK, WHITE
    }

    public Color color;

    public Double x1;
    public Double y1;

    public Line(Double x0, Double y0, Double x1, Double y1) {
        super(x0, y0);
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public Double getLength() {
        return Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public <T> void setColor(T color) {
        this.color = (Color) color;
    }

    @Override
    public String toString() {
        return "Line{" +
            "x1=" + x1 +
            ", y1=" + y1 +
            ", x0=" + x0 +
            ", y0=" + y0 +
            '}';
    }
}
