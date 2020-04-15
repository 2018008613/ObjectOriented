
public class Buffer {
	//instance variable, lock�� 0���� �ʱ�ȭ
	private int lock = 0;
	private double[] data;
	
	//data�� sizeũ���� double �迭�� �Ҵ����ִ� ������
	public Buffer(int size)
	{
		data = new double[size];
	}
	
	//data�迭�� ���̸� return
	public int getSize()
	{
		return data.length;
	}
	
	//data�� �� �� ���, Buffer is full�� ����� �� wait�ϰ� �׷��� ������ Adding item : toAdd�� ����ϰ� data�� toAdd�� ���� �� lock�� 1 ������Ų��
	public synchronized void add(double toAdd) throws InterruptedException
	{
		if(lock >= data.length)
		{
			System.out.println("Buffer is full");
			wait();
		}
		System.out.println("Adding item : " + toAdd);
		System.out.flush();
		data[lock++] = toAdd;
		notifyAll();
	}
	
	//lock�� 0�� ��� Buffer is empty�� ����ϰ� wait��Ų��. �׷��� ������ Removing item : data[lock-1]��� �� data[lock-1]�� 0.0���� ���ص� ���� �� ��ȯ
	public synchronized double remove() throws InterruptedException
	{
		if(lock == 0)
		{
			System.out.println("Buffer is empty");
			wait();
		}
		double d = data[--lock];
		data[lock] = 0.0;
		System.out.println("Removing item : " + d);
		System.out.flush();
		notifyAll();
		return d;
	}
}
