
public class Engineer extends Employee {
	private double rate;
	
	//name�� employeeNum�� ���ڷ� �ް�, department�� Engineering���� ����, rate�� 4.0���� �������ִ� ������
	public Engineer(String n, int e)
	{
		super(n, e);
		super.setDepartment("Engineering");
		rate = 4.0;
	}
	//name�� employeeNum�� ������ true, �̿��� ��쿡�� false�� return���ش�
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
	//name�� employeeNum�� department�� String���·� return���ش�
	public String toString()
	{
		return super.toString() + "Dept : " + super.getDepartment() + "\n";
	}
	//rate * workHrs ���� return���ش�
	public double getPaid()
	{
		return rate * super.getWorkHrs();
	}

}
