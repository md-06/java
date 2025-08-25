//creating linked list of names using add() mehtod using append elements .
//And also removefirst and RemoveLast from linkedlist.
import java.util.LinkedList;
public class LinkedLists
{
    public static void main(String[] args)
    {
        LinkedList<String>names=new LinkedList<>();//creating a linkedlist in java
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: "+names);
        System.out.println("After remove first Names: "+names.removeFirst());
        System.out.println("After remove last Names:  "+names.removeLast());
        
    
        System.out.println("Size of list: "+names.size());
        System.out.println("Names :"+names);
        

    }
}
