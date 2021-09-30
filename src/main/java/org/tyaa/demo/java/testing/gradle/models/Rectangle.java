package org.tyaa.demo.java.testing.gradle.models;

import org.tyaa.demo.java.testing.gradle.interfaces.IAreable;

public class Rectangle extends StaticColorShapeAdapter implements IAreable {

    public Double width;
    public Double height;

    public Rectangle(Double x0, Double y0, Double width, Double height) {
        super(x0, y0);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getLength() {
        return 2 * width + 2 * height;
    }

    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public Double getArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            ", x0=" + x0 +
            ", y0=" + y0 +
            '}';
    }
}
