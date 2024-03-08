package board;

    public class Board{
        public int size;
        public char m[][];
        public Board(int size, char symbol){
            this.size =size;
            m=new char[size][size];
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    m[i][j]=symbol;
                }
            }

        }

        //printing the board
         public void printBoardConfig(){

            int size=this.size;
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                          System.out.print(m[i][j]+" ");  
                }
                System.out.println();
            }
        }
    }

