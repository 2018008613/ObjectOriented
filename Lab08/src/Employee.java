
public abstract class Employee {
	 private String name;
	 private int employeeNum;
	 private String department;
	 private int workHrs;
	 private double salary;
	 
	 //���ڸ� ���� �ʴ� ������
	 public Employee()
	 {
		 workHrs = 0;
		 salary = 0;
	 }
	 //name�� employeeNum�� ���ڷ� �޴� ������
	 public Employee(String n, int e)
	 {
		 name = n;
		 employeeNum = e;
		 workHrs = 0;
		 salary = 0;
	 }
	 //department�� return���ִ� getter
	 public String getDepartment()
	 {
		 return department;
	 }
	 //department�� �������ִ� setter
	 public void setDepartment(String d)
	 {
		 department = d;
	 }
	 //workHrs�� return���ִ� getter
	 public int getWorkHrs()
	 {
		 return workHrs;
	 }
	 //name�� employeeNum�� ������ true, �� �̿��� ��쿡�� false�� return���ش�
	 public boolean equals(Object obj)
	 {
		 if(obj == null)
			 return false;
		 else if(getClass() != obj.getClass())
			 return false;
		 Employee emp = (Employee)obj;
		 return (name.equals(emp.name) && employeeNum == emp.employeeNum);
	 }
	 //name�� employeeNum�� String ���·� return���ش�
	 public String toString()
	 {
		 return "Name : " + name + "\nEmp# : " + employeeNum + "\n";
	 }
	 //hrs��ŭ workHrs�� ���������ְ� salary�� getPaid()�� ���� �������ش�
	 public void doWork(int hrs)
	 {
		 workHrs += hrs;
		 salary = getPaid();
	 }
	 //abstract method
	 public abstract double getPaid();
	 //emp���� salary�� ������ true�� return���ش�
	 public boolean equalPay(Employee emp)
	 {
		 return (salary == emp.salary);
	 }
	 

}
