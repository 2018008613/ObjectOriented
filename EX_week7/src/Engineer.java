
public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	/*
	 * name, employeeNum, workZone, project�� ���ڷ� �ް� department�� "Engineering"���� �������ִ� ������
	 */
	public Engineer(String n, int e, String w, String p)
	{
		super(n, e);
		super.setDepartment("Engineering");
		workZone = w;
		project = p;
	}
	/*
	 * Engineer�� name, employeeNum, workZone, project�� �����ϴٸ� true, �ٸ��� false�� ��ȯ���ش�
	 */
	public boolean equals(Object otherEng)
	{
		if(!super.equals(otherEng))
			return false;
		Engineer e = (Engineer)otherEng;
		return (workZone.equals(e.workZone) && project.equals(e.project));
	}
	/*
	 * Engineer�� name, employeeNum, location, workZone�� ��ȯ���ش�
	 */
	public String toString()
	{
		return super.toString() + "\nlocation : " + super.getDepartment() + ", zone : " + workZone;
	}

}
