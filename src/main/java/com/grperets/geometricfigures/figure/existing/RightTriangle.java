package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class RightTriangle extends GeometricFigureWithAngles {

    private double cathetusB;

    public RightTriangle(String figureName, FigureColor figureColor, double side, double cathetusB) {
        super(figureName, figureColor, side);
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
        return String.format("Фигура: %s Площадь: %.2f кв.ед. Цвет: %s Гипотенуза: %.2f ед.",this.getFigureName(), area(), this.getFigureColor().name(), this.getHypotenuse());
    }
}
