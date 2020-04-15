
public class Manager extends Employee {
	private double overtimeRate;
	private double rate;
	private int regularHrs;
	
	//name�� employeeNum�� ���ڷ� �ް� department�� Management��, rate�� 5.0, overtimeRate�� 8.0, regularHrs�� 40���� �������ִ� ������
	Manager(String n, int e)
	{
		super(n,e);
		super.setDepartment("Management");
		rate = 5.0;
		overtimeRate = 8.0;
		regularHrs = 40;
	}
	//name�� employeeNum�� ������ true��, �� �̿��� ��쿡�� false�� return���ش�
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
	//name�� employeeNum�� department�� String���·� return���ش�
	public String toString()
	{
		return super.toString() + "Dept : " + super.getDepartment() + "\n";
	}
	//workHrs�� 40 �̸��̸� workHrs * rate�� return, 40 �̻��� ���� (regularHrs * rate) + (overtimeHrs * overtimeRate)�� return���ش�.
	public double getPaid()
	{
		int overtimeHrs = super.getWorkHrs() - regularHrs;
		if(super.getWorkHrs() < 40)
			return super.getWorkHrs() * rate;
		//workHrs�� 40 �̻��� ��
		return (regularHrs * rate) + (overtimeHrs * overtimeRate);
	}
}
