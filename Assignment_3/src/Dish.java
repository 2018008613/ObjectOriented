
public class Dish {
		//instance variable
		private int tableNum;
		private String name;
		private String tool;
		private int time;
		
		//tableNum, name�� ���ڷ� �޴»�����
		public Dish(int t, String n)
		{
			tableNum = t;
			name = n;
			setTool(n);
			setTime(tool);
		}
		
		//�� �������� getter
		public int getTableNum()
		{
			return tableNum;
		}
		public String getName()
		{
			return name;
		}
		public String getTool()
		{
			return tool;
		}
		public int getTime()
		{
			return time;
		}
		
		//���Ŀ� ���� ���� ������ ����
		public void setTool(String n)
		{
			if(n.equals("ramen") || n.equals("stew"))
				tool = "pot";
			else if(n.equals("friedrice"))
				tool = "fryingpan";
			else if(n.equals("ovenroast"))
				tool = "oven";
		}
		
		//���� ������ ���� ���� �ð��� ����
		public void setTime(String t)
		{
			if(t.equals("pot"))
				time = 350;
			else if(t.equals("fryingpan"))
				time = 500;
			else if(t.equals("oven"))
				time = 1300;
		}
}
