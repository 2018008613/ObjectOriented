import java.util.ArrayList;

public class Table {
	//instance variable
	private int TableNum;
	private ArrayList<Dish> dishSet;
	
	//dishSet�� ũ�Ⱑ 4�� ArrayList�� �ʱ�ȭ�ϴ� ������
	public Table()
	{
		dishSet = new ArrayList<Dish>(4);
	}
	
	//TableNum�� getter�� setter
	public int getTableNum()
	{
		return TableNum;
	}
	
	public void setTableNum(int t)
	{
		TableNum = t;
	}
	
	//dishSet�� getter
	public ArrayList<Dish> getDishSet()
	{
		return dishSet;
	}
}
