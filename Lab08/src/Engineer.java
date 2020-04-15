
public class Engineer extends Employee {
	private double rate;
	
	//name과 employeeNum을 인자로 받고, department를 Engineering으로 설정, rate를 4.0으로 설정해주는 생성자
	public Engineer(String n, int e)
	{
		super(n, e);
		super.setDepartment("Engineering");
		rate = 4.0;
	}
	//name과 employeeNum이 같으면 true, 이외의 경우에는 false를 return해준다
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
	//name과 employeeNum과 department를 String형태로 return해준다
	public String toString()
	{
		return super.toString() + "Dept : " + super.getDepartment() + "\n";
	}
	//rate * workHrs 값을 return해준다
	public double getPaid()
	{
		return rate * super.getWorkHrs();
	}

}
