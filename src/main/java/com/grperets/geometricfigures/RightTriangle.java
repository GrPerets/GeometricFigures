package com.grperets.geometricfigures;

public class RightTriangle extends GeometricFigureWithAngles{
    private double cathetusA;
    private double cathetusB;

    @Override
    public double area() {
        return (this.cathetusA * this.cathetusB) / 2;
    }

    public double hypotenuse(){
        return 0;
    }
}
