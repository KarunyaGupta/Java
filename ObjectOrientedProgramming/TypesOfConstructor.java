class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Karunya"); // constructor
        System.out.println(s1.name); // Print the name of the student
        Student s2 = new Student(123);
        System.out.println(s2.roll);

       
    }
}


// parametrise Constructor
class Student {
    String name;
    int roll;

// constructor overloading  and this is an example of polymorphism 
    Student(String name) {
        this.name = name;
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}



