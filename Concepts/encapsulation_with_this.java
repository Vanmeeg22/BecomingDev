import java.util.Scanner;

class Person{
    private String name;
    private int age;
    private String race;

    Scanner scan = new Scanner(System.in);

    public void setName(){
        System.out.print("Enter the name of the person: ");
        String name = scan.next();
        this.name = name;
    }
    public void setAge(){
        System.out.print("Enter the age of the person: ");
        int age = scan.nextInt();
        this.age = age;
    }
    public void setRace(){
        System.out.print("Enter the race of the person: ");
        String race = scan.next();
        this.race = race;
    }
    public void getHuman(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Race: "+race);
    }
}

public class encapsulation_with_this {
    public static void main(String[] args){
        Person h = new Person();
        h.setName();
        h.setAge();
        h.setRace();

        h.getHuman();
    }
}
