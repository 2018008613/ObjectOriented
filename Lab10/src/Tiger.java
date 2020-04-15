
public class Tiger extends Animal implements Barkable {
	//super class 생성자의 인자로 호랑이를 넘겨주는 생성자
	public Tiger()
	{
		super("호랑이");
	}
	//어흥 String을 return해준다
	public String bark()
	{
		return "어흥";
	}
}
