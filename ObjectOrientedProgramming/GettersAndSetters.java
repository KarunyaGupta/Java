class GettersAndSetters{
    public static void main(String[] args){
        Collage chitkara = new Collage();

        chitkara.setName("Chitkara University");
        System.out.print(chitkara.getName());
        chitkara.setYear(2025);
        System.out.print(chitkara.getYear());
    }
}

class Collage{
    private String name;
    private int year;

    String getName(){
        return this.name;
    }
    int getYear(){
        return this.year;
    }
    void setName(String newName){
        this.name = newName;
    }
    void setYear(int newYear){
        this.year = newYear;
    }
    
}