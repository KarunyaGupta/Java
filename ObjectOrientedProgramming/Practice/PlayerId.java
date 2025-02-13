class PlayerIdAllote{
    static int count = 100;
    PlayerIdAllote(){
        count++;
    }
}

class PlayerId{
    public static void main(String[] args){
        PlayerIdAllote p1 = new PlayerIdAllote();
        System.out.println("Id for player p1 = " + PlayerIdAllote.count);
        PlayerIdAllote p2 = new PlayerIdAllote();
        System.out.println("Id for player p2 = " + PlayerIdAllote.count);
    }
}