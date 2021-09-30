package org.tyaa.demo.java.testing.gradle.models;

public abstract class AbstractShape {

    public Double x0;
    public Double y0;

    public AbstractShape(Double x0, Double y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public abstract Double getLength();

    public abstract Double getArea();

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
