
class A{
    void show(){
        System.out.println("In A!");
    }
}

class B extends A{
    void show() {
        System.out.println("In B!");;
    }
}

class C extends A{
    void show() {
        System.out.println("In C!");;
    }
}

public class polymorphism {
    public static void main(String[] args){

        System.out.println("Object of class A:");
        A obj = new A();
        obj.show();

        System.out.println("Object of class B:");
        obj = new B();
        obj.show();

        System.out.println("Object of class C:");
        obj = new C();
        obj.show();
    }
}
