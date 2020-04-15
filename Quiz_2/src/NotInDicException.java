
public class NotInDicException extends Exception {
	
	//this word not exists in dictionary를 super class 생성자의 인자로 주는 생성자
	public NotInDicException()
	{
		super("this word not exists in dictionary");
	}
	
	//String을 인자로 받아 super class 생성자의 인자로 주는 생성자
	public NotInDicException(String s)
	{
		super(s);
	}
}
