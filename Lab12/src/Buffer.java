
public class Buffer {
	//instance variable, lock을 0으로 초기화
	private int lock = 0;
	private double[] data;
	
	//data를 size크기의 double 배열로 할당해주는 생성자
	public Buffer(int size)
	{
		data = new double[size];
	}
	
	//data배열의 길이를 return
	public int getSize()
	{
		return data.length;
	}
	
	//data가 꽉 찬 경우, Buffer is full을 출력한 뒤 wait하고 그렇지 않으면 Adding item : toAdd을 출력하고 data에 toAdd를 넣은 뒤 lock을 1 증가시킨다
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
	
	//lock이 0인 경우 Buffer is empty를 출력하고 wait시킨다. 그렇지 않으면 Removing item : data[lock-1]출력 후 data[lock-1]를 0.0으로 해준뒤 원래 값 반환
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
