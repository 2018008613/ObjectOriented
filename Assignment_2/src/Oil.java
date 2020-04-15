
public abstract class Oil {
	private String company;
	private String oilType;
	private double priceInStore;
	
	//���ڸ� ���� �ʴ� �����ڷ�, priceInStore��  0���� �ʱ�ȭ�����ش�.
	public Oil()
	{
		priceInStore = 0;
	}
	//company�� oilType�� ���ڷ� �ް�, priceInStore�� 0���� �ʱ�ȭ�����ִ� ������
	public Oil(String c, String o)
	{
		company = c;
		oilType = o;
		priceInStore = 0;
	}
	//priceInStore�� getter
	public double getPriceInStore()
	{
		return priceInStore;
	}
	//priceInStore�� setter
	public void setPriceInStore()
	{
		priceInStore = getOilPrice();
	}
	//company�� oilType�� ������ String ���·� return���ش�
	public String toString()
	{
		return "company : " + company + "\noil type : " + oilType;
	}
	//abstract method
	public abstract double getOilPrice();
}
