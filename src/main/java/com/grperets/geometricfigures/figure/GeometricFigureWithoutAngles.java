package com.grperets.geometricfigures.figure;

import com.grperets.geometricfigures.util.FigureColor;

public abstract class GeometricFigureWithoutAngles extends GeometricFigure {

    private double radius;

    public GeometricFigureWithoutAngles(String figureName, FigureColor figureColor) {
        super(figureName, figureColor);
    }

    public GeometricFigureWithoutAngles(String figureName, FigureColor figureColor, double radius) {
        super(figureName, figureColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}
