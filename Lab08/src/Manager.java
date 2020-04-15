
public class Manager extends Employee {
	private double overtimeRate;
	private double rate;
	private int regularHrs;
	
	//name과 employeeNum을 인자로 받고 department를 Management로, rate를 5.0, overtimeRate을 8.0, regularHrs를 40으로 설정해주는 생성자
	Manager(String n, int e)
	{
		super(n,e);
		super.setDepartment("Management");
		rate = 5.0;
		overtimeRate = 8.0;
		regularHrs = 40;
	}
	//name과 employeeNum이 같으면 true를, 그 이외의 경우에는 false를 return해준다
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
	//name과 employeeNum과 department를 String형태로 return해준다
	public String toString()
	{
		return super.toString() + "Dept : " + super.getDepartment() + "\n";
	}
	//workHrs가 40 미만이면 workHrs * rate를 return, 40 이상일 때는 (regularHrs * rate) + (overtimeHrs * overtimeRate)를 return해준다.
	public double getPaid()
	{
		int overtimeHrs = super.getWorkHrs() - regularHrs;
		if(super.getWorkHrs() < 40)
			return super.getWorkHrs() * rate;
		//workHrs가 40 이상일 때
		return (regularHrs * rate) + (overtimeHrs * overtimeRate);
	}
}
