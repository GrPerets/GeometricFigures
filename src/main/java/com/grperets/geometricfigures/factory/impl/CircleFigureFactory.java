package com.grperets.geometricfigures.factory.impl;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.Circle;
import com.grperets.geometricfigures.util.FigureColor;

public class CircleFigureFactory implements FigureFactory {
    @Override
    public Figure create() {
        return new Circle(FigureColor.Blue, 50);
    }
}
