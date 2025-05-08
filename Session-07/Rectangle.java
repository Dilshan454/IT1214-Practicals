class Rectangle{
    int height,width;

    Rectangle(int h,int w){
        this.height=h;
        this.width=w;

        System.out.println("Just created a rectangle object with size(h*w) = "+height+"*"+width);
        print(width,height);
    }

    void print(int width,int height){

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

class Main{
    public static void main(String[] args){
        /*Rectangle r1=new Rectangle();
        r1.print(3,4);*/

        Rectangle r2=new Rectangle(6,5);
        Rectangle r3=new Rectangle(8,5);

        System.out.println("r2:Height is "+r2.height+" , width is "+r2.width);
    }
}