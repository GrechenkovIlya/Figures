package Figures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Rectangle extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(List<Point> points){
        super(points);

    }



    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    @Override
    public String toString() {
        return "Rectangle:" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d ;

    }

    //public double getPerimetr() {return super.getPerimetr(Arrays.asList(a,b,c,d));}
    //public void printPerimetr(){}



}
