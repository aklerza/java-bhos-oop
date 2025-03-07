import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Player[] players = new Player[3];
        players[0]= new Player("Ahmad", 24);
        players[1] = new Player("Abbas", 44);
        players[2]= new Player("Kazim", 7);
        Arrays.sort(players, new Checker());
        for(Player player : players){
            System.out.println(player.name+" "+player.score);
        }
    }
}
