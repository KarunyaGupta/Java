class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Karunya"); // constructor
        System.out.println(s1.name); // Print the name of the student


        Teacher t1 = new Teacher(); // constructor is called is print
        // System.out.print
    }
}

class Student {
    String name;
    int roll;

    // Constructor to initialize the name
    Student(String name) {
        this.name = name;
    }
}


class Teacher{
    String name;
    Teacher(){
        System.out.print("Constructor called ...");
    }
}