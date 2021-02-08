package com.grperets.geometricfigures.figure;


import com.grperets.geometricfigures.util.FigureColor;

public abstract class GeometricFigure implements Figure {

    private FigureColor figureColor;

    public GeometricFigure(FigureColor figureColor) {
        this.figureColor = figureColor;
    }

    public FigureColor getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(FigureColor figureColor) {
        this.figureColor = figureColor;
    }



}
