
public class EmptyException extends Exception {
	
	//list is empty를 super class 생성자의 인자로 주는 생성자
	public EmptyException()
	{
		super("list is empty");
	}
	
	//String을 인자로 받아 super class 생성자의 인자로 주는 생성자
	public EmptyException(String s)
	{
		super(s);
	}
}
