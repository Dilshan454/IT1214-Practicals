import amc.*;
import it.*;
import it.hons.*;

class App{
    public static void main(String[] args){
        amc.FirstYear m1=new amc.FirstYear();
        m1.display();

        amc.SecondYear m2=new amc.SecondYear();
        m2.display();

        it.FirstYear c1=new it.FirstYear();
		c1.display();
		
		it.SecondYear c2=new it.SecondYear();
		c2.display();
		
		it.ThirdYear c3=new it.ThirdYear();
		c3.display();
		
		FourthYear c4=new FourthYear();
		c4.display();

    }
}