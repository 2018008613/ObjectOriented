
public class FullArrayException extends Exception {
	//super class �������� ���ڿ� list is full!\ntry to expand...\nHow much will it expand?�� �־��ִ� ������.
	public FullArrayException()
	{
		super("list is full!\ntry to expand...\nHow much will it expand?");
	}
	//s�� super class�� �������� ���ڷ� �־��ִ� ������
	public FullArrayException(String s)
	{
		super(s);
	}
}

