
public class Employee {
	private String name;
	private int workDay;
	private int workHrs;
	
	//name을 인자로 받고 workDay를 1로, workHrs를 0으로 초기화해주는 생성자
	public Employee(String s)
	{
		name = s;
		workDay = 1;
		workHrs = 0;
	}
	//name의 getter
	public String getName()
	{
		return name;
	}
	//workDay의 getter
	public int getWorkDay()
	{
		return workDay;
	}
	//workHrs의 getter
	public int getWorkHrs()
	{
		return workHrs;
	}
	//workDay를 1만큼 증가시켜준다
	public void addWorkDay()
	{
		workDay++;
	}
	//workHrs를 Hrs만큼 증가시켜준다
	void addWorkHrs(int Hrs)
	{
		workHrs += Hrs;
	}
}
