package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class RightTriangle extends GeometricFigureWithAngles {

    private double cathetusB;

    public RightTriangle(FigureColor figureColor, double side, double cathetusB) {
        super(figureColor, side);
        this.cathetusB = cathetusB;
    }


    @Override
    public double area() {
        return (this.getSide() * this.cathetusB) / 2;
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(this.getSide(), 2) + Math.pow(this.cathetusB, 2));
    }


    public double getCathetusB() {
        return cathetusB;
    }

    public void setCathetusB(double cathetusB) {
        this.cathetusB = cathetusB;
    }

    @Override
    public String toString(){
        return String.format("Площадь: %.2f Цвет: %s Гипотенуза: %.2f",area(), this.getFigureColor().name(), this.getHypotenuse());
    }
}
