/*
 * Static instilization block
 * block name must be static  and members are only static and it run with constructor but firstly run this block &
 * then constructor
 */

/**
 *
 * @author Mohammad
 */
public class StaticInitilizeBlock {
    private static int x;
    static
    {
        System.out.println("Static initialization block x="+x);
        x=5;
    }
    public StaticInitilizeBlock()
    {
        System.out.println("constructor x="+x);
    }
    public static void main(String[] args)
    {
        new StaticInitilizeBlock();
    }

}
