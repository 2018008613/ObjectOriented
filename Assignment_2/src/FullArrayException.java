
public class FullArrayException extends Exception {
	//super class 생성자의 인자에 list is full!\ntry to expand...\nHow much will it expand?를 넣어주는 생성자.
	public FullArrayException()
	{
		super("list is full!\ntry to expand...\nHow much will it expand?");
	}
	//s를 super class의 생성자의 인자로 넣어주는 생성자
	public FullArrayException(String s)
	{
		super(s);
	}
}

