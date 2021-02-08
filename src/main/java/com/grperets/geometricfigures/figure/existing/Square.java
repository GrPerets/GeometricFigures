package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class Square extends GeometricFigureWithAngles {

    public Square(String figureName, FigureColor figureColor, double side) {
        super(figureName, figureColor, side);
    }

    @Override
    public double area() {
        return Math.pow(this.getSide(), 2);
    }

    @Override
    public String toString(){
        return String.format("Фигура: %s Площадь: %.2f кв.ед. Цвет: %s Сторона: %.2f ед.",this.getFigureName(), area(), this.getFigureColor().name(), this.getSide());
    }
}
