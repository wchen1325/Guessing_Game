import java.util.Scanner;
public class WChenGuessG {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose difficulty from 1 to 4");
        int level = input.nextInt();
        int n = (int)(Math.random() * Math.pow(10,level)+1);
        int nGuess = 0;
        int guess = 0;
        while (!(guess == n)){
            System.out.println("Guess the number!");
            guess = input.nextInt();
            nGuess++;
            if (guess > n){
                System.out.println("Too High!");
            }
            if (guess < n){
                System.out.println("Too Low!");
            }
        }
        System.out.println("Congradulations! It took you " + nGuess + " tries to get the number" + n + "!");
    }
}
