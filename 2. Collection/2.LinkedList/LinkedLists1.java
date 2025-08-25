//create a linkedlist of intergers and insert elements at the begining and end using addfirst() and addlast().

import java.util.LinkedList;
public class LinkedLists1
{
    public static void main(String[] args)
    {
        LinkedList<Integer>num=new LinkedList<>();
        num.addLast(20);
        num.addFirst(15);
        num.addFirst(10);
        num.addLast(25);

        System.out.println("Numbers: "+num);
    }
}