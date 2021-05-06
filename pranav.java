class A

{
public static void main(String []c)
{ 
  
   System.out.println("Main starts");
   B s = new B();
   s.displayb();

   C s1 = new C();
   s1.displayc();

}

}
class B
{
  void displayb()
{
   System.out.println("Hi I am the display function of b class");
}
}
class C
{
  void displayc()
{
   
   System.out.println("Hi I am the display function of c class");
}


}
