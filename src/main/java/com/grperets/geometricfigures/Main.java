package com.grperets.geometricfigures;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.factory.impl.CircleFigureFactory;
import com.grperets.geometricfigures.figure.existing.Circle;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.Trapezoid;

public class Main {
    public static void main(String []args ){
        FigureFactory figureFactory = new CircleFigureFactory();
        Figure figure = figureFactory.create();

        System.out.println(figure);



    }
}
