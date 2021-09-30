package org.tyaa.demo.java.testing.gradle.models;

public class Rectangle extends AbstractShape {

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
