//Switch case--- run default case and due to not having break run below case Hello also.

public class Switch_case3
{
	public static void main(String[] args) {
	    String str="hello";
	    switch(str)
	    {
	        case "1":
	            System.out.println("1");
	            break;
	        default :// it can be write anywhere inside switch
	            System.out.println("bye");//break not mandatory
          
	        case "Hello"://due to case sensitive it will not match
	           System.out.println("Hello");
	           break;
	           
	    }
	
	}
	
}
