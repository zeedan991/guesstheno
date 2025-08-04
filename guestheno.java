

import java.util.Random;
import java.util.Scanner;
            class game {
                public int userinput;
                int compinput;

                game() {
                    Random rm = new Random();
                    this.compinput = rm.nextInt(0, 100);
                }
                void userInput(){
                    Scanner sc = new Scanner(System.in);
                    this.userinput = sc.nextInt();
                }
                boolean conndition(){
                    System.out.println("ENTER A NO THAT U WANT TO GUESS ");
                    userInput();
                    if (userinput== compinput){
                        System.out.println("YOU HAVE WON ");
                        return false;
                    }
                    else if (userinput>compinput){
                        System.out.println("COMPUTER VALUE IS LESS THAN :"+userinput);
                    }
                    else{
                        System.out.println("COMPUTER VALUE IS GREATER  THAN : "+userinput);
                    }

                    return true;
                }
            }
            public class guestheno{
                public static void main(String[] args) {

                    game gn = new game();
                    while(gn.conndition()==true) {
                        gn.conndition();
        }
    }
}