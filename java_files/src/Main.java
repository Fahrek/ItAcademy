import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
//        System.out.println("Enter 'Roll the Dice' literally: ");
////        Scanner in = new Scanner(System.in);
////        int age = in.nextInt();

        Dice d = new Dice();
        System.out.println("Initial: " + d.getDiceResult());
        for(int i = 0; i < 2; i++)
        {
            d.rollDice();
            System.out.println("After Roll: " + d.getDiceResult());
        }

        /*Coin c = new Coin();
        System.out.println("Initial: " + c.getFaceUp());
        for(int i = 0; i < 10; i++)
        {
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }*/


		/*double power = Math.pow(5, 3);
		System.out.println(power);

		double squareRoot = Math.sqrt(64);
		System.out.println(squareRoot);

		Random rand = new Random();
		int randomNumber = rand.nextInt();
		int randomNumberWithBound = rand.nextInt(10);
		System.out.println(randomNumber);
		System.out.println(randomNumberWithBound);*/

        // FOR LOOP
		/*System.out.println("For Loop");
		for(int i = 3; i >= 0; i--)
		{
			System.out.println("Current i: " + i);
		}
		System.out.println();*/

        // DO WHILE
				/*System.out.println("Do-While Loop");
				int y = 3;
				do {
				 System.out.println("Current y: " + y);
				 y = y - 1;
				} while (y > 0);
				System.out.println("Final y: " + y);
				System.out.println();*/

        // WHILE
		/*System.out.println("While Loop");
		int x = 3;
		while(x > 0)
		{
		 System.out.println("Current x: " + x);
		 x = x - 1;
		}
		System.out.println("Final x: " + x);
		System.out.println();*/

		/*System.out.println("Enter an age: ");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if( age >=0 && age <=5 ) {
			System.out.println("Baby");
		}else if( age >=6 && age <=11 ){
			System.out.println("Kid");
		}else if( age >=12 && age <=17 ){
			System.out.println("Teen");
		}else if( age >=18 ){
			System.out.println("Adult");
		}else {
			System.out.println("Invalid");
		}

		System.out.println("Thanks for using this program!");

		System.out.println("Hello World");


        Dog myDog = new Dog(4,
        					1,
                            "Doug",
                            "dogo",
                            Color.GRAY,
                            false);


        Dog veroDog = new Dog (4,
        					   3,
                               "Cabreadito",
                               "pug",
                               Color.BLACK,
                               true);

        System.out.println("My dog name: " + myDog.name);
        System.out.println("Vero dog name: " + veroDog.name);

        myDog.changeColor(Color.GREEN);

        System.out.println("My dog color: " + myDog.color);

        System.out.println("My dog says: ");
        myDog.bark();

        int dogAge = myDog.getDogYears();
        System.out.println(dogAge + " Dog Age");*/

    }
}