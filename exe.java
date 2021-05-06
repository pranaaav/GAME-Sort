import java.util.*;
class exe
{
	
	public static void main(String [] d)
	{
	Scanner s = new Scanner(System.in);

	System.out.println("choose a menu...\n 1. Add \n 2. Delete \n 3. Edit \n 4. Exit");

	int opt= s.nextInt();

	switch(opt)
	{
	case 1:
	System.out.println("You are doing add");
	break;

	case 2:
	System.out.println("You are doing delete");
	break;

 	case 3:
	System.out.println("You are doing edit");
	break;

	case 4:	
	System.out.println("You are doing exit");
	break;

	default:
	System.out.println("wrong option");
	}

	


		/*
		if(opt == 1)
		{
		System.out.println("You are doing add");
		}
		else if(opt == 2 )
		{
		System.out.println("You are doing delete");		
		}
		else if(opt == 3)
		{
		System.out.println("You are doing edit");
		}
		else if(opt == 4)
		{
		System.out.println("You are doing exit");		
		}
		else
		{
		System.out.println("You chose wrong option");
		}	
		*/
	}
}
