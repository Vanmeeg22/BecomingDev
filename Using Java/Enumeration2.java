enum Status{
    Running, Failed, Pending, Success;
}

public class Enumeration2 {
    public static void main(String[] args){
        Status[] sArr = Status.values();

        for(int i=0; i<=3; i++){
            System.out.println(sArr[i]);
        }
    }
}
