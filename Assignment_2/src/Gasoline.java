import java.util.Random;

public class Gasoline extends Oil {
	private int price;
	private double VAT;
	
	//price�� company�� ���ڷ� �ް�, oilType�� gasoline����, VAT�� 1~30������ ������ ���� / 100���� �Ҵ����ִ� ������
	public Gasoline(int p, String c)
	{
		super(c,"gasoline");
		price = p;
		Random rnd = new Random();
		int n = rnd.nextInt(30) + 1;
		VAT = (double)n / 100;
	}
	//���ް� + ���ް� * �ΰ���ġ������ ����� ������ return���ش�
	public double getOilPrice()
	{
		return price + price * VAT;
	}
	//company, oiltype, supply price�� ������ string ���·� return���ش�
	public String toString()
	{
		return super.toString() + "\nsupply price : " + price + "\n";
	}
}
