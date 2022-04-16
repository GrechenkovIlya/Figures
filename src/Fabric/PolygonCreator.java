package Fabric;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;

import java.util.ArrayList;

public class PolygonCreator implements IFigureCreator {

    @Override
    public Figure create(ArrayList<Point> points) {
        return new Polygon(points);

    }
}
