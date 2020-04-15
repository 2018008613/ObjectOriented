
public class Animal {
	private String name;
	
	//name을 인자로 받는 생성자
	public Animal(String name)
	{
		this.name = name;
	}
	//인자를 받지 않는 생성자
	public Animal()
	{
		
	}
	//name의 getter
	public String getName()
	{
		return name;
	}
}
