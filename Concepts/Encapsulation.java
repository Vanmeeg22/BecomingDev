import java.util.Scanner;

class Human{
    private String name;
    private int age;
    private String race;

    Scanner scan = new Scanner(System.in);

    public void setName(){
        System.out.print("Enter the name of the person: ");
        String n = scan.next();
        name = n;
    }
    public void setAge(){
        System.out.print("Enter the age of the person: ");
        int a = scan.nextInt();
        age = a;
    }
    public void setRace(){
        System.out.print("Enter the race of the person: ");
        String r = scan.next();
        race = r;
    }
    public void getHuman(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Race: "+race);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Human h = new Human();
        h.setName();
        h.setAge();
        h.setRace();

        h.getHuman();
    }
}
