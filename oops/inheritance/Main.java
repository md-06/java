//consturctor overloading
public class Main
{
    String name;
    int age;
    static int count=0;


    public Main()
    {
        this.name="NA";
        this.age=0;
        count++;
    }
    public Main(String name)
    {
        this.name=name;
        count++;
    }
    public  Main(String name,int age)
    {
        this.name=name;
        this.age=age;
        count++;
    }

    public void display()
    {
        System.out.println("Name: "+name+", Age: "+age);
    }
    public static int displayCount()
    {
        return count;
    }
    public static void main(String[] args) {
        Main m1=new Main("Mohammad");
        Main m2=new Main("Ali",20);
        m1.display();
        m2.display();
        System.out.println("Total object: "+Main.count);
    }
    
}
