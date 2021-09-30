package org.tyaa.demo.java.testing.gradle.models;

public abstract class AbstractShape {

    public Double x0;
    public Double y0;

    public AbstractShape(Double x0, Double y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public abstract Double getLength();

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public abstract <T> T getColor();

    /* public <T> void setColor(T color) {

    } */

    public abstract <T> void setColor(T color);
}
