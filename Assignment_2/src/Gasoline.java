import java.util.Random;

public class Gasoline extends Oil {
	private int price;
	private double VAT;
	
	//price와 company를 인자로 받고, oilType를 gasoline으로, VAT를 1~30사이의 랜덤한 정수 / 100으로 할당해주는 생성자
	public Gasoline(int p, String c)
	{
		super(c,"gasoline");
		price = p;
		Random rnd = new Random();
		int n = rnd.nextInt(30) + 1;
		VAT = (double)n / 100;
	}
	//공급가 + 공급가 * 부가가치세율을 계산한 가격을 return해준다
	public double getOilPrice()
	{
		return price + price * VAT;
	}
	//company, oiltype, supply price의 정보를 string 형태로 return해준다
	public String toString()
	{
		return super.toString() + "\nsupply price : " + price + "\n";
	}
}
