import java.util.*;

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("YES ITS WORKS UNDER CLASS");
//     }
// }



class basics{
    public static void main(String[] args){
        A obj = new B();
        obj.show();
    }
}