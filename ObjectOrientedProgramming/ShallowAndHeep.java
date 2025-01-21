class ShallowAndHeep{
    // Shallow --> reference 
    //             changes reflect on the copy constructor

    // Deep --> changes done reflect 

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Karunya";
        s1.roll = 2423;


        s1.marks = new int[3];
        s1.marks[0] = 100;
        s1.marks[1] = 93;
        s1.marks[2] = 23;
        Student s2 = new Student(s1); //copy

        s1.marks[2] = 100; // change not reflect to s2 object
        System.out.print("s2:");
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i] + " ");
        }


        System.out.print("\ns1:");
        for(int i=0;i<3;i++){
            System.out.print(s1.marks[i] + " ");
        }
    }

}

class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        System.out.println("Constructor is called...");
    }
    
    //shallow constructor 
    // Student(Student s1){
    //     marks  = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    // deep copy constructor 

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}