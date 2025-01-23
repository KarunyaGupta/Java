// cannot create an instance of abstract class (instace -> object);
    // can have abstract or non abstract menthod 
    // can have constructors 
class AbstractClasses{
   public static void main(String[] args){
        Horse h = new Horse();
        h.eat();
        h.walk();

        // practice
        System.out.println(h.changeColor());

        // no object is created of parent class 
   }
}


abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
        
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk(); // no implementation

    // set mendatory to all the sub classes or 
}


// sub class 
class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }


    // for practice
    String changeColor(){
        color  = "black";
        return color;
    }
}

