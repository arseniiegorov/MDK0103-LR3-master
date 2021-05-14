package com.tremper.mdk;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getHeight() * 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " volume=" + getVolume() +
                " area=" + getArea() +
                "} " + super.toString();
    }
}
