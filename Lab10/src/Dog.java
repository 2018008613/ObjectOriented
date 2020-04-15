
public class Dog extends Animal implements Barkable {
	//Dog의 생성자로, super class의 생성자의 인자로 개를 넣어준다
	public Dog()
	{
		super("개");
	}
	//멍멍 String을 return하는 함수
	public String bark()
	{
		return "멍멍";
	}
}
