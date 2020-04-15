
public class Employee {
	private String name;
	private int employeeNum;
	private String department;
	
	/*
	 * department�� "No Dept"�� �ʱ�ȭ���ִ� ������
	 */
	public Employee()
	{
		department = "No Dept";
	}
	/*
	 * name�� employeeNum�� ���ڷ� �޴� ������, department�� "No Dept"�� �ʱ�ȭ���ش�.
	 */
	public Employee(String n, int e)
	{
		name = n;
		employeeNum = e;
		department = "No Dept";
	}
	/*
	 * department�� ���ڷ� �޴� ������
	 */
	public Employee(String d)
	{
		department = d;
	}
	/*
	 * department�� ���� return���ش�
	 */
	public String getDepartment()
	{
		return department;
	}
	/*
	 * department�� parameter�� set���ش�
	 */
	public void setDepartment(String d)
	{
		department = d;
	}
	/*
	 * Object obj�� ���ڷ� �޾Ƽ� obj�� Class type�� Employee�̰�, o�� name�� employeeNum�� ������ true�� ��ȯ, �׷��� ������ false�� ��ȯ���ش�
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
	 * name�� employeeNum�� ��ȯ���ش�
	 */
	public String toString()
	{
		return "Name : " + name + "\nEmp# : " + employeeNum;
	}

}
