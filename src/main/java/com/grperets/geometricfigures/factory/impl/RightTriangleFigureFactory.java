package com.grperets.geometricfigures.factory.impl;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.RightTriangle;
import com.grperets.geometricfigures.util.FigureColor;

public class RightTriangleFigureFactory implements FigureFactory {
    @Override
    public Figure create() {
        return new RightTriangle(FigureColor.Green, 15.5, 6.3);
    }
}
