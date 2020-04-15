
public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	/*
	 * name, employeeNum, workZone, project를 인자로 받고 department를 "Engineering"으로 설정해주는 생성자
	 */
	public Engineer(String n, int e, String w, String p)
	{
		super(n, e);
		super.setDepartment("Engineering");
		workZone = w;
		project = p;
	}
	/*
	 * Engineer의 name, employeeNum, workZone, project가 동일하다면 true, 다르면 false를 반환해준다
	 */
	public boolean equals(Object otherEng)
	{
		if(!super.equals(otherEng))
			return false;
		Engineer e = (Engineer)otherEng;
		return (workZone.equals(e.workZone) && project.equals(e.project));
	}
	/*
	 * Engineer의 name, employeeNum, location, workZone을 반환해준다
	 */
	public String toString()
	{
		return super.toString() + "\nlocation : " + super.getDepartment() + ", zone : " + workZone;
	}

}
