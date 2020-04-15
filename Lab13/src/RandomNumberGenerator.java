import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
	Random random = new Random();
	private int number;
	
	public int getNumber()
	{
		return number;
	}
	
	public void execute()
	{
		for(int i = 0; i < 10; i++)
		{
			number = random.nextInt(50);
			super.notifyObservers();
		}
	}
}
