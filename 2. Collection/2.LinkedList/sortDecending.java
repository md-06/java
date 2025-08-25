//sort a integer list in decending order
import java.util.Collections;//for sorting
import java.util.Comparator;
import java.util.LinkedList;
public class sortDecending
{
    public static void main(String[] args)
    {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println(list);

        Collections.sort(
                        
                        list, new Comparator<Integer>()
                        {
                            public int compare(Integer a, Integer b)
                            {
                                //return a-b;//if uncomment this then get acending order
                                return b-a;//for decending order.
                            }
                        }
        );
        System.out.println(list);

    }
}