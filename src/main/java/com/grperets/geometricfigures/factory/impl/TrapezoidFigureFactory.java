package com.grperets.geometricfigures.factory.impl;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.Trapezoid;
import com.grperets.geometricfigures.util.FigureColor;

public class TrapezoidFigureFactory implements FigureFactory {
    @Override
    public Figure create() {
        return new Trapezoid(FigureColor.Green, 18, 9.6, 5);
    }
}
