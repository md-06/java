// switch case in java

public class Switch_case1
{
	public static void main(String[] args) {
	    String str="hello";
	    switch(str)// condition can be string 
	    {
	        case "1":
	            System.out.println("1");
	            break;
	        default :// it can be write anywhere inside switch
	            System.out.println("bye");//break is not mandatory 
	        case "hello":
	            System.out.println("hello");
	            break;//if comment this line then it will run the below case "hello"
	       case "Hello"://due to case sensitive this will not match with it
	           System.out.println("Hello");
	           break;
	           
	    }
	
	}
	
}
