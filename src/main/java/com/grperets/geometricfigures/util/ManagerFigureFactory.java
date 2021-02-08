package com.grperets.geometricfigures.util;

import com.grperets.geometricfigures.factory.FigureFactory;
import com.grperets.geometricfigures.factory.impl.CircleFigureFactory;
import com.grperets.geometricfigures.factory.impl.RightTriangleFigureFactory;
import com.grperets.geometricfigures.factory.impl.SquareFigureFactory;
import com.grperets.geometricfigures.factory.impl.TrapezoidFigureFactory;
import com.grperets.geometricfigures.figure.Figure;

import java.util.*;


public class ManagerFigureFactory {


    /**
     *
     * @param figureName
     * @param figureColor
     * @param var parameters' figures
     * @return
     */
    public static Figure createFigureByOptional(String figureName, FigureColor figureColor, double ... var){
        FigureFactory figureFactory = null;
        switch (figureName){
            case "circle":
                figureFactory = new CircleFigureFactory();
                break;

            case "rightTriangle":
                figureFactory = new RightTriangleFigureFactory();
                break;

            case "square":
                figureFactory = new SquareFigureFactory();
                break;

            case "trapezoid":
                figureFactory =  new TrapezoidFigureFactory();
                break;

            default:
                throw new RuntimeException(figureName + " Not found");
        }

        Figure figure = figureFactory.create(figureName, figureColor, var);
        return figure;

    }

    /**
     *
     * @param numberOfFigures
     * @return random Figures with random parameters
     */
    public static List<Figure> getFigures(int numberOfFigures){
        int limitParameters = 2;

        List<Figure> figures  = new ArrayList<>();
        for(int i = 0; i < numberOfFigures;i++){

            String figureName = null;
            FigureColor figureColor = null;
            double [] var = new double[5];
            Random random = new Random();

            int randomFigureNumber = random.nextInt(4);
            double randomFigureParameter = random.nextDouble() + limitParameters;


            switch (randomFigureNumber){
                case 0: {
                    figureName = "circle";
                    figureColor = getRandomColor();
                    var[0] = randomFigureParameter;
                }
                break;
                case 1: {
                    figureName = "rightTriangle";
                    figureColor = getRandomColor();
                    var[0] = randomFigureParameter;
                    var[1] = randomFigureParameter;
                }
                break;
                case 2: {
                    figureName = "square";
                    figureColor = getRandomColor();
                    var[0] = randomFigureParameter;
                }
                break;
                case 3: {
                    figureName = "trapezoid";
                    figureColor = getRandomColor();
                    var[0] = randomFigureParameter;
                    var[1] = randomFigureParameter;
                    var[2] = randomFigureParameter;
                }
                break;
                default: throw new RuntimeException(figureName + " Not found");

            }
            figures.add(createFigureByOptional(figureName, figureColor, var));
        }
        return figures;
    }


    /**
     *
     * @return random FigureColor
     */
    public static FigureColor getRandomColor(){
        FigureColor figureColor = null;
        int randomNumber = new Random().nextInt(7);
        switch (randomNumber){
            case 0: figureColor = FigureColor.Red;
            break;
            case 1: figureColor = FigureColor.Orange;
            break;
            case 2: figureColor = FigureColor.Yellow;
            break;
            case 3: figureColor = FigureColor.Green;
            break;
            case 4: figureColor = FigureColor.Blue;
            break;
            case 5: figureColor = FigureColor.Indigo;
            break;
            case 6: figureColor = FigureColor.Violet;
            break;
            default: figureColor = FigureColor.Black;

        }
        return figureColor;
    }



}