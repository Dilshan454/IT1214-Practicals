class Circle{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public void display(){
        
        System.out.println("Area of Circle : "+calculateArea());
        System.out.println("peremeter of Circle : "+calculateCircumference());
        
    }


}

public class CircleCalculator{
    public static void main(String[] args){
        Circle c1=new Circle(7);
        Circle c2=new Circle(5);
        Circle c3=new Circle(2);

        c1.display();
        c2.display();
        c3.display();
    }
}