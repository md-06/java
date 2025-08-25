//sort a integer list in ascending order
import java.util.Collections;//for sorting
import java.util.LinkedList;
public class SortList1
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

        Collections.sort(list);//defalut sort in acending order.
        System.out.println(list);

    }
}