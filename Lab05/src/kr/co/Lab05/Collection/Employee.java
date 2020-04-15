package kr.co.Lab05.Collection;

public class Employee {
	private String name;
	private double yearly_salary;
	private double monthly_salary;
	private double balance;
	/**
	 * n�� ys�� ���ڷ� �޾Ƽ�
	 * name�� n, yearly_salary�� ys ���� �־��ִ� ������
	 * monthly_salary�� ys/12, balance�� 0���� �ʱ�ȭ
	 */
	public Employee(String n, double ys)
	{
		name = n;
		yearly_salary = ys;
		monthly_salary = ys / 12;
		balance = 0;
	}
	/**
	 * name�� ��ȯ���ִ� Method
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * yearly_salary���� ��ȯ���ִ� Method
	 */
	public double getYearlySalary()
	{
		return yearly_salary;
	}
	/**
	 * monthly_salary���� ��ȯ���ִ� Method
	 */
	public double getMonthlySalary()
	{
		return monthly_salary;
	}
	/**
	 * balance���� ��ȯ���ִ� Method
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * byPercent��ŭ ������ ���� yearly_salary�� ���������ְ�
	 * ���޵� yearly_salary/12�� �ٲ��ִ� Method
	 */
	public void increaseYearlySalary(double byPercent)
	{
		yearly_salary += yearly_salary * byPercent / 100;
		monthly_salary = yearly_salary / 12;
	}
	/**
	 * monthly_salary ���� balance�� �����ִ� �Լ�
	 */
	public void receiveSalary()
	{
		balance += monthly_salary;
	}
}
