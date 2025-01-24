// find out the correct statment to assign name to object

class q1{
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Karunya";  // use dot operator to access
        System.out.print(s.name);
    }
}

class Student{
    String name;
    int marks;
}