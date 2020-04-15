
public class Kitchen {
	//instance variable
	private int ovenNum;
	private int fryNum;
	private int potNum;

	//오븐, 프라이팬, 냄비의 개수를 1,3,3으로 초기화해주는 생성자
	public Kitchen()
	{
		ovenNum = 1;
		fryNum = 3;
		potNum = 3;
	}
	
	//Oven을 사용하거나 사용 완료를 알려준다
	public synchronized void useOven() throws InterruptedException
	{
		if(ovenNum == 0)
		{
			System.out.println("The oven is in use.");
			wait();
		}
		ovenNum--;
	}
	
	public synchronized void releaseOven() throws InterruptedException
	{
		if(ovenNum < 1)
			ovenNum++;
		notifyAll();
	}
	
	//Friedpan을 사용하거나 사용 완료를 알려준다
	public synchronized void useFriedpan() throws InterruptedException
	{
		if(fryNum == 0)
		{
			System.out.println("The friedpan is in use.");
			wait();
		}
		fryNum--;
	}
	
	public synchronized void releaseFriedpan() throws InterruptedException
	{
		if(fryNum < 3)
			fryNum++;
		notifyAll();
	}
	
	//Pot을 사용하거나 사용 완료를 알린다
	public synchronized void usePot() throws InterruptedException
	{
		if(potNum == 0)
		{
			System.out.println("The pot is in use.");
			wait();
		}
		potNum--;
	}
	
	public synchronized void releasePot() throws InterruptedException
	{
		if(potNum < 3)
			potNum++;
		notifyAll();
	}
}
