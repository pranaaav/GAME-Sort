class Employee
{
 int id;
 String name;
 float salary;
         void exe(int s1, String s2, float s3)
{
id= s1;
name= s2;
salary= s3;

System.out.println("Your Data is : "+ id + " " + name + " " + salary);
}
public static void main(String []c)
{
System.out.println("Hello");
Employee s1 = new Employee();
s1.exe(101, "AMAN", 25000);

Employee s2 = new Employee();
s2.exe(102, "BAMAN", 30000);

Employee s3 = new Employee();
s3.exe(103, "CAMAN", 30500);
}

}