import board.Board;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("First Project -> Tic Tac Toe");

        Board b=new Board(3,'-');
        b.printBoardConfig();

        Player p1=new Player();
        
        p1.setplayernameandsymbol("Maya",'X');
        p1.getplayernameandsymbol();

        Player p2=new Player();
        p2.setplayernameandsymbol("Riya",'O');
        p2.getplayernameandsymbol();

        Game game =new Game(new Player[] {p1, p2},b);
        game.play();

    }
}


