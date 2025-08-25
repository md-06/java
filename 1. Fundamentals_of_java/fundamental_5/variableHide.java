/*
 *  static member variable can't be inherit.
 *  but static member variable can be hide.
 */

class Parent
{
    static int y=4;
}
class Child extends Parent
{
    static
    {y=5;}
    //static int y=6;
}
public class variableHide
{
    public static void main(String[] args)
    {
        System.out.println("y="+Child.y);//here complier replace child with parent
    }
}