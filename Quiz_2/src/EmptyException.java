
public class EmptyException extends Exception {
	
	//list is empty�� super class �������� ���ڷ� �ִ� ������
	public EmptyException()
	{
		super("list is empty");
	}
	
	//String�� ���ڷ� �޾� super class �������� ���ڷ� �ִ� ������
	public EmptyException(String s)
	{
		super(s);
	}
}
