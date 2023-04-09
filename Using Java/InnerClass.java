class A3{
    void show(){
        System.out.println("In A3");
    }
    class B3{
        void show2(){
            System.out.println("In B3");
        }
    }
}
public class InnerClass {
    public static void main(String[] args){
        A3 obj = new A3();
        obj.show();
        A3.B3 obj2 = obj.new B3();
        obj2.show2();
    }
}
