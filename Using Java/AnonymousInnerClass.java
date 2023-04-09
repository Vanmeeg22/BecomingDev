class A4{
    void show(){
        System.out.println("In show method");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args){
        A4 obj = new A4(){
            void show(){
                System.out.println("In the temporarily updated show method");
            }
        };

        obj.show();
    }
}
