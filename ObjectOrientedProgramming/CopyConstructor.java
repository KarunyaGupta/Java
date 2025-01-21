class CopyConstructor{
     // properties of obj1 is copied to obj2 

     public static void main(String[] args){
        Student s1= new Student();
        s1.name = "Karunya";
        s1.rollNumber = 123;
        s1.setPassword("Karunya");
        String pass = s1.getPassword();
        System.out.println(pass);




        Student s2 = new Student(s1);
        s2.setPassword("s2");
        s1.name = "Gupta"; // name change 
        System.out.println(s1.name + " " + s2.name);


        // in case of array it take a reference 

        // so the change in s1 object also change the s2 object value 
        // when the refernce of object is given
        // to overcome it we have to learn a shallow copy and deep copy
     }
}

class Student{
    String name;
    int rollNumber;
    private String password;

    Student(){
        System.out.print("Constructor is called...");

    }

    Student(String name){
        this.name = name;
    }
    //function

    void setPassword(String pass){
        this.password = pass;
    }
    String getPassword(){
        return password;
    }



    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
    }
}