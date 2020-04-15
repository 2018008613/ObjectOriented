
public class Manager extends Employee {
	private int officeNum;
	private String team;
	
	/*
	 * name, employeeNum, officeNum, team을 인자로 받고, department를 "Management"로 설정해주는 생성자
	 */
	public Manager(String n, int e, int o, String t)
	{
		super(n, e);
		super.setDepartment("Management");
		officeNum = o;
		team = t;
	}
	/*
	 * Manager의 name, employeeNum, location 및 하는 일을 반환해준다
	 */
	public String toString()
	{
		return super.toString() + "\nlocation : " + super.getDepartment() + ", office : " + officeNum;
	}
	/*
	 * Manager의 name, employeeNum, officeNum, team이 동일할 경우 true, 다른 경우 false를 반환해준다
	 */
	public boolean equals(Object o)
	{
		if(!super.equals(o))
			return false;
		Manager m = (Manager)o;
		return (officeNum == m.officeNum && team.equals(m.team));
	}
}
