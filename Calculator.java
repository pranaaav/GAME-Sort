import java.util.*;
class Calculator
{

void input()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter Number One = ");
int num1 = s.nextInt();
System.out.println("Enter Second Number = ");
int num2 = s.nextInt();

System.out.println("WHAT YOU WANT TO PLAY");
System.out.println(" 1.ADD \n 2.SUBTRACT \n 3.MULTIPLY \n 4.DIVIDE");

Scanner s1 = new Scanner(System.in);
int one = s1.nextInt();

if(one == 1)
{
System.out.println("AFTER ADDING YOU GET : " + (num1 + num2));
}
else if(one == 2)
{
System.out.println("AFTER SUBTRACTING YOU GET : " + (num1 - num2));
}
else if(one == 3)
{
System.out.println("AFTER MULTIPLICATION YOU GET : " + (num1 * num2));
}
else if(one == 4)
System.out.println("AFTER DIVIDING YOU GET : " + (num1 / num2));
}
public static void main(String [] args)
{
System.out.println("Game of Thrones");
Calculator s = new Calculator();
s.input();
}
}