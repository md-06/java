// iterate over a linkedlist of weekdays and print each day using a for-each loop over collection without index management.
import java.util.LinkedList;
public class linkedlists3
{
    public static void main(String[] args) {
        LinkedList<String>week=new LinkedList<>();
        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thrusday");
        week.add("Friday");
        week.add("Saturday");

        System.out.println("Weeks are: ");
        for (String day:week)
        {
            System.out.println(day);
        }
        System.out.println("Weeks are: "+week);//weeks in list form
    }
}