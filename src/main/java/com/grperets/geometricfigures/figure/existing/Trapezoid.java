package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class Trapezoid extends GeometricFigureWithAngles {
    private double baseB;
    private double height;

    public Trapezoid(FigureColor figureColor, double side, double baseB, double height) {
        super(figureColor, side);
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

    @Override
    public String toString(){
        return String.format("Площадь: %.2f Цвет: %s Высота: %.2f",area(), this.getFigureColor().name(), this.height);
    }
}
