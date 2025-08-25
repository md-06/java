//0 if a=b,
//-ve value(-1) if a<b,
//+ve value(1)  if a>b
public class compareToWorking
{
    public static void main(String[] args) {
        System.out.println("Value return by compare to are:");
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
    }
}