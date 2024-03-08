package game;
import player.Player;
import board.Board;
import java.util.*;

public class Game {
     Player[] players;
     Board board;
     int turn;
     int moves;
     boolean gameover;
     String  zero;
     String cross;
     Scanner sc=new Scanner(System.in);

     public Game(Player[] players, Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.gameover=false;

        StringBuilder z= new StringBuilder();
        StringBuilder c=new  StringBuilder();

        for(int i=0;i<board.size;i++){
            z.append('O');
            c.append('X');
        } 

        this.zero=z.toString();
        this.cross=c.toString();

     }

     public void printBoardConfig(){
        int sz=this.board.size;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(board.m[i][j]+" ");
            }
            System.out.println();
        }
     }
     public void play(){
        printBoardConfig();
        int sz=this.board.size;

        while(!gameover){
            moves++;
            int index=getIndex();

            int row=index/sz;
            int col=index%sz;

            board.m[row][col]=players[turn].getplayersymbol();
            
            //draw
            if(moves>= sz*sz){
                System.out.println("Game Draw");
                return;
            }
            
            
            //winner
            if(moves>=2*sz-1 && checkcombinations() == true){
                gameover =true;
                printBoardConfig();
                System.out.println("Winner is: "+ players[turn].getplayername());
                return;
            }

            
            // turn=0 =>0+1 =1%2 =1;
            // turn =1=>1+1 =2%2 =0;

            turn =(turn+1)%2;
            printBoardConfig();

        }


     }
     public int getIndex(){
        while(true){

           
            System.out.println("Player: "+players[turn].getplayername()+" Enter a position");
            
            int pos=sc.nextInt()-1;

            int sz=board.size;
            int row=pos/sz;
            int col=pos%sz;

            //check for invalid position
            if(row<0 || row>=sz || col<0 || col>=sz){
                System.out.println("Invalid position");
                continue;
            }
            
            //check for vaccant positions
            if(board.m[row][col]!='-'){
                System.out.println("Position already occupied");
                continue;
            }
            return pos;
        }
     }
     public boolean checkcombinations(){
        int sz=board.size;

        //row wise 
        for(int i=0;i<sz;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.m[i][j]);
            }
            
            String pattern = sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }
        }

        //column wise
        for(int i=0;i<sz;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.m[j][i]);
            }
            String pattern =sb.toString();
            if(pattern.equals(zero)|| pattern.equals(cross)){
                return true;
            }
        }

        //diagonal
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();

        while(i<sz){
            sb.append(board.m[i][j]);
            i++;
            j++;
        }
        String pattern =sb.toString();
        if(pattern.equals(zero)||pattern.equals(cross)){
            return true;
        }

        //anti diagonal
        i=0;
        j=sz-1;
        sb=new StringBuilder();
        while(i<sz){
            sb.append(board.m[i][j]);
            i++;
            j--;
        }
      pattern =sb.toString();
        if(pattern.equals(zero)||pattern.equals(cross)){
            return true;
        }
    
        return false;
     }
}
