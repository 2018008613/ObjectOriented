
public class TimeTable {
	private Subject[][] timeTable;
	/*
	 * �����ڷ�, initialize method ȣ��
	 */
	public TimeTable()
	{
		initialize();
	}
	/*
	 * timeTable�� [10][5]�� 2���� subject�� �Ҵ�
	 * 3��° ĭ�� subject�� �̸����� BREAK��, 7��° ĭ�� subject�� �̸����� LUNCH��, ������ ĭ���� ----�� �ʱ�ȭ�Ѵ�
	 */
	private void initialize()
	{
		timeTable = new Subject[10][5];
		for(int i = 0;i < 10;i++)
		{
			if(i == 2)
			{
				for(int j = 0;j < 5;j++)
				{
					timeTable[i][j] = new Subject("BREAK");
				}
			}
			else if(i == 6)
			{
				for(int j = 0;j < 5;j++)
				{
					timeTable[i][j] = new Subject("LUNCH");
				}
			}
			else
			{
				for(int j = 0;j < 5;j++)
				{
					timeTable[i][j] = new Subject("----");
				}
			}
		}
	}
	/*
	 * d�� ���Ͽ� �´� ���ڸ� return
	 */
	private int getNumByDay(String d)
	{
		if(d.equals("MON"))
			return 0;
		else if(d.equals("TUE"))
			return 1;
		else if(d.equals("WED"))
			return 2;
		else if(d.equals("THU"))
			return 3;
		else if(d.equals("FRI"))
			return 4;
		else
			return -1;
	}
	/*
	 * n�� -1�� �ƴ� ��, �� ��ġ�� subject�� ã�Ƽ� return
	 */
	public Subject getSchedule(String day, int period)
	{
		int n = getNumByDay(day);
		if(n == -1)
			return null;
		return timeTable[period - 1][n];
	}
	/*
	 * �ð�ǥ�� ��� �ִ� BREAK,LUNCH,----�� �ƴ� ��� subject���� subject[] s�� ��Ƽ� return
	 */
	public Subject[] getAllSubjects()
	{
		int n = 0;
		for(int i = 0;i < 10;i++)
			for(int j = 0;j < 5;j++)
				if(!timeTable[i][j].getName().equals("----") && !timeTable[i][j].getName().equals("BREAK") && !timeTable[i][j].getName().equals("LUNCH"))
					n++;
		int t = 0;
		Subject[] s = new Subject[n];
		for(int i = 0;i < 10;i++)
			for(int j = 0;j < 5;j++)
				if(!timeTable[i][j].getName().equals("----") && !timeTable[i][j].getName().equals("BREAK") && !timeTable[i][j].getName().equals("LUNCH"))
					{
						s[t] = new Subject(timeTable[i][j].getName(), timeTable[i][j].getTutor(), timeTable[i][j].getRoom());
						t++;
					}
		return s;
	}
	/*
	 * �ð�ǥ �ȿ� title�� ���� �̸��� ������ ������ �� subject�� return, ������ null�� return
	 */
	public Subject getSubjectByTitle(String title)
	{
		for(int i = 0;i < 10;i++)
			for(int j = 0;j < 5;j++)
				if(timeTable[i][j].getName().equals(title))
					return timeTable[i][j];
		return null;
	}
	/*
	 * �ð�ǥ�� day, period�� �´� �ڸ��� name, tutor, room���� subject�� ���� �־��ִ� �Լ�. 
	 * period�� 3,7�̰ų� n�� -1�� ��� false�� return, �� �̿ܿ� ������ true�� return.
	 */
	public boolean setSchedule(String day, int period, String na, String t, String r)
	{
		if(period == 3 || period == 7)
			return false;
		int n = getNumByDay(day);
		if(n == -1)
			return false;
		Subject s = new Subject(na, t, r);
		timeTable[period - 1][n] = s;
		return true;
	}
	/*
	 * timetable�� ������ִ� �Լ�
	 */
	public void printTimetable()
	{
		System.out.println("   \tMON\tTUE\tWED\tTHU\tFRI");
		for(int i = 0;i < 10;i++)
		{
			System.out.print((i + 1) + "\t");
			for(int j = 0;j < 5;j++)
				System.out.print(timeTable[i][j].getName() + "\t");
			System.out.println();
		}
	}

}
