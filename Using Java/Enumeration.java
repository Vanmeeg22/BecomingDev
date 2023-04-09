enum Status{
    Running, Failed, Pending, Success;
}

class Enumeration{
    public static void main(String[] args){
        Status s = Status.Running;
        System.out.println(s);
    }
}