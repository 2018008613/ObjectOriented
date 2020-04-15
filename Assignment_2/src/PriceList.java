
public class PriceList {
	private Oil[ ][ ] priceList; //오브젝트를 저장할 클래스 타입 이중 배열
	private int vertical; //배열의 세로 길이
	
	//vertical을 2로, priceList를 new Oil[2][2]로 할당해주는 생성자
	public PriceList()
	{
		vertical = 2;
		priceList = new Oil[2][2];
	}
	//vertical의 getter
	public int getVertical()
	{
		return vertical;
	}
	//priceList의 i행 j열에 oil을 넣어주고, 그것의 priceInStore를 set해준다
	public void setPriceList(int i, int j, Oil oil)
	{
		priceList[i][j] = oil;
		priceList[i][j].setPriceInStore();
	}
	//배열의 세로칸을 amount만큼 늘려준다.
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
	//i번째 행의 모든 정보를 string형태로 return해준다
	public String getRegionInfo(int i)
	{
		return priceList[i][0].toString() + "\n" + priceList[i][1].toString();
	}
	//priceList의 모든 정보를 출력해준다
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
