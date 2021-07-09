import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

/*
Begin

    //Variables
    Create randomizer1
    Create randomizer2
    Create randNum1
    Create randNum2
    Create addingScore //this score will have the sum of all dice rolls
    Create singleSore //this score will only be the most recent roll

    //While Loops
    Welcome user to the game
    Create a while loop
        while users response = yes and addingScore is less then or equal to 100
            generate two new random numbers
            create a continuous counter
            display users rolls and score
            Create if statement
                if the sum of the two rolls is equal to 2
                    add 25 to addingScore
                else if randNum1 or randNum2 are equal to 1
                    nothing is add to addingScore
                else
                    add the sum of randNum1 and randNum2 to addingScore
        Display addingScore to user
        Prompt user if they would like to play again
        Store user response(yes or no)

        Once user has reached 100 or has said no end program, tell user amount of turns and final score
End

 */
public class GameOfDice {
    public static void main(String[] args){
        //Variables
        Scanner kybd = new Scanner(System.in);
        Random randomizer1 = new Random();
        Random randomizer2 = new Random();
        String userInput = "yes";

        int addingScore = 0, counter = 0;

        //intro
        System.out.println("Welcome! Let's Roll Some Dice!");

        //LoopsG
        while(userInput.equals("yes") && addingScore < 100){
            int singleScore = 0;
            int randNum1 = 1 + randomizer1.nextInt(6);
            int randNum2 = 1 + randomizer2.nextInt(6);
            counter++;
            System.out.printf("You rolled %d & %d \n", randNum1, randNum2);
            if(randNum1 + randNum2 == 2){
                addingScore += 25;
            }
            else if(randNum1 == 1 || randNum2 == 1){
                addingScore += 0;
            }
            else{
                singleScore = randNum1 + randNum2;
                addingScore += singleScore;
            }
            System.out.printf("Score: %d\n", addingScore);

            System.out.print("Roll again (yes/no)? ");
            userInput = kybd.nextLine();
            userInput = userInput.toLowerCase();
        }

        if(addingScore >= 100){
            System.out.print("You Scored Over 100!\n");
            System.out.printf("Program has end! Good Game! Your Score After %d Rounds Was: %d\n", counter, addingScore);
        }
        else{
            System.out.printf("Program has end! Good Game! Your Score After %d Rounds Was: %d", counter, addingScore);
        }

    }
}
