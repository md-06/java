//constructor
import java.util.Scanner;
public class Constructor
{
    String brand;
    int year;
    public Constructor(String brand, int year)
    {
        this.brand= brand;//this pass references of calling object.
        this.year=year;
    }

    void display()
    {
        System.out.println("Name: "+brand+",Age: "+year);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Give brand: ");
        String b=input.nextLine();
        System.out.print("Give Year: ");
        int i=input.nextInt();
        Constructor car1=new Constructor(b,i);
        car1.display();
    }
    
}
