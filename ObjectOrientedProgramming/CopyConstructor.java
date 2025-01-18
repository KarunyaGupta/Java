class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // constructor
       
       s1.name = "Karunya";
       s1.roll = 3323;
       s1.password = "abc";


        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

       Student s2 = new Student(s2);
        s2.password = "djwd";



        // printing the marks of s1

        for(int i=0;i<3;i++){
            System.out.println(s2.marks);
        }
      
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // COPY CONSTRUCTOR ---> property of s1 is copied in s2 
   Student (Student s1){
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
    // not a password --> have to change 
   }

}
