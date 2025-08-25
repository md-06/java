//string sort in decending order.
//sorting done according to their ascii value.
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class StringSortDecending
{
    public static void main(String[]args)
    {
        LinkedList<String>color= new LinkedList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Blue");
        System.out.println(color);

        Collections.sort(
                        color,new Comparator<String>()
                        {
                            public int compare(String a,String b )
                            {
                                return b.compareTo(a);//for decending
                            }
                        }
                    );
        System.out.println(color);
    }
}