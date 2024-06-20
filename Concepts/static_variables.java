class Mobile{
    String brand;
    int price;
    static String name = "cellPhone";

    void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class static_variables {
    public static void main(String[] args){
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.name = "Cell Phone";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1800;
        Mobile.name = "Smart Phone";

        m1.show();
        m2.show();

    }
}
