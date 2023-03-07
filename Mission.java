package gameProject;
import java.util.*;



class Guesser{
    int guessNum;
     int guessing(){
         Scanner scan=new Scanner(System.in);
         System.out.println("Guesser ! kindly guess the number");
         guessNum =scan.nextInt();
        return  guessNum;


    } 
    
}
class Players{
    int guessNum;
  int guessingTheNumber(){
      Scanner scan=new Scanner(System.in);
      System.out.println("player ! kindly guess the number ");
      int guessNum=scan.nextInt();
       return guessNum;


    }


}

 

class Umpire {
    int guessByGuesser;
    int numFromPlayer_1;
    int numFromPlayer_2;
    int numFromPlayer_3;
   void collectNumberFromGuesser() {
    Guesser red=new Guesser();
     guessByGuesser=red.guessing();
   
   
    }
    void collectNumberFromPlayers(){
    Players p1=new Players();
     Players p2= new Players();
    Players p3= new Players();
    numFromPlayer_1=p1.guessingTheNumber();
    numFromPlayer_2=p2.guessingTheNumber();
    numFromPlayer_3=p3.guessingTheNumber();

        
    }
     void compare(){

        if(guessByGuesser==numFromPlayer_1){
            if(guessByGuesser== numFromPlayer_2 && guessByGuesser== numFromPlayer_3){
  System.out.println("player_1 and player_2 and also player_3 win the game ");
        }
        else if(guessByGuesser==numFromPlayer_2){
            System.out.println("player_1 and player_2 are win");
        }
        else if( guessByGuesser==numFromPlayer_3){
            System.out.println("player_1 and player_3 are win");
                                  }
        
        else{
            System.out.println("player_1 are win");}
        }
        else if(guessByGuesser==numFromPlayer_2){
            if( guessByGuesser== numFromPlayer_1){
                System.out.println("player_2 and player_1 are win ");
                      }
                      else if( guessByGuesser==numFromPlayer_3){
System.out.println("player_2 and player_3 are win");
                      }
                    
            else{
            System.out.println("player_2 are win");}
        }
        else if(guessByGuesser==numFromPlayer_3){
            if(guessByGuesser== numFromPlayer_1 && guessByGuesser== numFromPlayer_2){
                System.out.println(" player_3 and player_2 and also player_1 win the game ");
                      }
                      else if( guessByGuesser==numFromPlayer_2){
                        System.out.println("player_3 and player_2 are win");
                                              }
                                              else if( guessByGuesser==numFromPlayer_1){
                                                System.out.println("player_1 and player_3 are win");
                                                                      }
                  
                      else{
            System.out.println("player_3 are win");}
        }
        else{
            System.out.println("game is over");
        }
    }
}

public class Mission {
    public static void main(String[] args) {
        
    System.out.println("start a new game");
    Umpire u=new Umpire();
    u.collectNumberFromGuesser();
    u.collectNumberFromPlayers();
    
    u.compare();

    }
}
