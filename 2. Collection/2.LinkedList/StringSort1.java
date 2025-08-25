//Sorting the string alphabetically using collections.sort() method.
//lexicographical(means according to ascii code) is the ascending order for strings.
import java.util.Collections;
import java.util.LinkedList;
public class StringSort1
{
    public static void main(String[] args)
    {
        LinkedList<String>names=new LinkedList<>();//creating a linkedlist in java
        names.add("Bob");
        names.add("Alice");
        names.add("alice");
        names.add("Charlie");
        System.out.println("Names: "+names);

        Collections.sort(names);
        System.out.println("Names :"+names);
        

    }
}
