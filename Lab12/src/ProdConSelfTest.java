
public class ProdConSelfTest {
	//instance variable
	private Buffer buffer;
	private Producer producer;
	private Consumer consumer;
	
	//data의 크기를 15로 받는 buffer를 생성한 뒤 이를 이용해 producer, consumer를 생성하는 생성자
	public ProdConSelfTest()
	{
		buffer = new Buffer(15);
		producer = new Producer(buffer);
		consumer = new Consumer(buffer);
	}
	
	//inner class인 Producer
	private class Producer extends Thread
	{
		//instance variable
		private final Buffer buffer;
		
		//매개변수 buf로 전역변수 buffer를 초기화해주는 생성자
		public Producer(Buffer buf)
		{
			buffer = buf;
		}
		
		//배열의 크기만큼 0~100 사이의 난수를 발생시켜 buffer에 add시킨다
		public void produce() throws InterruptedException
		{
			for(int i = 0;i < buffer.getSize();i++)
				buffer.add(Math.random() * 100);
		}
		
		//produce를 실행하고 오류 발생 시 exception을 catch해준다
		public void run()
		{
			try
			{
				produce();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	//inner class인 Consumer
	private class Consumer extends Thread
	{
		//instance variable
		private final Buffer buffer;
		
		//매개변수 buf로 전역변수 buffer를 초기화해주는 생성자
		public Consumer(Buffer buf)
		{
			buffer = buf;
		}
		
		//배열의 크기만큼 buffer의 remove를 실행시킨다
		public void consume() throws InterruptedException
		{
			for(int i = 0;i < buffer.getSize();i++)
				buffer.remove();
		}
				
		//consume를 실행하고 오류 발생 시 exception을 catch해준다
		public void run()
		{
			try
			{
				consume();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	//producer, consumer thread를 start한다
	public void startThread()
	{
		producer.start();
		consumer.start();
	}
}
