class Students{
    String name;
    int age;
    int id;
}

public class Array_of_objects {
    public static void main(String[] args){
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student1.name = "Aaman";
        student1.age = 20;
        student1.id = 12650;

        student2.name = "Agnes";
        student2.age = 19;
        student2.id = 23570;

        student3.name = "Raahul";
        student3.age = 20;
        student3.id = 34800;

        Students stud[] = new Students[3];
        stud[0] = student1;
        stud[1] = student2;
        stud[2] = student3;


//        for (int i=0; i<stud.length; i++){
//            System.out.print(stud[i].name+", "+stud[i].age+", "+stud[i].id);
//            System.out.println();
//        }

        //Enhanced For loop:
        for (Students s: stud){
            System.out.print(s.name+", "+s.age+", "+s.id);
            System.out.println();
        }
    }
}
