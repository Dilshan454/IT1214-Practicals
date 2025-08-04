import java.util.*;

class Record{
    private String name;
    private String phoneNumer;

    Record(String name,String phoneNumer){
        this.name=name;
        this.phoneNumer=phoneNumer;
    }

    String getName(){
        return name;
    }

    String getPhoneNumer(){
        return phoneNumer;
    }

    void setName(String name){
        this.name=name;
    }
     void setgetPhoneNumer(String phoneNumer){
        this.phoneNumer=phoneNumer;
    }

    void display(){
        System.out.println("NAme: "+name+"\nphoneNumer: "+phoneNumer);
    }
}

interface PhoneBookOperations{
    void addEntry(Record record);
    void deleteEntry(String name);
    Record searchPhone(String name);
    void displayAll();
}

class PhoneBook{
    ArrayList<Record> records=new ArrayList<>();

    void addEntry(Record record){
        records.add(record);
        System.out.println("added entry");
    }
    void deleteEntry(String name){
        boolean found = false;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getName().equalsIgnoreCase(name)) {
                records.remove(i);
                System.out.println("Entry deleted.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No record found with name: " + name);
    }
    Record searchPhone(String name){
        for (Record r : records) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }
    void displayAll(){
         if (records.isEmpty()) {
            System.out.println("PhoneBook is empty.");
        } else {
            for (Record r : records) {
                r.display();
            }
        }
    }
}

public class Question3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PhoneBook pb=new PhoneBook();

        pb.addEntry(new Record("pabaya","011234567"));
        pb.addEntry(new Record("abaya","022234567"));
        pb.addEntry(new Record("babaya","033234567"));

        int choice;

        System.out.println("menu: ");
        System.out.println("1. Add a new entry");
        System.out.println("2. Delete an entry");
        System.out.println("3. Search by name");
        System.out.println("4. Display all records");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();
                pb.addEntry(new Record(name, phone));
                break;
            case 2:
                System.out.print("Enter name to delete: ");
                String delName = sc.nextLine();
                pb.deleteEntry(delName);
                break;
            case 5:
                System.out.println("Exiting application.");
                break; 
            default:
                 System.out.println("Invalid choice.");
        }
    }
}
