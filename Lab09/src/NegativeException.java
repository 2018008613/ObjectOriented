
public class NegativeException extends Exception {
	//super class에 work time must be positive String을 인자로 주는 생성자
	public NegativeException()
	{
		super("work time must be positive");
	}
	//s를 인자로 받아 super class에 넘겨주는 생성자
	public NegativeException(String s)
	{
		super(s);
	}
}
