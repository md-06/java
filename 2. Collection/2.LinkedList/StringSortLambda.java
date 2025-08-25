//string sort in decending order using lambda function.
//sorting done according to their ascii value.
import java.util.Collections;
import java.util.LinkedList;

public class StringSortLambda
{
    public static void main(String[]args)
    {
        LinkedList<String>color= new LinkedList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Blue");
        System.out.println(color);

        Collections.sort(color, (a,b) ->b.compareTo(a));//for compare
        
        System.out.println(color);
    }
}