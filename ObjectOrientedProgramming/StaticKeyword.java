
// // static keyword in java is used to share same variable or method of the given calss 

// --> properties
// --> function
// --> Block
// --> nested class 
// for static memory allocate only once
class StaticKeyword{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.schoolName ="Lords Convent";
        Student s2 = new Student();
        System.out.println(s2.schoolName); // LordsConvent

        Student s3 = new Student();
        s3.schoolName = "ABC"; // schoolName changed
        System.out.println(s1.schoolName); // ABC

        Student s4 = new Student();
        System.out.println(s4.schoolName); // ABC
        
    }
}


class Student{
    // no multiple creation , use of same value , no multiple memory storage for the same value
    static int returnPercentage(int math , int physics , int chem){
        return ((math+physics+chem)/3)*100;
    }
    String name;
    int roll;
    static String schoolName; // static 

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}





