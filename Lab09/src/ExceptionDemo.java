import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Employee emp = new Employee("Lee");
		//무한루프
		while(true)
		{
			try 
			{
				//n을 입력받음
				System.out.printf("%d일차 근무 시간을 입력하세요 : ", emp.getWorkDay());				
				int n = key.nextInt();
				//n이 음수일 때의 exception
				if(n < 0)
					throw new NegativeException();
				//n이 0일 때의 exception
				else if(n == 0)
					throw new Exception("Program Exit");
				//n이 24보다 클 때의 exception
				else if(n > 24)
					throw new TooMuchStuffException(n);
				//n이 0보다 크고 24이하일 경우
				else
				{
					emp.addWorkDay();
					emp.addWorkHrs(n);
					System.out.println("이름 : " + emp.getName());
					System.out.println("누적근무시간 : " + emp.getWorkHrs());
					System.out.println("No Exception has been occurred");
				}
			}
			//음수일 경우 catch
			catch(NegativeException e)
			{
				System.out.println(e.getMessage());
			}
			//24보다 클 경우 catch
			catch(TooMuchStuffException e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getInputNum() + " occurs TooMuchStuffException");
			}
			//0일 경우 catch
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.exit(0);
			}
			//finally문
			finally
			{
				System.out.println("End of try-catch statement");
			}
		}
	}

}
