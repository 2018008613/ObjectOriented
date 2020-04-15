
public class ProdConSelfTest {
	//instance variable
	private Buffer buffer;
	private Producer producer;
	private Consumer consumer;
	
	//data�� ũ�⸦ 15�� �޴� buffer�� ������ �� �̸� �̿��� producer, consumer�� �����ϴ� ������
	public ProdConSelfTest()
	{
		buffer = new Buffer(15);
		producer = new Producer(buffer);
		consumer = new Consumer(buffer);
	}
	
	//inner class�� Producer
	private class Producer extends Thread
	{
		//instance variable
		private final Buffer buffer;
		
		//�Ű����� buf�� �������� buffer�� �ʱ�ȭ���ִ� ������
		public Producer(Buffer buf)
		{
			buffer = buf;
		}
		
		//�迭�� ũ�⸸ŭ 0~100 ������ ������ �߻����� buffer�� add��Ų��
		public void produce() throws InterruptedException
		{
			for(int i = 0;i < buffer.getSize();i++)
				buffer.add(Math.random() * 100);
		}
		
		//produce�� �����ϰ� ���� �߻� �� exception�� catch���ش�
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
	
	//inner class�� Consumer
	private class Consumer extends Thread
	{
		//instance variable
		private final Buffer buffer;
		
		//�Ű����� buf�� �������� buffer�� �ʱ�ȭ���ִ� ������
		public Consumer(Buffer buf)
		{
			buffer = buf;
		}
		
		//�迭�� ũ�⸸ŭ buffer�� remove�� �����Ų��
		public void consume() throws InterruptedException
		{
			for(int i = 0;i < buffer.getSize();i++)
				buffer.remove();
		}
				
		//consume�� �����ϰ� ���� �߻� �� exception�� catch���ش�
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
	
	//producer, consumer thread�� start�Ѵ�
	public void startThread()
	{
		producer.start();
		consumer.start();
	}
}
