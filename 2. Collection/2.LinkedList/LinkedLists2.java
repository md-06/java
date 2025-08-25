//Create a LinkedList of characters, retrive the first and last elements, then update the first element using getFirst(),getlast and set()
import java.util.LinkedList;
public class LinkedLists2 {
    public static void main(String[] args)
    {
        LinkedList<Character>ch=new LinkedList<>();
        ch.add('a');
        ch.add('l');
        ch.add('i');

        System.out.println("First character:  "+ch.getFirst());
        System.out.println("Last character:   "+ch.getLast());

        ch.set(0,'A');//update first element by A
        System.out.println("\n***After Updated***");
        System.out.println("Characters are: "+ch);
    }
}
