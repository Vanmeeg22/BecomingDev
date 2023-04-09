enum Status{
    Running, Failed, Pending, Success;
}

public class EnumWithSwitch {
    public static void main(String[] args){
        Status s = Status.Pending;
        
        switch (s) {
            case Running:
                System.out.println("Please wait while we are working on it. Come back after the completion of task.");
                break;
            case Failed:
                System.out.println("Try again!");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Success:
                System.out.println("Done!");
                break;
            default:
                break;
        }
    }
}
