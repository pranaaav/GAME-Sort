

import java.util.Scanner;
import java.util.Random;



class Game
{
    
          public static final String YELLOW = "\u001B[33m";

public static final String RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";


        void exe()
	{
	int flag=0;
	int x=0;
	Guess g = new Guess();
	do
	{	
	
	System.out.println("\n \n############################################");
	System.out.println("     WELCOME TO LUCKY VENDING MACHINE");
	System.out.println("############################################");
	System.out.println("PLEASE SELECT FROM THE FOLLOWING : ");
	System.out.println("____________________________________________");
	System.out.println(" 1. SET UP A NEW PLAYER \n 2. SELECT A NUMBER & GUESS A PRIZE \n 3. WHAT HAVE I WON SO FAR ? \n 4. DISPLAY GAME HELP OPTION \n 5. EXIT THE GAME");
	System.out.println("____________________________________________");

  
Scanner s = new Scanner(System.in);
System.out.println("Choose An Option : ");
int Select = s.nextInt();

switch(Select)
{
case 1:
flag++;
Player ob = new Player();
ob.pl();
break;

case 2:
if(flag == 0)
{
System.out.println(ANSI_RED+"You haven't selected the player yet, TRY AGAIN"+RESET);
break;
}
g.gs();
break;

case 3:
if(flag == 0)
{
System.out.println(ANSI_RED+"You haven't selected the player yet, TRY AGAIN"+RESET);
break;
}
g.wn();
break;

case 4:
System.out.println("HOW TO PLAY THE GAME");
System.out.println("------------------------------------------------");
System.out.println("THIS IS A LUCKY NUMBER GENERATOR GAME");
System.out.println("------------------------------------------------");
System.out.println("1. YOU HAVE TO SET PLAYER NAME TO START THE GAME");
System.out.println("2. THAN YOU HAVE TO CHOOSE FROM NUMBER 1 TO 5");
System.out.println("3. COMPUTER WILL GENERATE A RANDOM NUMBER");
System.out.println("4. IF YOUR NUMBER MATCHES WITH THE GENERATED NUMBER, YOU WIN");
System.out.println("\nYou can win PEN, BOOK, DVD, MOUSE, KEYBOARD \ndepending on the match between user selected \nand computer generated number ");
System.out.println("------------------------------------------------");
System.out.println("Selecting No. 3 will tell you what you have won so far by \nplaying 'LUCKY VENDING MACHINE' ");
System.out.println("==========================================================");
System.out.println("SO GO BACK AND TRY YOUR LUCK! ALL THE BEST :) ");
System.out.println("                                                  ");
System.out.println("                                                  ");
System.out.println("__________________________________________________");
break;


case 5:
System.out.println(YELLOW+"YOU HAVE SELECTED TO EXIT THE GAME! \nTHANK YOU FOR PLAYING! \n HAVE A NICE DAY! CHEERS!"+RESET);
x++;
break;

default:
System.out.println(ANSI_RED+"OOPS! \nYOU ENTERED A WRONG OPTION! PLEASE TRY AGAIN"+RESET);
}
	}while(x==0);

	}

	public static void main(String [] f)
	{
	Game ob= new Game();
	ob.exe();
	}
}


 class Player
{
String name;
static int spending;
static int worth;
static StringBuilder sb;
	void pl()
	{
       spending=0;
       worth=0;
       sb= new StringBuilder("You have won : \n");
         
	System.out.println("Enter your name :");
	Scanner s = new Scanner(System.in);
	name = s.next();
	}
}



class Guess
{
int gue; 
public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

   public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
      
	void gs()
	{
     

	Scanner s = new Scanner(System.in);
	System.out.println("Guess your number b/w 1-5");
	gue= s.nextInt();	
        
	Random r = new Random();
	int n = r.nextInt(5) + 1;
	System.out.println("Your Guess : " + gue);
	System.out.println("System Guess : " + n);

		if(gue == n)
		{
		System.out.println(PURPLE +"YOU WON"+RESET);

			switch(gue)
			{
			case 1:
			System.out.println("Pen worth $10");
                        Player.worth= Player.worth+10;
			Player.sb.append("pen \n");
			break;

			case 2:
			System.out.println("Book worth $20");	
                         Player.worth= Player.worth+20;
			Player.sb.append("Book \n");		
			break;

			case 3:
			System.out.println("DVD worth $30");
                         Player.worth= Player.worth+30;
			Player.sb.append("DVD \n");
			break;

			case 4:
			System.out.println("Mouse worth $40");	
                         Player.worth= Player.worth+40;
			Player.sb.append("Mouse \n");
			break;

			case 5:
			System.out.println("Keyboard worth $50");
                         Player.worth= Player.worth+50;
			Player.sb.append("keyboard \n");
			
                       default:
                           System.out.println("You have to select only 1-5");
			}		
		}
		else
		{
		System.out.println(CYAN+"YOU LOSE, TRY AGAIN");
                switch(n)
			{
			case 1:
			Player.spending = Player.spending+1;
			break;

			case 2:
			Player.spending = Player.spending+2;		
			break;

			case 3:
			Player.spending = Player.spending+3;
			break;

			case 4:
			Player.spending = Player.spending+4;
			break;

			case 5:
			Player.spending = Player.spending+5;
			break;
                       
                       
			}	
		}

	}

	void wn()
	{
	System.out.println(Player.sb);
            System.out.println(GREEN+"worth for $:"+Player.worth+RESET);
            System.out.println(GREEN+"Total spends : " + Player.spending+RESET);
	}
}
