
public abstract class Employee {
	 private String name;
	 private int employeeNum;
	 private String department;
	 private int workHrs;
	 private double salary;
	 
	 //인자를 받지 않는 생성자
	 public Employee()
	 {
		 workHrs = 0;
		 salary = 0;
	 }
	 //name과 employeeNum을 인자로 받는 생성자
	 public Employee(String n, int e)
	 {
		 name = n;
		 employeeNum = e;
		 workHrs = 0;
		 salary = 0;
	 }
	 //department를 return해주는 getter
	 public String getDepartment()
	 {
		 return department;
	 }
	 //department를 설정해주는 setter
	 public void setDepartment(String d)
	 {
		 department = d;
	 }
	 //workHrs를 return해주는 getter
	 public int getWorkHrs()
	 {
		 return workHrs;
	 }
	 //name과 employeeNum이 같으면 true, 그 이외의 경우에는 false를 return해준다
	 public boolean equals(Object obj)
	 {
		 if(obj == null)
			 return false;
		 else if(getClass() != obj.getClass())
			 return false;
		 Employee emp = (Employee)obj;
		 return (name.equals(emp.name) && employeeNum == emp.employeeNum);
	 }
	 //name과 employeeNum을 String 형태로 return해준다
	 public String toString()
	 {
		 return "Name : " + name + "\nEmp# : " + employeeNum + "\n";
	 }
	 //hrs만큼 workHrs를 증가시켜주고 salary를 getPaid()를 통해 설정해준다
	 public void doWork(int hrs)
	 {
		 workHrs += hrs;
		 salary = getPaid();
	 }
	 //abstract method
	 public abstract double getPaid();
	 //emp와의 salary가 같으면 true를 return해준다
	 public boolean equalPay(Employee emp)
	 {
		 return (salary == emp.salary);
	 }
	 

}
