import java.util.ArrayList;

public class Table {
	//instance variable
	private int TableNum;
	private ArrayList<Dish> dishSet;
	
	//dishSet을 크기가 4인 ArrayList로 초기화하는 생성자
	public Table()
	{
		dishSet = new ArrayList<Dish>(4);
	}
	
	//TableNum의 getter와 setter
	public int getTableNum()
	{
		return TableNum;
	}
	
	public void setTableNum(int t)
	{
		TableNum = t;
	}
	
	//dishSet의 getter
	public ArrayList<Dish> getDishSet()
	{
		return dishSet;
	}
}
