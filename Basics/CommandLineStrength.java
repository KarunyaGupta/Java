public class CommandLineStrength{
    public static void main(String[] args) {
        System.out.println("Program start executing");
        System.out.println("Number of arguments passed: "+ args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("Arguments: " + args[i]);
        }
    }
}