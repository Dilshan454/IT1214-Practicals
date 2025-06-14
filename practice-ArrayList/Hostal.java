import java.util.Scanner;

class Room{
    int[] age=new int[4];
    String[] name=new String[4];

    int roomNo;
}

public class Hostal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Room[] room =new Room[5];

        int choice=sc.nextInt();
        sc.nextLine();
        
    switch(choice){
       case 1,2,3,4,5:
        int index = choice - 1;
            room[index] = new Room();
            room[index].roomNo = choice;

            for(int i=0;i<4;i++){

                
                System.out.print("Enter student name "+i+" : ");
                room[index].name[i]=sc.nextLine();

                System.out.print("Enter age of student  "+i+" : ");
                room[index].age[i]=sc.nextInt();
                sc.nextLine();
            }

            /*for (int i = 0; i < 4; i++) {
                    System.out.println("Student " + (i + 1) + ": " + room[index].name[i] + " (Age: " + room[index].age[i] + ")");
                }*/
    }

        


    }
}