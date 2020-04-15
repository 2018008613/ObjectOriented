
public class PriceList {
	private Oil[ ][ ] priceList; //������Ʈ�� ������ Ŭ���� Ÿ�� ���� �迭
	private int vertical; //�迭�� ���� ����
	
	//vertical�� 2��, priceList�� new Oil[2][2]�� �Ҵ����ִ� ������
	public PriceList()
	{
		vertical = 2;
		priceList = new Oil[2][2];
	}
	//vertical�� getter
	public int getVertical()
	{
		return vertical;
	}
	//priceList�� i�� j���� oil�� �־��ְ�, �װ��� priceInStore�� set���ش�
	public void setPriceList(int i, int j, Oil oil)
	{
		priceList[i][j] = oil;
		priceList[i][j].setPriceInStore();
	}
	//�迭�� ����ĭ�� amount��ŭ �÷��ش�.
	public void extendList(int amount)
	{
		vertical += amount;
		Oil[][] p = new Oil[vertical][2];
		for(int i = 0; i < priceList.length; i++)
		{
			p[i][0] = priceList[i][0];
			p[i][1] = priceList[i][1];
		}
		priceList = p;
	}
	//i��° ���� ��� ������ string���·� return���ش�
	public String getRegionInfo(int i)
	{
		return priceList[i][0].toString() + "\n" + priceList[i][1].toString();
	}
	//priceList�� ��� ������ ������ش�
	public void printList()
	{
		System.out.println("\t\tGasoline\tDiesel");
		System.out.println("=================================================");
		for(int i = 0; i < priceList.length; i++)
		{
			if(priceList[i][0] != null && priceList[i][1] != null)
				System.out.println("Region #" + (i + 1) + "\t" + priceList[i][0].getPriceInStore() + "\t\t" + priceList[i][1].getPriceInStore() + "\n");
		}
	}
}
