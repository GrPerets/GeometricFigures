package com.grperets.geometricfigures.figure;

import com.grperets.geometricfigures.util.FigureColor;

public abstract class GeometricFigureWithAngles extends GeometricFigure {

    private double side;

    public GeometricFigureWithAngles(String figureName, FigureColor figureColor) {
        super(figureName, figureColor);
    }

    public GeometricFigureWithAngles(String figureName, FigureColor figureColor, double side) {
        super(figureName, figureColor);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



}
