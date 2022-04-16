package Fabric;

import Figures.Figure;
import Figures.Point;


import java.util.ArrayList;

public class FigureCreator implements IFigureCreator {

    public Figure create(ArrayList<Point> points) {
        int nPoints = points.size();
        IFigureCreator creator;
        if (nPoints == 2) creator = new CircleCreator();
        else if (nPoints == 3) creator = new TriangleCreator();
        else if (nPoints == 4) creator = new RectangleCreator();
        else if (nPoints > 2) creator = new PolygonCreator();
        else return null;
        return creator.create(points);

    }

    }
