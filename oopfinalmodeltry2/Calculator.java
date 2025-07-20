class Point{
    double x,y;

    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point a){
        return Math.sqrt(Math.pow(x-a.x,2)+Math.pow(y-a.y,2));
    }
}

public class Calculator{
    public static void main(String[] args){
        Point p1=new Point(4,9);
        Point p2=new Point(6,5);

        System.out.println("distance: "+p1.distance(p2));
    }
}