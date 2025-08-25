public class Human
{
    static int eye;
    String name;
    public String haircolor;
    public void getdetail()
    {
        System.out.println("Name: "+name +", haircolor: "+ haircolor + "eye: "+eye);
    }
    public static void main(String [] args)
    {
        Human h1,h2=new Human();
        h2.name="mohd";
        h2.eye=2;
        h2.haircolor="brown";
        h2.getdetail();
        h1.name="ali";
        h1.eye=3;
        h1.haircolor="brown";
        h1.getdetail();
    }
}