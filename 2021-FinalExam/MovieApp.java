class Movie{
    private String title;
    private int year;
    private double budget;
    private double worldwideEarnings;
    private Actor leadActor;
    private String productionCompany;

    Movie(String title,int year,double budget,double worldwideEarnings,String productionCompany){
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

    public void play(){
        System.out.println("Movie: "+title+" ("+year+")");
        System.out.println("Production company:"+productionCompany);
        System.out.println("Budget: "+budget);
        System.out.println("Worldwide Earnings: "+worldwideEarnings);
        System.out.println("Lead Actor: "+leadActor);
    }
}
