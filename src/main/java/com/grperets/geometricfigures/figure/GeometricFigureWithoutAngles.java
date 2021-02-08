package com.grperets.geometricfigures.figure;

import com.grperets.geometricfigures.util.FigureColor;

public abstract class GeometricFigureWithoutAngles extends GeometricFigure {

    private double radius;

    public GeometricFigureWithoutAngles(FigureColor figureColor) {
        super(figureColor);
    }

    public GeometricFigureWithoutAngles(FigureColor figureColor, double radius) {
        super(figureColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}
