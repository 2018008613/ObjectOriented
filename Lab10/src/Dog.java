
public class Dog extends Animal implements Barkable {
	//Dog�� �����ڷ�, super class�� �������� ���ڷ� ���� �־��ش�
	public Dog()
	{
		super("��");
	}
	//�۸� String�� return�ϴ� �Լ�
	public String bark()
	{
		return "�۸�";
	}
}
