public class Stationary{
    public static void main(String[] args){
        
        Pen flair = new Pen();

        flair.color = "Red";
        flair.thickness = 5;
        flair.print();

        flair.setColor("Blue");
        flair.setThickness(10);
        flair.print();

    }
}

class Pen{
    String color;
    int thickness;
    void setColor(String newColor){
        color = newColor;

    }
    void setThickness(int setThick){
        thickness = setThick;
    }

    void print(){
        System.out.println(color);
        System.out.println(thickness);
    }
}