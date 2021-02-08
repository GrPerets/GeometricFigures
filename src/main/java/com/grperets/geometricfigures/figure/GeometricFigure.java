package com.grperets.geometricfigures.figure;


import com.grperets.geometricfigures.util.FigureColor;

public abstract class GeometricFigure implements Figure {

    private String figureName;
    private FigureColor figureColor;

    public GeometricFigure(String figureName, FigureColor figureColor) {
        this.figureName = figureName;
        this.figureColor = figureColor;
    }

    public FigureColor getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(FigureColor figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}
