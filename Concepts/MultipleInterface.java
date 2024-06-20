interface A7{
    void show();
    void config();
}
interface A8{
    void indignant();
}
interface A9 extends A8{
    void race();
}

class B7 implements A7,A9{
    public void show(){
        System.out.println("Showing...");
    }
    public void config(){
        System.out.println("Configuring...");
    }
    public void indignant(){
        System.out.println("Pretty angry... I am");
    }
    public void race() {
        System.out.println("Flying...");
    }
}

public class MultipleInterface {
    public static void main(String[] args){
        B7 obj = new B7();

        obj.show();
        obj.config();
        obj.indignant();
        obj.race();
    }
}
