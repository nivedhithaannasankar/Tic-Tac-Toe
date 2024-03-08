package player;

public class Player {
    private String name;
    private char symbol;
    private int age;
    private String address;
    private String number;
    private String email;

  
    public void setPlayerDetails(String name,char symbol,String address,String number,String email,int age){
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.number=number;
        this.email=email;
        this.age=age;

    }
    
    public  void setplayernameandage(String name,int age){
        this.name=name;
        this.age=age;

    }
     public void getplayernameandsymbol(){
        System.out.println("Player name: "+this.name);
        System.out.println("Player symbol: "+this.symbol);
     }
     public void setplayernamesymbolemailage(String name,char symbol,String email,int age){
        this.name=name;
        this.age=age;
        this.email=email;
        this.symbol=symbol;
     } 

     public void setplayernameandsymbol(String name, char symbol){
        this.name=name;
        this.symbol=symbol;
     }

     public String getplayername(){
        return this.name;
     }
     public char getplayersymbol(){
        return this.symbol;
     }

  public void getplayernameandage(){
    System.out.println("Player name: "+this.name);
    System.out.println("Player age: "+this.age);
   }

     public void getplayerdetails(){
        System.out.println("Player name: "+this.name);
        System.out.println("Player symbol: "+this.symbol);
        System.out.println("Player email: "+this.email);
        System.out.println("Player age: "+this.age);
        System.out.println("Player number: "+this.number);
        System.out.println("Player address: "+this.address);
     }

}
