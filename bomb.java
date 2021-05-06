import java.util.*;
class bomb
{
int n;
int [] Num ;
Scanner s = new Scanner(System.in);

void exe()
{

System.out.println("how many numbers u want to avg");
n=s.nextInt();

Num = new int[n];
}


void input()
{

for(int i=0; i<n; i++)
{
System.out.println("NUMBER IS :");
Num[i] = s.nextInt();
}
}
void output()
{
int sum=0; 
for(int i=0; i<n; i++)
{
sum = sum+ Num[i];
}
System.out.println("avg is " + sum/n);
}
public static void main(String [] args)
{
bomb x = new bomb();
x.exe();
x.input();
x.output();
}
}