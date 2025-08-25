package cars;
public class Car {
    private int model,speed,price;
    private String name,companyName;
    public void  setName(String n)
        {name=n;}
    public void setModel(int m)
        {model=m;}
    public void setSpeed(int s)
        {speed=s;}
    public void setPrice(int p)
    {
        price=p;
    }
    public void setCompanyName(String n)
    {
        companyName=n;
    }
    public int getPrice(){return price;}
    public String getName()
        { return name;}
    public int getModel()
        {return model;}
    public int getSpeed()
        {return (speed);}
    public String getCompanyName()
    {
        return companyName;
    }
}
