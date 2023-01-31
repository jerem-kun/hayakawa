import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Commons com = new Commons();
        Scanner sc = new Scanner(System.in);

        //prompt new game
        while(true){
            System.out.println("\n\n<<Would you like to play BATTLESHIP against HAL-9K? (Y/N)>>");
            String start = sc.next().toUpperCase();

            //game loop
            if(start.equals("Y")){
                Board game = new Board();
                com.printBoard(game.getEmptyBoard());
                User one = new User();
                game.createBotShips();
                com.printBoard(game.getBotBoard()); //cheat sheet
                com.printPOV(game.getP1POV());
                System.out.println("Select a coordinate to fire on.");
            while(game.getBotShips()>0 && one.getUserShips()>0){
                game.guessBotShips();
                one.guessUserShips();
            }
            
            if(game.getBotShips()==0){
                System.out.println("\n<<PLAYER WINS>>\n<<GOOD GAME>>\n");
            }else{
                System.out.println("\n<<HAL-9K WINS>>\n<<GOOD GAME>>\n");
            }
            
            //exit program
            }else if(start.equals("N")){
                System.out.println("\n>.<");
                System.out.println("Goodbye...");
                System.exit(0);
            }
        }

        }
}
