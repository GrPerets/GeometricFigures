package com.grperets.geometricfigures.figure;

import com.grperets.geometricfigures.util.FigureColor;

public abstract class GeometricFigureWithAngles extends GeometricFigure {

    private double side;

    public GeometricFigureWithAngles(FigureColor figureColor) {
        super(figureColor);
    }

    public GeometricFigureWithAngles(FigureColor figureColor, double side) {
        super(figureColor);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



}
