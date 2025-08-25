/*
 *  child class call constructor of parent class
 *  above process K/as constructor chaining.
 */
class A
{
    public A() {
        {
            System.out.println("A");
        }
    }
}
class B extends A
{
    public B()
    {
        //this();
        //if we not mention here super() or this() then
        System.out.println("B");//compiler write there no error.
    }
}
public class constructorChaining {


    public static void main(String[] args) {
        B b=new B();//result: A
                    //        B
    }
}
