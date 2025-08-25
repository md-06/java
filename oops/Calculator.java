
public class Calculator
{
    int num1;
    int num2;
    
    public void addition(int a, int b)
    {
        System.out.println("Addition= "+(a+b));
    }
    public void subtraction(int a, int b)
    {
        System.out.println("Addition= "+(a-b));
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.addition(4,5);
        c.subtraction(4, 3);
        
    }
}