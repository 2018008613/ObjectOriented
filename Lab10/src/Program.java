
public class Program {
	public static void main(String[] args)
	{
		//������ object�� ����
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Turtle turtle = new Turtle();
		
		//Animal array�� �� ĭ�� dog, tiger, turtle�� �־��ش�.
		Animal[] animal = new Animal[3];
		animal[0] = dog;
		animal[1] = tiger;
		animal[2] = turtle;
		
		//�͸� Ŭ���� person�� ������ش�
		Person person = new Person() {
			//hp�� 100���� ����
			private int hp = 100;
			//object�� Dog�̸� , ü���� 10 ���� �� ���� �����Ͽ����ϴ�. ����ϰ�, Tiger�̸� ü���� 80 ���� �� ȣ���̸� �����Ͽ����ϴ�. �� ����Ѵ�
			public void control(Object obj)
			{
				if(obj == null)
					return;
				else if(obj.getClass() == (new Tiger()).getClass())
				{
					hp -= 80;
					System.out.println("ȣ���̸� �����Ͽ����ϴ�.");
				}
				else if(obj.getClass() == (new Dog()).getClass())
				{
					hp -= 10;
					System.out.println("���� �����Ͽ����ϴ�.");
				}
			}
			//����� hp�� ������ش�
			public void showInfo()
			{
				System.out.println("��� HP : " + hp);
			}
		};
		
		showResult(animal, person);
		
	}
	//animals�� �� ĭ�� object�� ¢�� �� �ִ� �����̸� ���� �̸�, ���� �����Ҹ��� ����� �� p���� control �Լ��� showInfo �Լ��� ȣ���Ѵ�.
	private static void showResult(Animal[] animals, Person p)
	{
		for(int i=0; i < animals.length; i++)
		{
			if(animals[i] instanceof Barkable)
			{
				System.out.println((i + 1) + "��° ���� : " + animals[i].getName());
				if(animals[i].getClass() == (new Dog()).getClass())
				{
					Dog dog1 = (Dog)animals[i];
					System.out.println((i + 1) + "��° ���� �����Ҹ� : " + dog1.bark());
					p.control(dog1);
					p.showInfo();
				}
				else if(animals[i].getClass() == (new Tiger()).getClass())
				{
					Tiger tiger1 = (Tiger)animals[i];
					System.out.println((i + 1) + "��° ���� �����Ҹ� : " + tiger1.bark());
					p.control(tiger1);
					p.showInfo();
				}
			}
		}
	}
}
