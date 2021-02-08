package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class Trapezoid extends GeometricFigureWithAngles {
    private double baseB;
    private double height;

    public Trapezoid(String figureName, FigureColor figureColor, double side, double baseB, double height) {
        super(figureName, figureColor, side);
        this.baseB = baseB;
        this.height = height;
    }



    @Override
    public double area() {
        return (this.getSide() + this.baseB) / 2 * this.height;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMiddleLine(){
        return ((this.getSide() + this.getBaseB()) / 2);
    }


    @Override
    public String toString(){
        return String.format("Фигура %s Площадь: %.2f кв.ед. Цвет: %s Средняя линия: %.2f ед.",this.getFigureName(), area(), this.getFigureColor().name(), this.getMiddleLine());
    }
}
