package org.tyaa.demo.java.testing.gradle.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface IShape {

    Double getLength();

    default String getName() {
        return this.getClass().getSimpleName();
    }

    <T> T getColor();

    default <T> void setColor(T color) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("The 'setColor' method should be implemented");
    }
}
