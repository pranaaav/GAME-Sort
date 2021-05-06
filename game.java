import java.util.*;
class game
{

public static void main(String [] args)
{
int x = 0;

while( x < 1){
System.out.println("############################################");
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
System.out.println("INPUT YOUR NAME :");
String Name = s.next();
break;

case 2:
System.out.println("SELECT A NUMBER FROM 1 TO 5");
int Num = s.nextInt();
break;

case 3:
System.out.println("YOU HAVE WON :");
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
System.out.println("YOU HAVE SELECTED TO EXIT THE GAME! \nTHANK YOU FOR PLAYING! \nHAVE A NICE DAY! CHEERS!");
x++;
break;

default:
System.out.println("OOPS! \nYOU ENTERED A WRONG OPTION! PLEASE TRY AGAIN");
}
}

}
}