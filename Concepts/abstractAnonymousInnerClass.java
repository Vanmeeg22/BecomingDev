abstract class A5{
    abstract void show();
    abstract void disguise();
}

public class abstractAnonymousInnerClass {
    public static void main(String[] args){
        A5 obj = new A5(){
            void show(){
                System.out.println("In the show method...");
            }

            void disguise(){
                System.out.println("Disguised successfully");
            }
        };

        obj.show();
        obj.disguise();
    }
}
