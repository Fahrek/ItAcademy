import java.util.Random;
import java.lang.String;
import java.util.Scanner;

public class Dice
{
    public final static int ONE   = 0;
    public final static int TWO   = 1;
    public final static int THREE = 2;
    public final static int FOUR  = 3;
    public final static int FIVE  = 4;
    public final static int SIX   = 5;

    private int diceResult;

    public Dice()
    {
        rollDice();
    }

    public void rollDice()
    {
        Random rand = new Random();
        diceResult  = rand.nextInt(5);
    }

    public String getDiceResult()
    {
        if (diceResult == ONE)
        {
            return "ONE";
        } else if (diceResult == TWO) {
            return "TWO";
        } else if (diceResult == THREE) {
            return "THREE";
        } else if (diceResult == FOUR) {
            return "FOUR";
        } else if (diceResult == FIVE) {
            return "FIVE";
        } else if (diceResult == SIX) {
            return "SIX";
        } else {
            return "INVALID";
        }
    }
}
