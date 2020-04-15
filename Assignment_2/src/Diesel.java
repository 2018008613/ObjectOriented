import java.util.Random;

public class Diesel extends Oil {
	private int price;
	private double VAT;
	private double envTax;
	
	//price와 company를 인자로 받고, oilType를 diesel로, VAT를 1~30사이의 랜덤한 정수 / 100으로, envTax를 500으로 할당해주는 생성자
	public Diesel(int p, String c)
	{
		super(c, "diesel");
		price = p;
		Random rnd = new Random();
		int n = rnd.nextInt(30) + 1;
		VAT = (double)n / 100;
		envTax = 500;
	}
	//공급가 + 환경세 + 공급가 * 부가가치세율를 계산해서 return해준다
	public double getOilPrice()
	{
		return price + envTax + price * VAT;
	}
	//company, oiltype, supply price의 정보를 string 형태로 return해준다
	public String toString()
	{
		return super.toString() + "\nsupply price : " + price + "\n";
	}
}