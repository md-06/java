/*
 * 
 */
class A
{
    Object hello()
    {
        return "hello from A";
    }
}
class B extends A
{
    @Override
    String hello()
    {
        return "hello from B";
    }
}
public class objectClass {
    public static void main(String[] args)
    {
        A ob1=new A();
        System.out.println(ob1.hello());
        B ob2 =new B();
        System.err.println(ob2.hello());
        A ob3 =new B();
        System.out.println(ob3.hello());
    }
}
