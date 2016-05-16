package QueueModel;

public class CustomerQueue 
{
    private String name;
    private double total;
    private boolean hasOrder;

    boolean hasOrder()
    {
	boolean hasOrder = true;

	if ( hasOrder == true) 
	{
	System.out.println("it's true");
	}
	else 
	{
	System.out.println("it's false");
	}
	return hasOrder;
    }
    
    String name (String orderName)
    {
	String name = new String(orderName);
	orderName = "";
	
	return name;
    }
    
    double total()
    {
	return total;
    }

    public String getName() 
    {
	return name;
    }

    public void setName(String name) 
    {
	this.name = name;
    }

    public boolean isHasOrder() 
    {
	return hasOrder;
    }

    public void setHasOrder(boolean hasOrder) 
    {
	this.hasOrder = hasOrder;
    }
}
