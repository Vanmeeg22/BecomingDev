class A2{
    void show1(){
        System.out.println("in class A");
    }
}
class B2 extends A2{
    void show2(){
        System.out.println("in class B");
    }
}
public class upcastingDowncasting {
    public static void main(String[] args){
        A2 obj = new B2();  //Upcasting
        System.out.print("obj: ");
        obj.show1();

        B2 obj2 = (B2) obj;  //Downcasting
        System.out.print("obj downcasted to object B2: ");
        obj2.show2();
    }
}
