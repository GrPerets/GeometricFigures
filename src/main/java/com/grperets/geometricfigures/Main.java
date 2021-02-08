package com.grperets.geometricfigures;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.factory.impl.CircleFigureFactory;
import com.grperets.geometricfigures.figure.existing.Circle;
import com.grperets.geometricfigures.figure.Figure;
import com.grperets.geometricfigures.figure.existing.Trapezoid;
import com.grperets.geometricfigures.util.FigureColor;
import com.grperets.geometricfigures.util.ManagerFigureFactory;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []args ){

        System.out.print("Number of Figures?: ");

        Scanner scanner = new Scanner(System.in);
        int numberOfFigures = scanner.nextInt();

        List<Figure> figures = ManagerFigureFactory.getFigures(numberOfFigures);

        for(Figure figure: figures){
            System.out.printf("%s\n", figure);
        }

    }
}
