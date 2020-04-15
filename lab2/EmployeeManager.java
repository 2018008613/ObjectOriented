public class EmployeeManager {
	public static void main(String[] args)
	{
		Employee e1 = new Employee("James Wright", 42, "Manager", 20000);
		e1.toString();
		Employee e2 = new Employee("Amy Smith", 27, "Design Coordinator", 8000, 15);
		e2.toString();
		Employee e3 = new Employee("Peter Coolidge", 32, "Assistant Manager", 12000, 7);
		e3.toString();
		Employee e4 = new Employee("John Doe", 22, "Engineer", 10000, 10);
		e4.toString();
		Employee e5 = new Employee("Ahn Sang Wook", 24, "Student", 10000);
		if(e2.equals(e5))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		e1.vacation(10);
		e3.vacation(10);
		e1.toString();
		e2.toString();
		e3.toString();
		e4.toString();
	}
}
