import java.util.*;

class Inputs{
    String name;
    int age;
    Inputs(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge();
    }
}


public class objectArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Inputs> list = new ArrayList<>();
         
        while(true){
            System.out.print("Enter your name: ");
            String name = in.nextLine();
            if(name.equals("exit")){
                break;
            }
            System.out.print("Enter your age: ");
            int age = in.nextInt();
            in.nextLine();
            Inputs data = new Inputs(name, age);

            list.add(data);
            System.out.println(data);

            
            

        }

        System.out.println("\nCollected Data: ");
        for(Inputs input : list){
            System.out.println(input);
        }

        
    }
}