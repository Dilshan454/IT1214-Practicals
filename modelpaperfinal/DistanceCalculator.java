class Point{
    double x,y;

    Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double distance(Point o){
        return Math.sqrt(Math.pow(x-o.x,2)+Math.pow(y-o.y,2));
    }
}
public class DistanceCalculator{
    public static void main(String[] args){
        Point p1=new Point(3,5);
        Point p2=new Point(4,6);

        System.out.println("Distance between points: "+p1.distance(p2));
    }
}