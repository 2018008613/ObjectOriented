public class Employee {

	private String name;
	private int age;
	private String position;
	private int salary;
	private int vacationDays;
	public Employee(String n, int a)
	{
		this.name = n;
		this.age = a;
		this.vacationDays = 20;
	}
	public Employee(String n, int a, String p, int s)
	{
		this.name = n;
		this.age = a;
		this.position = p;
		this.salary = s;
		this.vacationDays = 20;
	}
	public Employee(String n, int a, String p, int s, int v)
	{
		this.name = n;
		this.age = a;
		this.position = p;
		this.salary = s;
		this.vacationDays = v;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getPosition()
	{
		return position;
	}
	public int getSalary()
	{
		return salary;
	}
	public int getVacationDays()
	{
		return vacationDays;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setAge(int a)
	{
		this.age = a;
	}
	public void setPosition(String p)
	{
		this.position = p;
	}
	public void setSalary(int s)
	{
		this.salary = s;
	}
	public void setVacationDays(int v)
	{
		this.vacationDays = v;
	}
	public boolean equals(Employee e)
	{
		int chk=0;
		if(this.name==e.getName())
			chk++;
		if(this.age==e.getAge())
			chk++;
		if(this.position==e.getPosition())
			chk++;
		if(chk==3)
			return true;
		else
			return false;
	}
	public String toString()
	{
		System.out.println("Name : " + name + ", Age : " + age + ", Position : " + position + ", Salary : " + salary + ", VacationDays = " + vacationDays);
		return "Name : " + name + ", Age : " + age + ", Position : " + position + ", Salary : " + salary + ", VacationDays = " + vacationDays;
	}
	public boolean vacation(int v)
	{
		if(v > this.vacationDays)
		{
			System.out.println("남은 휴가 일수가 부족합니다.");
			return false;
		}
		vacationDays -= v;
		System.out.printf("휴가를 사용하였습니다. 남은 휴가 일 수 : %d%n",vacationDays);
		return true;
	}
}
