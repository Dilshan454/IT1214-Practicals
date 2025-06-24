//player class
abstract class Player{
    private int playerID;
    private String name;
    private String country;
    protected int[] scores;

    //constructor
    public Player(int playerID,String name,String counrty,int[] scores){
        this.playerID=playerID;
        this.name=name;
        this.country=country;
        this.scores=scores;
    }

    //getter
    public int GetPlayerID(){
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

//batsman class
class Batsman extends Player{
    private int runs;

    public Batsman(int playerID,String name,String country,int[] scores){
        super(playerID,name,country,scores);
        calculateRuns();
    }

    private void calculateRuns(){
        for(int score:scores){
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
            System.out.println("Invalid score . Score must be between 0 and 100.");
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Batsman ID: "+GetPlayerID());
        System.out.println("Batsman Name: "+getName());
        System.out.println("Batsman scores: ");
        for(int score:scores){
            System.out.print(score + " ");
        }

        System.out.println();
        System.out.println("Total runs: "+runs);
        System.out.println();
    }

}

//Bowler class
class Bowler extends Player{
    private int wickets;

    Bowler(int playerID,String name,String country,int[] scores){
        super(playerID,name,country,scores);
        calculateWickets();
    }

    private void calculateWickets(){
        for (int score:scores){
            wickets+= score;
        }
    }

    public int getWickets(){
        return wickets;
    }


     @Override
    public void addScore(int score){
        if(score>=0 && score<=100){
            for(int i=0;i<scores.length;i++){
                if(scores[i]==0){
                    scores[i]=score;
                    wickets++;
                    break;
                }
            }
        }
        else{
            System.out.println("Invalid score . Score must be between 0 and 100.");
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Batsman ID: "+GetPlayerID());
        System.out.println("Batsman Name: "+getName());
        System.out.println("Batsman scores: ");
        for(int score:scores){
            System.out.print(score + " ");
        }

        System.out.println();
        System.out.println("Total Wickets: "+wickets);
        System.out.println();
    }

}

public class Main{
    public static voiss main(Strings[] args){
        //batsman scores
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


        //create batsman
        Batsman[] batsman=new Batsman[5];

        batsman[0]=new Batsman(1,"Sachin Tendulkar", "India",batsman1Scores);
        batsmen[1] = new Batsman(2, "Virat Kohli", "India",batsman2Scores);
        batsmen[2] = new Batsman(3, "MS Dhoni","India", batsman3Scores);
        batsmen[3] = new Batsman(4, "Ricky Ponting","Australia", batsman4Scores);
        batsmen[4] = new Batsman(5, "Brian Lara","West Indies", batsman5Scores);

        bowlers[0] = new Bowler(1, "Muttiah Muralitharan", "Sri Lanka",bowler1Scores);
        bowlers[1] = new Bowler(2, "Shane Warne", "Australia",bowler2Scores);
        bowlers[2] = new Bowler(3, "Wanindu Hasaranga","Sri Lanka", bowler3Scores);
        bowlers[3] = new Bowler(4, "Glenn McGrath","Australia", bowler4Scores);
        bowlers[4] = new Bowler(5, "Dale Steyn","South Africa", bowler5Scores);

    }
}