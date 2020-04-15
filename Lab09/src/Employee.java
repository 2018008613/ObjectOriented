
public class Employee {
	private String name;
	private int workDay;
	private int workHrs;
	
	//name�� ���ڷ� �ް� workDay�� 1��, workHrs�� 0���� �ʱ�ȭ���ִ� ������
	public Employee(String s)
	{
		name = s;
		workDay = 1;
		workHrs = 0;
	}
	//name�� getter
	public String getName()
	{
		return name;
	}
	//workDay�� getter
	public int getWorkDay()
	{
		return workDay;
	}
	//workHrs�� getter
	public int getWorkHrs()
	{
		return workHrs;
	}
	//workDay�� 1��ŭ ���������ش�
	public void addWorkDay()
	{
		workDay++;
	}
	//workHrs�� Hrs��ŭ ���������ش�
	void addWorkHrs(int Hrs)
	{
		workHrs += Hrs;
	}
}
