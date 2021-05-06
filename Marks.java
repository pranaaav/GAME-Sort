import java.util.*;
class Marks
{

void topper()
{
Scanner s = new Scanner(System.in);
System.out.println("Hello, Enter your Marks Pappu : ");
int num1 = s.nextInt();
System.out.println("Hello, Enter your Marks Gappu : ");
int num2 = s.nextInt();
System.out.println("Hello, Enter your Marks Fappu : ");
int num3 = s.nextInt();

if(num1 >= num2 && num1 >= num3)
{
System.out.println("Pappu's Got Talent");
}
else if(num2 >= num3)
{
System.out.println("Gappu's Got Talent");
}
else
{
System.out.println("Fappu's Got Talent");
}
}
public static void main(String [] args)
{
System.out.println("STUDENTS AND MARKS");
Marks s = new Marks();
s.topper();
}

}