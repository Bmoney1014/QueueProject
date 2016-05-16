package QueueModel;

public class CustomerQueue 
{
    private String name;
    private double total;
    private boolean hasOrder;

    boolean hasOrder()
    {
	return true;
    }
    
    String name()
    {
	return name;
    }
    
    double total()
    {
	return total;
    }
}
