import java.util.*;

class Circle{
    private double radius;
    private String color;

//default constructor 
    Circle(){

    }

//constructor which takes a double argument for radius. 
Circle(double radius){
    this.radius=radius;
}

// constructor which takes a double argument for radius and String argument for color.
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String getColor(){
        return color;
    }
    public double getRadius(){
        return radius;
    }
}

public class TestCircle{
    public static void printDetails(Circle circle){
        System.out.println("Area: "+circle.getArea());
        System.out.println("Perimeteer: "+circle.getPerimeter());
        System.out.println("Color: "+circle.getColor());

    }

    public static void main(String[] args){
        Circle circle1=new Circle();
        circle1.setRadius(1.5);
        circle1.setColor("red");
        System.out.println("----circle1----");
        printDetails(circle1);


        Circle circle2=new Circle(2.75);
        circle2.setColor("blue");
        System.out.println("----circle2----");
        printDetails(circle2);


        Circle circle3=new Circle(3,"black");
        System.out.println("----circle3----");
        printDetails(circle3);


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius for Circle 4: ");
        double radius=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Color for Circle 4: ");
        String color=sc.nextLine();

        Circle circle4= new Circle(radius,color);
        System.out.println("----circle4----");
        printDetails(circle4);
    }
}