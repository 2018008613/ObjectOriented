
public class AlreadyExistInDicException extends Exception {
	
	//this word already exists in dictionary�� super class �������� ���ڷ� �ִ� ������
	public AlreadyExistInDicException()
	{
		super("this word already exists in dictionary");
	}
	
	//String�� ���ڷ� �޾� super class �������� ���ڷ� �ִ� ������
	public AlreadyExistInDicException(String s)
	{
		super(s);
	}
}
