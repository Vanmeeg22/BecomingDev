interface A6{
    int age = 21;   // The variables are 'final static' by default.
    String place = "Mumbai";
    void show();    // The methods are 'public abstract' by default.
    void alarm();
}

public class Interface {
    public static void main(String[] args){
        A6 obj = new A6(){
            public void show(){
                System.out.println("Showing...");
            }
            public void alarm(){
                System.out.println("Alarming...");
            }
        };

        obj.show();
        obj.alarm();

        System.out.println(A6.age);
        System.out.println(A6.place);
    }
}
