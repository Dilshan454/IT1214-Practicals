class Movie{
    private String title;
    private int year;
    private double budget;
    private double worldwideEarnings;
    private Actor leadActor;
    private String productionCompany;

    Movie(String title,int year,double budget,double worldwideEarnings,Actor leadActor,String productionCompany){
        this.title=title;
        this.year=year;
        this.budget=budget;
        this.worldwideEarnings=worldwideEarnings;
        this.leadActor=leadActor;
        this.productionCompany=productionCompany;
    }

    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public double getBudget(){
        return budget;
    }
    public double getWorldwideEarnings(){
        return worldwideEarnings;
    }
    public Actor getLeadActor(){
        return leadActor;
    }
    public String getProductionCompany(){
        return productionCompany;
    }
    public void setWorldwideEarnings(double worldwideEarnings) {
        this.worldwideEarnings = worldwideEarnings;
    }

    public void play(){
        System.out.println("Movie: "+title+" ("+year+")");
        System.out.println("Production company:"+productionCompany);
        System.out.println("Budget: "+budget);
        System.out.println("Worldwide Earnings: "+worldwideEarnings);
        System.out.println("Lead Actor: "+leadActor.getName());
    }
}


class Actor{
    private String name;
    private String gender;
    private int age;
    private String country;

    Actor(String name,String gender,int age,String country){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.country=country;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);
    }
}

public class MovieApp{


    public static void main(String[] args){
        Actor a1=new Actor("Christian Bale","Male",47,"United Kingdom");
        Actor a2=new Actor("Jim Carrey","Male",60,"Canada");
        Actor a3=new Actor("Leanado Dicaprio","Male",47,"United St");

        Movie m1=new Movie("The Dark Knight",2008,185,1004,a1,"Warner Bros");
        Movie m2=new Movie("Mission:Impossible",2018,178,791,a2,"Paramount Pictures");
        Movie m3=new Movie("Avengers:Endgame",2019,356,2798,a3,"Marvel Studios");

        m3.setWorldwideEarnings(3000);

        Movie[] movies = {m1, m2, m3};
        

        System.out.println("Higest grossing movie");
        Movie highest = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getWorldwideEarnings() > highest.getWorldwideEarnings()) {
                highest = movies[i];
            }
        }
        
        // Display the result
        System.out.println("\nHighest Grossing Movie:");
        highest.play();
        
        
    }
}