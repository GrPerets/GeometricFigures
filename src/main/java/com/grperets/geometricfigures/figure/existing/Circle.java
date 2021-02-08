package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithoutAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class Circle extends GeometricFigureWithoutAngles {

    public Circle(FigureColor figureColor, double radius) {
        super(figureColor, radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);

    }

    public double getRadius(){
        return super.getRadius();
    }

    @Override
    public String toString(){
        return String.format("Площадь: %.2f Цвет: %s Радиус: %.2f",area(), this.getFigureColor().name(), this.getRadius());
    }

}
