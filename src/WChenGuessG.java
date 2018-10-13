import java.util.Scanner;
public class WChenGuessG {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to guess the number? (yes or no)");
        String game = input.nextLine();
        if (game.equals("yes")) {
            int level = 0;
            while (level<1 || level >4) {
                System.out.println("Please Choose difficulty from 1 to 4");
                level = input.nextInt();
            }
            int n = (int) (Math.random() * Math.pow(10, level) + 1);
            int nGuess = 0;
            int guess = 0;
            while (!(guess == n)) {
                System.out.println("Guess the number!");
                guess = input.nextInt();
                nGuess++;
                if (guess > n) {
                    System.out.println("Too High!");
                }
                if (guess < n) {
                    System.out.println("Too Low!");
                }
            }
            System.out.println("Congradulations! It took you " + nGuess + " tries to get the number " + n + "!");
        }
        if (game.equals("no")){
            System.out.println("Then you think of an Integer from 1 to 100");
            System.out.println("Are ready?");
            input.nextLine();
            int max = 101;
            int min = 0;
            String response ="";
            int nGuess = 0;
            int guess = (int)(Math.random()*100+1);
            System.out.println("I will start guessing now!");
            while (!(response.equals("correct"))){
                System.out.println("Is your number " + guess+ "? (Type in correct, higher, or lower)");
                nGuess++;
                response = input.nextLine();
                if (response.equals("higher")){
                    min = guess;
                }
                if (response.equals("lower")){
                    max = guess;
                }
                if (!(min+1 ==max)){
                    while (!(guess>min) || !(guess<max)){
                        guess = (int)(Math.random()*100+1);
                    }
                }
                else{
                    System.out.println("Then what the hell is your number???");
                    response = "correct";
                }
            }
            if (min==max) {
                System.out.println("Yay! It only took me " + nGuess + " tries to get your number!");
            }
        }
    }
}
