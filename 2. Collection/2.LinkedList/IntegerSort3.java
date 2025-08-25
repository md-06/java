//Custum sort of integer list.
import java.util.Collections;//for sorting.
import java.util.Comparator;//for custum sort.
import java.util.LinkedList;
public class IntegerSort3
{
    public static void main(String[] args)
    {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);

        Collections.sort(list,new Comparator<Integer>()
        {
            public int compare(Integer a,Integer b)
            {
                return b-a;
            }
        });
        System.out.println("Sorted Decending: "+list);
    }
}