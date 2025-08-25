// this class show that with printing the object we can print the attributes of object.
public class overRide {
    int x,y;
    public overRide(){
        this.x=0;
        this.y=0;
    }
    public overRide(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){//tostring method is system defined method
        return "("+x+", "+y+")";
    }
    public static void main(String[] args) {
        overRide p1=new overRide();
        overRide p2=new overRide(3,4);
        System.out.println("p1= "+p1);
        System.out.println("p2= "+p2);
    }

}
