
public class Employee {
	private String name;
	private int employeeNum;
	private String department;
	
	/*
	 * department는 "No Dept"로 초기화해주는 생성자
	 */
	public Employee()
	{
		department = "No Dept";
	}
	/*
	 * name과 employeeNum을 인자로 받는 생성자, department는 "No Dept"로 초기화해준다.
	 */
	public Employee(String n, int e)
	{
		name = n;
		employeeNum = e;
		department = "No Dept";
	}
	/*
	 * department를 인자로 받는 생성자
	 */
	public Employee(String d)
	{
		department = d;
	}
	/*
	 * department의 값을 return해준다
	 */
	public String getDepartment()
	{
		return department;
	}
	/*
	 * department를 parameter로 set해준다
	 */
	public void setDepartment(String d)
	{
		department = d;
	}
	/*
	 * Object obj를 인자로 받아서 obj의 Class type이 Employee이고, o의 name과 employeeNum이 같으면 true를 반환, 그렇지 않으면 false를 반환해준다
	 */
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		else if(this.getClass() != obj.getClass())
			return false;
		else
		{
			Employee e = (Employee)obj;
			return (name.equals(e.name) && employeeNum == e.employeeNum);
		}
	}
	/*
	 * name과 employeeNum을 반환해준다
	 */
	public String toString()
	{
		return "Name : " + name + "\nEmp# : " + employeeNum;
	}

}
