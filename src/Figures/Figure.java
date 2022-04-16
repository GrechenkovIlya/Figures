package Figures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Figure {
    public ArrayList<Point> points;
private double perimetr;
    public Figure(ArrayList<Point> points) {
        this.points = points;
    }
    //this.getPerimetr();

    public String toString(){
        String className = getClass().getSimpleName();
        String result = "My name is " + className + " , my points: ";
        for (int i=0; i<this.points.size(); i++ ){
            result += (i+1) + "st point x,y = (" + this.points.get(i).getX() + ";" + this.points.get(i).getY() + ")";
        }
        return result;
    }

    public void calculatePerimetr() {
        double perimetr = 0;
        for (int i = 1; i < this.points.size(); i++){
            perimetr += Math.sqrt(Math.pow(this.points.get(i).getX() - this.points.get(i - 1).getX(), 2) + Math.pow((this.points.get(i).getY() - this.points.get(i-1).getY()),2));
        }
        perimetr += Math.sqrt(Math.pow(this.points.get(this.points.size()-1).getX()-this.points.get(0).getX(), 2)+Math.pow(this.points.get(this.points.size()-1).getY()-this.points.get(0).getY(),2));
       this.perimetr = perimetr;
        System.out.println("Perimetr of " + getClass().getSimpleName() + " = " + perimetr);
    }
    public void calculateArea () {
        double temp = 0;
        for (int i = 0; i < this.points.size() - 1; i++) {
             temp += Math.abs(this.points.get(i).getX() * this.points.get(i+1).getY()-this.points.get(i+1).getX() * this.points.get(i).getY());

        }
        double area = (temp + Math.abs (this.points.get(this.points.size() - 1).getX() * this.points.get(0).getY() - this.points.get(0).getX() * this.points.get(this.points.size() - 1).getY()))/2;
        System.out.println("Area of " + getClass().getSimpleName() + " = " + area);

    }

public Point getNextPoint(int index) {
        if(index == points.size() - 1) {
            return points.get(0);
        }
        else {
            return points.get(index + 1);
        }
}




}
