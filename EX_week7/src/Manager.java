
public class Manager extends Employee {
	private int officeNum;
	private String team;
	
	/*
	 * name, employeeNum, officeNum, team�� ���ڷ� �ް�, department�� "Management"�� �������ִ� ������
	 */
	public Manager(String n, int e, int o, String t)
	{
		super(n, e);
		super.setDepartment("Management");
		officeNum = o;
		team = t;
	}
	/*
	 * Manager�� name, employeeNum, location �� �ϴ� ���� ��ȯ���ش�
	 */
	public String toString()
	{
		return super.toString() + "\nlocation : " + super.getDepartment() + ", office : " + officeNum;
	}
	/*
	 * Manager�� name, employeeNum, officeNum, team�� ������ ��� true, �ٸ� ��� false�� ��ȯ���ش�
	 */
	public boolean equals(Object o)
	{
		if(!super.equals(o))
			return false;
		Manager m = (Manager)o;
		return (officeNum == m.officeNum && team.equals(m.team));
	}
}
