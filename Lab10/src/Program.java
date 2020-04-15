
public class Program {
	public static void main(String[] args)
	{
		//각각의 object를 생성
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Turtle turtle = new Turtle();
		
		//Animal array의 각 칸에 dog, tiger, turtle을 넣어준다.
		Animal[] animal = new Animal[3];
		animal[0] = dog;
		animal[1] = tiger;
		animal[2] = turtle;
		
		//익명 클래스 person을 만들어준다
		Person person = new Person() {
			//hp를 100으로 생성
			private int hp = 100;
			//object가 Dog이면 , 체력을 10 깎은 뒤 개를 제압하였습니다. 출력하고, Tiger이면 체력을 80 깎은 뒤 호랑이를 제압하였습니다. 를 출력한다
			public void control(Object obj)
			{
				if(obj == null)
					return;
				else if(obj.getClass() == (new Tiger()).getClass())
				{
					hp -= 80;
					System.out.println("호랑이를 제압하였습니다.");
				}
				else if(obj.getClass() == (new Dog()).getClass())
				{
					hp -= 10;
					System.out.println("개를 제압하였습니다.");
				}
			}
			//사람의 hp를 출력해준다
			public void showInfo()
			{
				System.out.println("사람 HP : " + hp);
			}
		};
		
		showResult(animal, person);
		
	}
	//animals의 각 칸의 object가 짖을 수 있는 동물이면 동물 이름, 동물 울음소리를 출력한 뒤 p에서 control 함수와 showInfo 함수를 호출한다.
	private static void showResult(Animal[] animals, Person p)
	{
		for(int i=0; i < animals.length; i++)
		{
			if(animals[i] instanceof Barkable)
			{
				System.out.println((i + 1) + "번째 동물 : " + animals[i].getName());
				if(animals[i].getClass() == (new Dog()).getClass())
				{
					Dog dog1 = (Dog)animals[i];
					System.out.println((i + 1) + "번째 동물 울음소리 : " + dog1.bark());
					p.control(dog1);
					p.showInfo();
				}
				else if(animals[i].getClass() == (new Tiger()).getClass())
				{
					Tiger tiger1 = (Tiger)animals[i];
					System.out.println((i + 1) + "번째 동물 울음소리 : " + tiger1.bark());
					p.control(tiger1);
					p.showInfo();
				}
			}
		}
	}
}
