package Fabric;

import Figures.Circle;
import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public class CircleCreator implements IFigureCreator{

    @Override
    public Figure create(ArrayList<Point> points) {
        return new Circle(points);
    }
}
