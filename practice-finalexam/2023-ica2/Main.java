abstract class Player{
    private int playerID;
    private String name;
    private String country;
    protected int[] scores;

    Player(int playerID,String name,String country,int[] scores){
        this.playerID=playerID;
        this.name=name;
        this.country=country;
        this.scores=scores;
    }

    public int getPlayerID(){
        return playerID;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }

    public abstract void addScore(int score);
    public abstract void printDetails();
}

class Batsman extends Player{
    private int runs;

    public Batsman(int playerID,String name,String country,int[] scores){
        super(playerID,name,country,scores);
        calculateRuns();
    }

    

    private void calculateRuns(){
        runs=0;
        for(int score: scores){
            runs+= score;
        }
    }

    public int getRuns(){
        return runs;
    }

   @Override
    public void addScore(int score){
        if(score>=0 && score<=100){
            for(int i=0;i<scores.length;i++){
                if(scores[i]==0){
                    scores[i]=score;
                    runs+= score;
                    break;
                }
            }
        }
        else{
            System.out.println("Invalid Score.  Score must between 0 and 100.");
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Batsman ID "+getPlayerID());
        System.out.println("Batsman Name "+getName());
        System.out.println("Batsman Country "+getCountry());
        System.out.println("Batsman Score ");
        for(int score:scores){
            if(score!=0){
                System.out.print(score+" ");
            }
        }
        System.out.println();
        System.out.println("Total runs: "+getRuns());
        System.out.println();
    }
    
}

class Bowler extends Player{
    private int wickets;

    public Bowler(int playerID,String name,String country,int[] scores){
        super(playerID,name,country,scores);
        calculateWickets();
    }
    private void calculateWickets(){
        for(int score :scores){
            if(score>0){
                wickets++;
            }
        }
    }
    public int getWickets(){
        return wickets;
    }

   @Override 
   public void addScore(int score){
        if(score>=0 && score<=10){
            for(int i=0;i<scores.length;i++){
                if(scores[i]==0){
                    scores[i]=score;
                    wickets++;
                    break;
                }
            }
        }
        else{
            System.out.println("Invalid Score. Score must Between 0 and 10. ");
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Bowler Id: "+getPlayerID());
        System.out.println("Bowler Name: "+getName());
        System.out.println("Bowler Country: "+getCountry());
        System.out.println("Bowler Scores:: ");
        for(int score:scores){
            if(score!=0){
                System.out.print(score+" ");
            }
        }
        System.out.println();
        System.out.println("Total wickets"+getWickets());
    }

}

public class Main{
    public static void main(String[] args){
        int[] batsman1Scores = {42, 0, 61, 15, 0, 100, 23, 64, 41, 0, 26};
        int[] batsman2Scores = {0, 25, 10, 60, 11, 0, 40, 11, 0, 2, 0};
        int[] batsman3Scores = {6, 22, 48, 0, 11, 69, 0, 21, 19, 0, 42};
        int[] batsman4Scores = {11, 0, 28, 0, 64, 18, 45, 26, 0, 11, 0};
        int[] batsman5Scores = {0, 13, 21, 47, 0, 69, 17, 0, 12, 0, 40};

        int[] bowler1Scores = {0, 10, 6, 8, 0, 1, 0, 2, 4, 0, 6};
        int[] bowler2Scores = {6, 0, 1, 0, 2, 0, 4, 10, 0, 6, 8};
        int[] bowler3Scores = {0, 1, 0, 6, 8, 4, 2, 0, 6, 0, 10};
        int[] bowler4Scores = {4, 2, 6, 0, 10, 0, 1, 8, 6, 0, 0};
        int[] bowler5Scores = {0, 4, 0, 2, 1, 6, 10, 0, 8, 6, 0};


        Batsman[] batsmen=new Batsman[5];
        Bowler[] bowlers = new Bowler[5];

        batsmen[0] = new Batsman(1, "Sachin Tendulkar","India", batsman1Scores);
        batsmen[1] = new Batsman(2, "Virat Kohli", "India",batsman2Scores);
        batsmen[2] = new Batsman(3, "MS Dhoni","India", batsman3Scores);
        batsmen[3] = new Batsman(4, "Ricky Ponting","Australia", batsman4Scores);
        batsmen[4] = new Batsman(5, "Brian Lara","West Indies", batsman5Scores);

        bowlers[0] = new Bowler(1, "Muttiah Muralitharan", "Sri Lanka",bowler1Scores);
        bowlers[1] = new Bowler(2, "Shane Warne", "Australia",bowler2Scores);
        bowlers[2] = new Bowler(3, "Wanindu Hasaranga","Sri Lanka", bowler3Scores);
        bowlers[3] = new Bowler(4, "Glenn McGrath","Australia", bowler4Scores);
        bowlers[4] = new Bowler(5, "Dale Steyn","South Africa", bowler5Scores);





         // Print batsman & bowlers details
        System.out.println("------------------Print batsman details-------------------");
        System.out.println("Batsman Details:");
        for (Batsman batsman : batsmen) {
            batsman.printDetails();
        }

        // Print bowler details
        System.out.println("------------------Print bowler details-------------------");
        System.out.println("Bowler Details:");
        for (Bowler bowler : bowlers) {
            bowler.printDetails();
        }

        //Add Score 14 to Batsman 1. 
        System.out.println("------------------Batsman 1 Details-------------------");
        batsmen[0].addScore(14);
        batsmen[0].printDetails();

        // Print batsman details
        System.out.println("------------------Print batsman details-------------------");
        System.out.println("Batsman Details:");
        for (Batsman batsman : batsmen) {
            batsman.printDetails();
        }


        // Print the details of the Batsman with the highest Runs.
        System.out.println("------------------Find batsman with highest score-------------------");
        Batsman batsmanWithHighestScore = batsmen[0];
        for (Batsman batsman : batsmen) {
            if (batsman.getRuns() > batsmanWithHighestScore.getRuns()) {
                batsmanWithHighestScore = batsman;
            }
        }

        System.out.println("Batsman with Highest Score:");
        batsmanWithHighestScore.printDetails();
        System.out.println();


        // Find bowler with highest wickets
        System.out.println("------------------Find bowler with highest wickets-------------------");
        Bowler bowlerWithHighestWickets = bowlers[0];
        for (Bowler bowler : bowlers) {
            if (bowler.getWickets() > bowlerWithHighestWickets.getWickets()) {
                bowlerWithHighestWickets = bowler;
            }
        }

        System.out.println("Bowler with Highest Wickets:");
        bowlerWithHighestWickets.printDetails();



        // Print batsmen details from Australia
        System.out.println("------------------Print players details from Australia-------------------");
        System.out.println("Batsmen from Australia:");
        for (Batsman batsman : batsmen) {
            if (batsman.getCountry().equals("Australia")) {
                batsman.printDetails();
            }
        }

        // Print bowlers details from Australia
        System.out.println("Bowlers from Australia:");
        for (Bowler bowler : bowlers) {
            if (bowler.getCountry().equals("Australia")) {
                bowler.printDetails();
            }
        }

    }
}