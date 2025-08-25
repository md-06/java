

/*
 *  instance instilization block
 *  not having block name & multiple blocks can write but compiler combine according to their sequence
 *  and it run with constructor but firstly run this blocks &
 *  then constructor
 */

/**
 *
 * @author Mohammad
 */
public class InstanceInitilizeBlock {
    private int x;
    //not having any name for block
    {
        System.out.println("Static initialization block x="+x);
        x=5;
    }
    public InstanceInitilizeBlock ()
    {
        System.out.println("constructor x="+x);
    }
    public static void main(String[] args)
    {
        new InstanceInitilizeBlock();//this will also work.
        InstanceInitilizeBlock n=new InstanceInitilizeBlock();
    }

}
