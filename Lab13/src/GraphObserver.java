
public class GraphObserver implements Observer{
	private NumberGenerator num;
	
	public GraphObserver(NumberGenerator n)
	{
		num = n;
		num.addObserver(this);
	}
	
	public void update(NumberGenerator generator)
	{
		System.out.print("GraphObserver: ");
		for(int i = 0;i < generator.getNumber();i++)
			System.out.print("*");
		System.out.println();
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
