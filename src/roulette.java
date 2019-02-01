import java.util.Random;
import java.util.Scanner;

public class roulette {
    public static void main(String[] args){
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        String betType = " ";
        int betAmount = 0;
        int wheelNum = 0;
        int black = 0;
        int red = 1;

        System.out.println("WELCOME! Let's play some Roulette! \n");
        //asking user question

        System.out.println("What type of bet would you like to place? \n");
        System.out.println("Red: You are betting that the next roll will come up red.\n" +
                "Black: You are betting that the next roll will come up black.\n" +
                "Even: This is wagering that the ball will land on an even number between 1-36.\n" +
                "Odd: This is wagering that the ball will land on an odd number between 1-36.\n" +
                "Low: This is a bet that the next number will be between 1 and 18.\n" +
                "High: This is a bet that the next number will be between 19 and 36.\n");

        betType = keyboard.next();
        System.out.println("Are you sure you would like to play?");
        String question = "yes";
        boolean play=Boolean.parseBoolean(question);
        do{
            public String getOutcome(String betType){
                String winnings;
                switch (betType) {
                    case "red":
                        winnings = " ";
                        break;
                    case "black":
                        winnings = " ";
                        break;
                    case "even":
                        winnings = " ";
                        break;
                    case "low":
                        winnings = " ";
                        break;
                    case "high":
                        winnings = " ";
                        break;
                    default:
                        winnings = "You did not place a valid bet";
                }
                return winnings;
            }}}while()}