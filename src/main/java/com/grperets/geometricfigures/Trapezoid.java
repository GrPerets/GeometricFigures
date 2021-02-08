package com.grperets.geometricfigures;

public class Trapezoid extends GeometricFigureWithAngles{
    private double baseA;
    private double baseB;
    private double height;

    @Override
    public double area() {
        return (this.baseA + this.baseB)/2*this.height;
    }
}
