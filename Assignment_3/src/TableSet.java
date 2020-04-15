import java.util.ArrayList;

public class TableSet {
	//instance variable
	private Table[] tableSet;
	
	//tableSet�� ũ�� 5�� �Ҵ����ְ� ������ ĭ�� Table���� ����
	public TableSet()
	{
		tableSet = new Table[5];
		for(int i = 0; i < 5; i++)
			tableSet[i] = new Table();
	}
	
	//Table #[index]�� ������ �߰����ش�
	public void addtoTable(int index, int TableNum, String name)
	{
		ArrayList<Dish> d = tableSet[index].getDishSet();
		d.add(new Dish(TableNum, name));
	}
	
	//tableSet�� getter
	public Table[] getTableSet()
	{
		return tableSet;
	}
}
