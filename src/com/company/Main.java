package com.company;

import Figures.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Point p1 = new Point(2, 2);
//        Point p2 = new Point(3, 3);
//        Point p3 = new Point(4, 4);
//        Point p4 = new Point(5, 5);
        List<Point> points = new ArrayList<>();
        Rectangle rectangle = new Rectangle(p1,p2,p4,p3);
        System.out.println(rectangle);
        rectangle.printPerimetr();
        rectangle.printArea();

        System.out.println("Point1: " + p1.getX());
        System.out.println("Point2: " + p2.getX());
        System.out.println("Point3: " + p3.getX());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        PointOnAxe ap1 = new PointOnAxe(0, 0);
        System.out.println(ap1);

        //Rectangle r = new Rectangle;
        //System.out.println(r);


        //Figure f1 = new treangle(p1, p2, p3);
        //Figure f2 = new Rectangle(p1, p2, p3, p4);
        //Figure f3 = new Figure();
        //Figure f4 = (Figure)treangle;   //upcast
        //((treangle)f4).     //downcast
    }


    public static void printPoint(Point p, int number) {
        System.out.println("Point" + number + ":");
    }
}
