class Cube{
    private double side;

    Cube(double side){
        this.side=side;
    }

    double getSurfaceArea(){
        return 6*side*side;
    }

    double getVolume(){
        return Math.pow(side,3);
    }

    void display(){
        System.out.println("Side- "+side);
        System.out.println("Area- "+getSurfaceArea());
        System.out.println("Volume- "+getVolume());
        System.out.println();

    }
}

public class Question1{
    public static void main(String rgs[]){
    Cube c1=new Cube(2.5);
    Cube c2=new Cube(4);
    Cube c3=new Cube(3.5);

    c1.display();
    c2.display();
    c3.display();
    }

}