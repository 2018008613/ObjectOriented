
public class NegativeException extends Exception {
	//super class�� work time must be positive String�� ���ڷ� �ִ� ������
	public NegativeException()
	{
		super("work time must be positive");
	}
	//s�� ���ڷ� �޾� super class�� �Ѱ��ִ� ������
	public NegativeException(String s)
	{
		super(s);
	}
}
