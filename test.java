import java.util.*;
class test
{
	public static void main(String [] c)
	{
	Scanner s = new Scanner(System.in);

	System.out.println("Enter a number");
	int num =  s.nextInt();
	
	if(num % 2 == 0)
	{
	System.out.println("even number");	
	}
	else
	{
	System.out.println("odd number");	
	}

	}
}