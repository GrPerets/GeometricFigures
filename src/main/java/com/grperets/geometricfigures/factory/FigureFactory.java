package com.grperets.geometricfigures.factory;

import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.util.FigureColor;

public interface FigureFactory {
    Figure create(String figureName, FigureColor figureColor, double ... var);
}
