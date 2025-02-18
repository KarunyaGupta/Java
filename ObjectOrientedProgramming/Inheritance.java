class Inheritance{
    // list our human generation
     // classA function --> inharit to classB(take a properties)
    // classA = parent
    // classB = child 
    public static void main(String[] args){

        // Fish shark = new Fish();
        // shark.eat();
        // shark.color = "Blue";
        // System.out.println("color: " + shark.color);
        // shark.swim();

        Dogs dog = new Dogs();
        dog.bread = "Indian Street Dog";
        dog.eat();
        dog.legs = 4;
        System.out.println(dog.legs);
        Human karunya = new Human();
        karunya.name = "Karunya";
        karunya.color = "Fair";
        karunya.mentalHealth = "unStable";
        System.out.println(karunya.mentalHealth);
        System.out.println(karunya.color);
    }


}
// Base class  / Parent  
class Animal{
    String name;
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("Breath");
    }
}
// Drived Class / child
class Mammals extends Animal {
    int legs;
}

class Dogs extends Mammals{
    String bread;
}

class Human extends Mammals{
    String mentalHealth;
}



// miltilevel , single level  , hierarchial 


// hierarchial --> 1 base class , and others are derived


// hybrid inheritance --> mixture of all other inheritances 
