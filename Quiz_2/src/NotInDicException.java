
public class NotInDicException extends Exception {
	
	//this word not exists in dictionary�� super class �������� ���ڷ� �ִ� ������
	public NotInDicException()
	{
		super("this word not exists in dictionary");
	}
	
	//String�� ���ڷ� �޾� super class �������� ���ڷ� �ִ� ������
	public NotInDicException(String s)
	{
		super(s);
	}
}
