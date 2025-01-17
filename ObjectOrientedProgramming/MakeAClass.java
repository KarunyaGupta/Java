class MakeAClass{
    public static void main(String[] args){
        // data of 5 students
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];


        // Student[]  = new Student[5];

        // accessing the data of student
        // using dot operator


        // Student student1;
        // // student1.name = "Karunya";
        // System.out.print(student1.rno);


        Student obj = new Student();
        Student student2 = new Student();

        obj.id = 1;
        obj.name = "ABC";


        student2.id=2;
        student2.name = "Karunya";
        

        obj.printStudent();

        student2.printStudent();


        Feculity f1 = new Feculity();
        f1.id = 10;
        f1.name = "Rishabh";
        f1.department = "IT";

        f1.printFeculity();
        
    }
    
    
}
// create a class;
class Student{
    int id;
    String name;

    public void printStudent()
    {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }
}
//     int[] rno = new int[5];
//     String name = new String[10];
//     float[] marks = new float[5];


class Feculity{
    int id;
    String name;
    String department ; // attributes
    public void printFeculity(){ // function
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("department: "+ department);
    }
}
