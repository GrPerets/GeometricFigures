package com.grperets.geometricfigures.factory.impl;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.Circle;
import com.grperets.geometricfigures.util.FigureColor;

public class CircleFigureFactory implements FigureFactory {

    @Override
    public Figure create(String figureName, FigureColor figureColor, double ... var) {
        return new Circle(figureName, figureColor, var[0]);
    }
}
