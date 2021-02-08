package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithoutAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class Circle extends GeometricFigureWithoutAngles {

    public Circle(String figureName, FigureColor figureColor, double radius) {
        super(figureName, figureColor, radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);

    }

    public double getCircumference(){
        return Math.PI * this.getRadius() * 2;
    }

    @Override
    public String toString(){
        return String.format("Фигура: %s Площадь: %.2f кв.ед. Длина окружности: %.2f ед. Цвет: %s", this.getFigureName(), area(),  this.getCircumference(), this.getFigureColor().name());
    }

}
