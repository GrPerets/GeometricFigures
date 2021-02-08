package com.grperets.geometricfigures.factory.impl;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.Trapezoid;
import com.grperets.geometricfigures.util.FigureColor;

public class TrapezoidFigureFactory implements FigureFactory {

    @Override
    public Figure create(String figureName,FigureColor figureColor, double ... var) {
        return new Trapezoid(figureName, figureColor, var[0], var[1], var[2]);
    }
}
