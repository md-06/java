//Array of integer and remove the element at index 1 using remove(1) fn.
import java.util.ArrayList;
public class arrayList1 {
    public static void main(String[] args)
    {
        ArrayList<Integer>num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);

        System.out.println("Array are: "+num);
        num.remove(1);
        System.out.println("Array are: "+num);
    }
}
