// The "Blackjack" class.
import java.awt.*;
import hsa.Console;
import java.text.*;
public class Blackjack
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	// Place your program here.  'c' is the output console

	int cols = c.maxcol ();
	c.setCursor (1, cols / 2);
	c.println ("Blackjack!");

	//Creating the characters
	// - Ask the user to type in their name and the names they would like the CPU's to be names
	// - Create 3 variables(user, cpu1, and cpu2) using the "c.readString();" command to store the users input for the names

	c.print ("What is your name?");
	String user = c.readString ();
	c.print ("\nWhat would you like the name of Dealer to be?");
	String cpu1 = c.readString ();
	c.print ("\nWhat would you like the name of Player #2 to be?");
	String cpu2 = c.readString ();

	//Assigning random ammount of money to the characters
	// - Create 3 random numbers using the "Math.random();" command
	// - Multiply each random number by 1000 and then add 100 to each.
	// - Name each of the variables "money" and add the players name at the back
	// - Format the money

	DecimalFormat p = new DecimalFormat ("$0.00");

	double usermoney = (Math.random () * 10000) + 100;



	//Creating an array for the money
	// - Create an array for the amount of money each player has
	// - Name this array 'Money'
	// - Store the amounts of money of each players in this array

	double[] money;
	money = new double [1];
	money [0] = usermoney;


	//Create random numbers for the cards
	// - using "Math.random();" generate 2 random numbers for each player
	// - multiply the number by 13 and add 1
	// - convert the number into an integer
	while (true)
	{
	    double dbleusercard1 = (Math.random () * 13) + 1;
	    double dbleusercard2 = (Math.random () * 13) + 1;
	    double dblecpu1total = ((Math.random () * 13) + 1) + ((Math.random () * 13) + 1);
	    double dblecpu2total = ((Math.random () * 13) + 1) + ((Math.random () * 13) + 1);

	    int usercard1 = (int) (dbleusercard1);
	    int usercard2 = (int) (dbleusercard2);
	    int cpu1total = (int) (dblecpu1total);
	    int cpu2total = (int) (dblecpu2total);



	    //Name the numbers generated after the cards
	    // - Using an array name each of the numbers after cards (1 = ace, 2 = two.... 11 = jack etc.)
	    // - Randomly deal out 2 cards to each player of the
	    c.clear ();
	    cols = c.maxcol ();
	    c.setCursor (1, cols / 2);
	    c.println ("Blackjack!");
	    c.print ("\nYou have ");
	    c.setTextColor (Color.blue);
	    c.println (p.format (money [0]));
	    c.setTextColor (Color.black);
	    String[] name;
	    name = new String [13];
	    name [0] = "Ace";
	    name [1] = "Two";
	    name [2] = "Three";
	    name [3] = "Four";
	    name [4] = "Five";
	    name [5] = "Six";
	    name [6] = "Seven";
	    name [7] = "Eight";
	    name [8] = "Nine";
	    name [9] = "Ten";
	    name [10] = "Jack";
	    name [11] = "Queen";
	    name [12] = "King";

	    c.print ("\nYou have received a ");
	    c.setTextColor (Color.blue);
	    if (usercard1 == 1)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [0];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 2)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [1];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 3)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [2];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 4)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [3];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 5)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [4];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 6)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [5];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 7)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [6];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 8)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [7];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 9)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [8];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 10)
	    {
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [9];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 11)
	    {
		usercard1 = 10;
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [10];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 12)
	    {
		usercard1 = 10;
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [11];
		c.print (usercard1S + "!");
	    }
	    else if (usercard1 == 13)
	    {
		usercard1 = 10;
		String usercard1S = String.valueOf (usercard1);
		usercard1S = name [12];
		c.print (usercard1S + "!");
	    }
	    c.setTextColor (Color.black);
	    c.print ("\n\nYou have received a ");
	    c.setTextColor (Color.blue);
	    if (usercard2 == 1)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [0];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 2)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [1];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 3)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [2];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 4)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [3];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 5)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [4];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 6)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [5];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 7)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [6];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 8)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [7];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 9)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [8];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 10)
	    {
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [9];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 11)
	    {
		usercard2 = 10;
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [10];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 12)
	    {
		usercard2 = 10;
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [11];
		c.print (usercard2S + "!");
	    }
	    else if (usercard2 == 13)
	    {
		usercard2 = 10;
		String usercard2S = String.valueOf (usercard2);
		usercard2S = name [12];
		c.print (usercard2S + "!");
	    }
	    c.setTextColor (Color.black);
	    int total = usercard1 + usercard2;
	    if (usercard1 != 1 && usercard2 != 1)
	    {
		c.print ("\n\nYour total is ");
		c.setTextColor (Color.blue);
		c.print (total);
		c.setTextColor (Color.black);
		c.println ("!");
	    }
	    c.println ("\n---------------------------------------------");
	    if (usercard1 == 1)
	    {
		c.print ("\nWould you like the Ace to equal 1 or 11?");
		int ace = c.readInt ();

		if (ace == 1)
		{
		    total = usercard2 + 1;
		    c.print ("\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!\n");
		    c.setTextColor (Color.black);
		}
		else if (ace == 11)
		{
		    total = usercard2 + 11;
		    c.print ("\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!\n");
		    c.setTextColor (Color.black);
		}
		else if (ace != 1 || ace != 11)
		{
		    while (ace != 1 || ace != 11)
		    {
			c.print ("\nYou have ");
			c.setTextColor (Color.red);
			c.print ("NOT");
			c.setTextColor (Color.black);
			c.print (" entered a valid number. Please enter either 1 or 11.");
			c.print ("\nWould you like the Ace to equal 1 or 11?");
			ace = c.readInt ();
		    }
		}
	    }

	    if (usercard2 == 1)
	    {
		c.print ("\n\nWould you like the Ace to equal 1 or 11?");
		int ace2 = c.readInt ();

		if (ace2 == 1)
		{
		    total = usercard1 + 1;
		    c.print ("\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!\n");
		    c.setTextColor (Color.black);
		}
		else if (ace2 == 11)
		{
		    total = usercard1 + 11;
		    c.print ("\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!\n");
		    c.setTextColor (Color.black);
		}
		else if (ace2 != 1 || ace2 != 11)
		{
		    while (ace2 != 1 || ace2 != 11)
		    {
			c.print ("\nYou have ");
			c.setTextColor (Color.red);
			c.print ("NOT");
			c.setTextColor (Color.black);
			c.print (" entered a valid number. Please enter either 1 or 11.");
			c.print ("\n\nWould you like the Ace to equal 1 or 11?");
			ace2 = c.readInt ();
		    }
		}
	    }
	    //Allow players to place bets
	    // - Let the user input a amount of money that they would like to place, to make a bet
	    // - generate 2 random numbers and make those the bets for the CPU players


	    c.print ("\nWould you like to bet a wager? (Type y for Yes, or any key for no)");
	    String betanswer = c.readString ();

	    c.clear ();
	    cols = c.maxcol ();
	    c.setCursor (1, cols / 2);
	    c.println ("Blackjack!");

	    double bet = 0;
	    if (betanswer.equals ("y"))
	    {
		c.print ("You have ");
		c.setTextColor (Color.blue);
		c.print (p.format (money [0]));
		c.setTextColor (Color.black);
		c.print (". \n\nHow much money would you like to bet? $");
		bet = c.readDouble ();

		if (bet > money[0])
		{
		    while (bet > money[0])
		    {
			c.print ("\n---------------------------------------------\n");
			c.print ("\nPlease enter a value that is less than or equal to your total money.");
			c.print ("\n\nYou have ");
			c.setTextColor (Color.blue);
			c.print (p.format (money [0]));
			c.setTextColor (Color.black);
			c.print (". \n\nHow much money would you like to bet? $");
			bet = c.readDouble ();
		    }
		}


		if (bet < money[0])
		{
		    c.print ("\nYou have bet $");
		    c.setTextColor (Color.blue);
		    c.print (bet);
		    c.setTextColor (Color.black);
		    c.println (" on this match.");
		    c.println ("---------------------------------------------");
		}
	    }
	    else if (!betanswer.equals ("y"))
	    {
		bet = 0;
		c.print ("\nYou have ");
		c.setTextColor (Color.red);
		c.print ("NOT");
		c.setTextColor (Color.black);
		c.print (" placed a bet on this match. You will ");
		c.setTextColor (Color.red);
		c.print ("NOT");
		c.setTextColor (Color.black);
		c.print (" earn anything if you win.");
		c.println ("\n\n---------------------------------------------");
	    }
	    c.print ("\nYour total is ");
	    c.setTextColor (Color.blue);
	    c.print ((total) + "!\n");
	    c.setTextColor (Color.black);
	    c.print ("\nWould you like to hit or stay? (Type h for hit, or any key of stay)");
	    String hitorstay = c.readString ();
	    c.clear ();
	    cols = c.maxcol ();
	    c.setCursor (1, cols / 2);
	    c.println ("Blackjack!");

	    while (hitorstay.equals ("h"))
	    {
		c.print ("You have recieved a ");
		double dbleusercardhit = (Math.random () * 13) + 1;
		int usercardhit = (int) (dbleusercardhit);

		c.setTextColor (Color.blue);

		if (usercardhit == 1)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [0];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 2)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [1];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 3)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [2];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 4)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [3];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 5)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [4];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 6)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [5];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 7)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [6];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 8)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [7];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 9)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [8];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 10)
		{
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [9];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 11)
		{
		    usercardhit = 10;
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [10];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 12)
		{
		    usercardhit = 10;
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [11];
		    c.print (usercardhitS + "!");
		}
		else if (usercardhit == 13)
		{
		    usercardhit = 10;
		    String usercardhitS = String.valueOf (usercardhit);
		    usercardhitS = name [12];
		    c.print (usercardhitS + "!");
		}
		c.setTextColor (Color.black);
		if (usercardhit != 1)
		{
		    total = total + usercardhit;
		    c.print ("\n\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!");
		    c.setTextColor (Color.black);
		}
		if (usercardhit == 1)
		{
		    c.print ("\n\nWould you like the Ace to equal 1 or 11?");
		    int ace = c.readInt ();

		    if (ace == 1)
		    {
			total = total + 1;
			c.print ("\nYour total is ");
			c.setTextColor (Color.blue);
			c.print ((total) + "!");
			c.setTextColor (Color.black);
		    }
		    else if (ace == 11)
		    {
			total = total + 11;
			c.print ("\nYour total is ");
			c.setTextColor (Color.blue);
			c.print ((total) + "!");
			c.setTextColor (Color.black);
		    }
		}

		if (total > 21)
		{
		    c.print ("\n\nYou have gone over ");
		    c.setTextColor (Color.red);
		    c.print ("21");
		    c.setTextColor (Color.black);
		    c.print (". You lose.");
		    money [0] = money [0] - bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.red);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" left.");
		    break;
		}
		if (total <= 21)
		{
		    c.println ("\n---------------------------------------------");
		    c.print ("\nWould you like to hit or stay? (Type h for hit, Type any key for stay)");
		    hitorstay = c.readString ();
		    c.clear ();
		    cols = c.maxcol ();
		    c.setCursor (1, cols / 2);
		    c.println ("Blackjack!");
		}



	    }
	    while (!hitorstay.equals ("h"))
	    {
		c.clear ();

		c.print ("\nYour total is ");
		c.setTextColor (Color.blue);
		c.print ((total) + "!");
		c.setTextColor (Color.black);

		c.print ("\n\n" + cpu1 + "'s total is ");
		c.setTextColor (Color.blue);
		c.print (cpu1total + "!");
		c.setTextColor (Color.black);

		c.print ("\n\n" + cpu2 + "'s total is ");
		c.setTextColor (Color.blue);
		c.print (cpu2total + "!");
		c.setTextColor (Color.black);


		c.println ("\n\n---------------------------------------------");
		if (total > 21)
		{
		    c.print ("\nYou have gone over ");
		    c.setTextColor (Color.red);
		    c.print ("21");
		    c.setTextColor (Color.black);
		    c.print (". You lose.");
		    money [0] = money [0] - bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.red);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" left.");
		}
		else if (cpu1total == cpu2total && total < cpu1total && total < cpu2total)
		{
		 c.print ("\n" + cpu1 + " and " + cpu2 + " have tied!");
		 c.print ("\nNobody wins, You money will stay the same.");
		}
		else if (cpu1total <= 21 && cpu1total > total)
		{
		    c.print ("\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!");
		    c.setTextColor (Color.black);

		    c.print ("\n\n" + cpu1 + "'s total is ");
		    c.setTextColor (Color.blue);
		    c.print (cpu1total + "!");
		    c.setTextColor (Color.black);

		    c.print ("\n\n" + cpu1 + " has beat you. You lose.");
		    money [0] = money [0] - bet;

		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.red);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" left.");

		}
		else if (cpu2total <= 21 && cpu2total > total)
		{

		    c.print ("\nYour total is ");
		    c.setTextColor (Color.blue);
		    c.print ((total) + "!");
		    c.setTextColor (Color.black);

		    c.print ("\n\n" + cpu2 + "'s total is ");
		    c.setTextColor (Color.blue);
		    c.print (cpu2total + "!");
		    c.setTextColor (Color.black);

		    c.print ("\n\n" + cpu2 + " has beat you. You lose.");
		    money [0] = money [0] - bet;

		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.red);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" left.");

		}
		else if (total == 21)
		{
		    c.setTextColor (Color.green);
		    c.print ("\nCongratulation! You got ");
		    c.print ("21");
		    c.print ("! You Win!");
		    c.setTextColor (Color.black);

		    c.print ("\n\nYour bet has been doubled and given back to you. \n\nIf you did not place a bet, your money has not increased.");
		    money [0] = money [0] + bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.blue);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" now.");
		}
		else if (total < 21 && cpu1total < 21 && cpu2total < 21 && total > cpu1total && total > cpu2total)
		{
		    c.setTextColor (Color.green);
		    c.print ("\nCongratulation! You win!");
		    c.setTextColor (Color.black);
		    c.print ("\n\nYou beat the Dealer and " + cpu2 + "!");
		    c.print ("\n\nYour bet has been doubled and given back to you. \n\nIf you did not place a bet, your money has not increased.");
		    money [0] = money [0] + bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.blue);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" now.");

		}
		else if (cpu1total > 21 && cpu2total > 21)
		{
		    c.setTextColor (Color.green);
		    c.print ("\nCongratulation! You win!");
		    c.setTextColor (Color.black);
		    c.print ("\n\nYou beat the Dealer and " + cpu2 + "!");
		    c.print ("\n\nYour bet has been doubled and given back to you. \nIf you did not place a bet, your money has not increased.");
		    money [0] = money [0] + bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.blue);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" now.");

		}
		else if (total < 21 && cpu1total > 21 && cpu2total < 21 && total > cpu2total)
		{
		    c.setTextColor (Color.green);
		    c.print ("\nCongratulation! You win!");
		    c.setTextColor (Color.black);
		    c.print ("\n\nYou beat the Dealer and " + cpu2 + "!");
		    c.print ("\n\nYour bet has been doubled and given back to you. \n\nIf you did not place a bet, your money has not increased.");
		    money [0] = money [0] + bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.blue);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" now.");
		}
		else if (total < 21 && cpu2total > 21 && cpu1total < 21 && total > cpu1total)
		{
		    c.setTextColor (Color.green);
		    c.print ("\nCongratulation! You win!");
		    c.setTextColor (Color.black);
		    c.print ("\n\nYou beat the Dealer and " + cpu2 + "!");
		    c.print ("\n\nYour bet has been doubled and given back to you. \n\nIf you did not place a bet, your money has not increased.");
		    money [0] = money [0] + bet;
		    c.print ("\n\nYou have ");
		    c.setTextColor (Color.blue);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" now.");
		}
		else if (cpu1total == total || cpu2total == total)
		{
		    c.print ("\nYou have tied with another player!");
		    c.print ("\n\nYou did not win or lose any money.");
		    c.print ("\n\nYou still have ");
		    c.setTextColor (Color.blue);
		    c.print (p.format (money [0]));
		    c.setTextColor (Color.black);
		    c.print (" left.");
		}
		break;
	    }
	    c.println ("\n\n---------------------------------------------");
	    c.print ("\nWould you like to continue playing? (Press any key to continue)");
	    String key = c.readString ();
	}

	//Add or remove money from each players array accordingly
	// - if the user wins or loses a game, add or subract money from their array accordingly
	// - do the same for the CPU players

	//Loop the game until user money <= 0 OR the user decides to stop playing
	// - Using a loop, loop the game until the users money is <= 0 OR have a input stament at the end to ask the user if they would like to continue playing

	//Add statements at the starting and the ending of the game
	// - Add the welcome statement at the starting of the game
	// - Add a "thank you for playing" statement at the end of the game
    } // main method
} // Blackjack class
