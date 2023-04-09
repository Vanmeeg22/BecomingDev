@FunctionalInterface    // This annotation makes sure that the interface below it only has one method to be defined.

interface A{
    void show();
}

public class FunctionalInterfaceFile {
    public static void main(String[] args){

        A obj = new A(){
            public void show(){
                System.out.println("In Show!");
            }
        };

        obj.show();
    }
}
