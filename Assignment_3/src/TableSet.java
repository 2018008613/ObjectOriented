import java.util.ArrayList;

public class TableSet {
	//instance variable
	private Table[] tableSet;
	
	//tableSet을 크기 5로 할당해주고 각각의 칸의 Table들을 생성
	public TableSet()
	{
		tableSet = new Table[5];
		for(int i = 0; i < 5; i++)
			tableSet[i] = new Table();
	}
	
	//Table #[index]에 음식을 추가해준다
	public void addtoTable(int index, int TableNum, String name)
	{
		ArrayList<Dish> d = tableSet[index].getDishSet();
		d.add(new Dish(TableNum, name));
	}
	
	//tableSet의 getter
	public Table[] getTableSet()
	{
		return tableSet;
	}
}
