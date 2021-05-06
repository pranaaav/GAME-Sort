import java.util.Scanner;
class Student
{
String movieTime;
int Ticketprice;

void monash()
{
System.out.println("STUDENT CANNOT WATCH");
}
 void movie()
{
System.out.println("I am watching a movie");
Scanner s = new Scanner(System.in);
System.out.println("ENTER MOVIE TIME : ");
movieTime = s.next();
}

 public static void main(String [] args)

{
System.out.println("HELLO");
Student s = new Student();
s.movie();

Student s1 = new Student();
s1.monash();
}

}