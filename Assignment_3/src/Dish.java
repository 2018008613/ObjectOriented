
public class Dish {
		//instance variable
		private int tableNum;
		private String name;
		private String tool;
		private int time;
		
		//tableNum, name을 인자로 받는생성자
		public Dish(int t, String n)
		{
			tableNum = t;
			name = n;
			setTool(n);
			setTime(tool);
		}
		
		//각 변수들의 getter
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
		
		//음식에 따라 조리 도구를 설정
		public void setTool(String n)
		{
			if(n.equals("ramen") || n.equals("stew"))
				tool = "pot";
			else if(n.equals("friedrice"))
				tool = "fryingpan";
			else if(n.equals("ovenroast"))
				tool = "oven";
		}
		
		//조리 도구에 따라 조리 시간을 설정
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
