/*
 *  we are doing method hiding with the help of static member function
 *  signiture of child class static method must be same as parent class static method.
 *  if the signiture of both are same then both must be static else get error
 */
class parent
{
    public static void fun1()//static member function
    {
        System.out.println("Hii");
    }
}
class child extends parent
{
    public static void fun1()//static member function
    {
        System.out.println("Hye!");
    }
}
public class MethodHide
{
    public static void main(String[] args)
    {
        child.fun1();//it will call the child class function
    }
}