import java.util.Scanner;

enum Laptop{
    Macbook(2000), DellXPS(2200), Surface(), ThinkPad(1800);

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args){
        
        // Scanner scan = new Scanner(System.in);

        // int p1 = scan.nextInt();

        for (Laptop lap : Laptop.values()){
            // System.out.print("Enter the price: ");
            // lap.setPrice(p1);
            System.out.println(lap + ":" +lap.getPrice());
        }
    }
}
