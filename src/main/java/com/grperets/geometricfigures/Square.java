package com.grperets.geometricfigures;

public class Square extends GeometricFigureWithAngles{
    private double side;

    @Override
    public double area() {
        return (this.side*this.side);
    }
}
