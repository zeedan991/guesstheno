

import java.util.Random;
import java.util.Scanner;
class game {
    int user_input;
    int comp_input;
    static int countnumberr;

    game() {
        Random rm = new Random();
        this.comp_input = rm.nextInt(0, 101);
    }
    void userInput(){
        Scanner sc = new Scanner(System.in);
        this.user_input = sc.nextInt();
    }
    boolean condition(){
        System.out.println("GUESS THE NUMBER FROM 0 TO 100");
        userInput();
        if (user_input == comp_input){
            System.out.println("YOU HAVE WON ");
            countnumberr++;
            return false;
        }
        else if (user_input > comp_input){
            System.out.println("COMPUTER VALUE IS LESS THAN :"+ user_input);
            countnumberr++;
        }
        else{
            System.out.println("COMPUTER VALUE IS GREATER  THAN : "+ user_input);
            countnumberr++;
        }

        return true;
    }
    public void no_of_try(){
        System.out.println("YOU TOOK " +countnumberr + " TRIES ");
    }
}
public class guestheno{
    public static void main(String[] args) {
        System.out.println(" \t<WELCOME TO GUESS THE NUMBER GAME>");
        System.out.println("COMPUTER HAS CHOSEN A WORD ");
        game gn = new game();
        while(gn.condition()){
            if(!gn.condition()){
                gn.no_of_try();
                break;
            }
        }

    }
}