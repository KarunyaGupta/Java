
// Interface is a blue print of class 


// All methods are public , abstract and witout implementation 
// used to achieve total abstraction 
// variable in the interface are final , public and static 

interface MyInterface{
    int a = 10;
    void display();
    void show();
    void print();
}
class Interfaces{
    
    public static void main(String[] args){
        MyInterface obj = new MyInterface(){
            public void display(){
                System.out.println("Display");
            }
            public void show(){
                System.out.println("Show");
            }
            public void print(){
                System.out.println("Print");
            }
        };
        obj.display();
        obj.show();
        obj.print();
    }
}
