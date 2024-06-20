abstract class Car{
    public abstract void drive();
    public abstract void nitro();
    public void playMusic(){
        System.out.println("Playing Music...");
    }
}
abstract class Ford extends Car{
    public void drive(){
        System.out.println("Driving with the steer...");
    }
}

class UpdatedFord extends Ford{
    @Override
    public void nitro() {
        System.out.println("Boosted and flying...");
    }
}
public class abstractKeyword {
    public static void main(String[] args){
        Car obj = new UpdatedFord();
        obj.drive();
        obj.playMusic();
        obj.nitro();
    }
}
