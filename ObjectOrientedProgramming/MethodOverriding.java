
// parent and childe classes bot contain the same 
// function with different defination
// runtime polymorphism 

class MethodOverriding{
    public static void main(String[] args){

        Animal an = new Animal();
        an.eat();// run 

        Human hu = new Human();
        hu.eat(); // run the function inside the Human not in an animal
    }
}
// parent class Animal
class Animal{
    void eat(){
        System.out.println("Eat Anything!");
    }
}

// child class Human
class Human extends Animal{
    void eat(){
        System.out.println("Eat Anything!!!");
    }
}

