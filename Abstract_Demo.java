abstract class A1
{
    abstract void displayb1();   
}
 
class B1 extends A1
{
    void displayb1()
    {
        System.out.println("B1's implementation");
    }
}
class C1 extends A1
{
    void displayb1()
    {
        System.out.println("C1 implementation");
    }
}
 
public class Abstract_Demo
{
    public static void main(String args[])
    {
        B1 b = new B1();
        C1 c = new C1();
        b.displayb1();
        c.displayb1();
    }
}