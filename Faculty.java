class Faculty
{
int id;
String name;
String contact;
String qualification; 
int age;

    void exe(int s1, String s2, String s3, String s4, int s5)
{
id = s1;
name = s2;
contact = s3;
qualification = s4;
age = s5;

System.out.println("Your Data is : "+ id + " " + name + " " + contact + " " + qualification + " " + age);
}
public static void main(String []c)
{
System.out.println("Hello");
Faculty s1= new Faculty();
s1.exe(1, "MANGO", "90909090", "B.com", 30);

Faculty s2= new Faculty();
s2.exe(2, "APPLE", "101010", "BBA", 35);

Faculty s3= new Faculty();
s3.exe(3, "CHEEKU", "202020", "MBA", 20);

Faculty s4= new Faculty();
s4.exe(4, "BANANA", "0505050", "MCA", 27);

Faculty s5= new Faculty();
s5.exe(5, "ORANGE", "5757575", "B.Tech", 40);

}


}

