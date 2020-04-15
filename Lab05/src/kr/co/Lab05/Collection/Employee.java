package kr.co.Lab05.Collection;

public class Employee {
	private String name;
	private double yearly_salary;
	private double monthly_salary;
	private double balance;
	/**
	 * n과 ys를 인자로 받아서
	 * name에 n, yearly_salary에 ys 값을 넣어주는 생성자
	 * monthly_salary는 ys/12, balance는 0으로 초기화
	 */
	public Employee(String n, double ys)
	{
		name = n;
		yearly_salary = ys;
		monthly_salary = ys / 12;
		balance = 0;
	}
	/**
	 * name을 반환해주는 Method
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * yearly_salary값을 반환해주는 Method
	 */
	public double getYearlySalary()
	{
		return yearly_salary;
	}
	/**
	 * monthly_salary값을 반환해주는 Method
	 */
	public double getMonthlySalary()
	{
		return monthly_salary;
	}
	/**
	 * balance값을 반환해주는 Method
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * byPercent만큼 현재의 연봉 yearly_salary를 증가시켜주고
	 * 월급도 yearly_salary/12로 바꿔주는 Method
	 */
	public void increaseYearlySalary(double byPercent)
	{
		yearly_salary += yearly_salary * byPercent / 100;
		monthly_salary = yearly_salary / 12;
	}
	/**
	 * monthly_salary 값을 balance에 더해주는 함수
	 */
	public void receiveSalary()
	{
		balance += monthly_salary;
	}
}
