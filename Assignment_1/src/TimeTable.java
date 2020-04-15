
public class TimeTable {
	private Subject[][] timeTable;
	/*
	 * 생성자로, initialize method 호출
	 */
	public TimeTable()
	{
		initialize();
	}
	/*
	 * timeTable을 [10][5]인 2차원 subject로 할당
	 * 3번째 칸의 subject의 이름들을 BREAK로, 7번째 칸의 subject의 이름들을 LUNCH로, 나머지 칸들을 ----로 초기화한다
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
	 * d의 요일에 맞는 숫자를 return
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
	 * n이 -1이 아닐 때, 그 위치의 subject를 찾아서 return
	 */
	public Subject getSchedule(String day, int period)
	{
		int n = getNumByDay(day);
		if(n == -1)
			return null;
		return timeTable[period - 1][n];
	}
	/*
	 * 시간표에 담겨 있는 BREAK,LUNCH,----가 아닌 모든 subject들을 subject[] s에 담아서 return
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
	 * 시간표 안에 title과 같은 이름의 과목이 있으면 그 subject를 return, 없으면 null을 return
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
	 * 시간표의 day, period에 맞는 자리에 name, tutor, room으로 subject를 만들어서 넣어주는 함수. 
	 * period가 3,7이거나 n이 -1일 경우 false를 return, 그 이외에 성공시 true를 return.
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
	 * timetable을 출력해주는 함수
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
