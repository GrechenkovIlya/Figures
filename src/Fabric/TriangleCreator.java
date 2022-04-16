package Fabric;

import Figures.Figure;
import Figures.Point;
import Figures.Triangle;

import java.util.ArrayList;

public class TriangleCreator implements IFigureCreator{

    @Override
    public Figure create(ArrayList<Point> points) {
        return new Triangle(points);
    }
}
