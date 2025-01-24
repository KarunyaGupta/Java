//which variables ccan the call person access in the code
class q2{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNumber = 122;
        s1.name = "karunya";

        System.out.print(s1.name);
    }
}

class Person{
    String name; // only name adn waight can be accessible
    int waight;
}
 
class Student extends Person{     // inheritance
    int rollNumber;
    String SchoolName;
}