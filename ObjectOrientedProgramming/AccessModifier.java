public class AccessModifier  {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        myAcc.userName = "KarunyaGupta";
        // myAcc.password = "hello"; // private --> not accessible 

        myAcc.setPassword("karunya");
    }
}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pass) {
        password = pass; // Corrected to use 'pass'
    }
}