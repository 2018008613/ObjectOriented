
public class AlreadyExistInDicException extends Exception {
	
	//this word already exists in dictionary를 super class 생성자의 인자로 주는 생성자
	public AlreadyExistInDicException()
	{
		super("this word already exists in dictionary");
	}
	
	//String을 인자로 받아 super class 생성자의 인자로 주는 생성자
	public AlreadyExistInDicException(String s)
	{
		super(s);
	}
}
