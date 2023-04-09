class Human2{
    private int age;
    private String name;

    public Human2() {   //Default Constructor
        System.out.println("in Constructor!");
        setName("Your Name!");
        setAge(18);
    }

    public Human2(String name, int age){    //Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getHuman(){
        System.out.println(name+" : "+age);
    }
}

public class constructors {
    public static void main(String[] args){
        Human2 h1 = new Human2();   //from default constructor!
        Human2 h2 = new Human2("Aaman", 20);    //from parameterized constructor!
//        h1.setName("Aaman");
//        h1.setAge(20);
        System.out.println("Object h1 (default constructor): ");
        h1.getHuman();
        System.out.println("Object h2 (parameterized constructor): ");
        h2.getHuman();
    }
}
