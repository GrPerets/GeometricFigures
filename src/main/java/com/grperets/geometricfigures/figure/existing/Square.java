package com.grperets.geometricfigures.figure.existing;

import com.grperets.geometricfigures.figure.GeometricFigureWithAngles;
import com.grperets.geometricfigures.util.FigureColor;

public class Square extends GeometricFigureWithAngles {

    public Square(FigureColor figureColor, double side) {
        super(figureColor, side);
    }

    @Override
    public double area() {
        return Math.pow(this.getSide(), 2);
    }

    @Override
    public String toString(){
        return String.format("Площадь: %.2f Цвет: %s Сторона: %.2f",area(), this.getFigureColor().name(), this.getSide());
    }
}
