import java.util.Random;

public class Diesel extends Oil {
	private int price;
	private double VAT;
	private double envTax;
	
	//price�� company�� ���ڷ� �ް�, oilType�� diesel��, VAT�� 1~30������ ������ ���� / 100����, envTax�� 500���� �Ҵ����ִ� ������
	public Diesel(int p, String c)
	{
		super(c, "diesel");
		price = p;
		Random rnd = new Random();
		int n = rnd.nextInt(30) + 1;
		VAT = (double)n / 100;
		envTax = 500;
	}
	//���ް� + ȯ�漼 + ���ް� * �ΰ���ġ������ ����ؼ� return���ش�
	public double getOilPrice()
	{
		return price + envTax + price * VAT;
	}
	//company, oiltype, supply price�� ������ string ���·� return���ش�
	public String toString()
	{
		return super.toString() + "\nsupply price : " + price + "\n";
	}
}