package com.grperets.geometricfigures.factory.impl;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.RightTriangle;
import com.grperets.geometricfigures.util.FigureColor;

public class RightTriangleFigureFactory implements FigureFactory {

    @Override
    public Figure create(String figureName, FigureColor figureColor, double ... var) {
        return new RightTriangle(figureName, figureColor,var[0], var[1]);
    }
}
