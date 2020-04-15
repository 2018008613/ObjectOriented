
public abstract class Oil {
	private String company;
	private String oilType;
	private double priceInStore;
	
	//인자를 받지 않는 생성자로, priceInStore를  0으로 초기화시켜준다.
	public Oil()
	{
		priceInStore = 0;
	}
	//company와 oilType를 인자로 받고, priceInStore를 0으로 초기화시켜주는 생성자
	public Oil(String c, String o)
	{
		company = c;
		oilType = o;
		priceInStore = 0;
	}
	//priceInStore의 getter
	public double getPriceInStore()
	{
		return priceInStore;
	}
	//priceInStore의 setter
	public void setPriceInStore()
	{
		priceInStore = getOilPrice();
	}
	//company와 oilType의 정보를 String 형태로 return해준다
	public String toString()
	{
		return "company : " + company + "\noil type : " + oilType;
	}
	//abstract method
	public abstract double getOilPrice();
}
