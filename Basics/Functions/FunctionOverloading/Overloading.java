public class Overloading{
    public static void main(String[] args){
        fun(30);
        fun("Karunya");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    } // same funct ion name but different parameters 
}