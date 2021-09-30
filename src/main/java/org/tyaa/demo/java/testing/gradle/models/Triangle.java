package org.tyaa.demo.java.testing.gradle.models;

import org.tyaa.demo.java.testing.gradle.interfaces.IAreable;

public class Triangle extends AbstractShape implements IAreable {

    public Point secondPoint;
    public Point thirdPoint;

    public Triangle(Double x0, Double y0, Point secondPoint, Point thirdPoint) {
        super(x0, y0);
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    @Override
    public Double getLength() {
        Double line1Length = Math.sqrt(Math.pow(secondPoint.x0 - x0, 2) + Math.pow(secondPoint.y0 - y0, 2));
        Double line2Length = Math.sqrt(Math.pow(x0 - thirdPoint.x0, 2) + Math.pow(y0 - thirdPoint.y0, 2));
        Double line3Length = Math.sqrt(Math.pow(thirdPoint.x0 - secondPoint.x0, 2) + Math.pow(thirdPoint.y0 - secondPoint.y0, 2));
        return line1Length + line2Length + line3Length;
    }

    @Override
    public <T> T getColor() {
        return null;
    }

    @Override
    public <T> void setColor(T color) {

    }

    @Override
    public Double getArea() {
        Double a = Math.sqrt(Math.pow(secondPoint.x0 - x0, 2) + Math.pow(secondPoint.y0 - y0, 2));
        Double b = Math.sqrt(Math.pow(x0 - thirdPoint.x0, 2) + Math.pow(y0 - thirdPoint.y0, 2));
        Double c = Math.sqrt(Math.pow(thirdPoint.x0 - secondPoint.x0, 2) + Math.pow(thirdPoint.y0 - secondPoint.y0, 2));
        return 0.25 * Math.sqrt( (a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c) );
    }

    @Override
    public String toString() {
        return "Triangle{" +
            "secondPoint=" + secondPoint +
            ", thirdPoint=" + thirdPoint +
            ", x0=" + x0 +
            ", y0=" + y0 +
            '}';
    }
}
