
public class Kitchen {
	//instance variable
	private int ovenNum;
	private int fryNum;
	private int potNum;

	//����, ��������, ������ ������ 1,3,3���� �ʱ�ȭ���ִ� ������
	public Kitchen()
	{
		ovenNum = 1;
		fryNum = 3;
		potNum = 3;
	}
	
	//Oven�� ����ϰų� ��� �ϷḦ �˷��ش�
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
	
	//Friedpan�� ����ϰų� ��� �ϷḦ �˷��ش�
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
	
	//Pot�� ����ϰų� ��� �ϷḦ �˸���
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
