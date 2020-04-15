import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Employee emp = new Employee("Lee");
		//���ѷ���
		while(true)
		{
			try 
			{
				//n�� �Է¹���
				System.out.printf("%d���� �ٹ� �ð��� �Է��ϼ��� : ", emp.getWorkDay());				
				int n = key.nextInt();
				//n�� ������ ���� exception
				if(n < 0)
					throw new NegativeException();
				//n�� 0�� ���� exception
				else if(n == 0)
					throw new Exception("Program Exit");
				//n�� 24���� Ŭ ���� exception
				else if(n > 24)
					throw new TooMuchStuffException(n);
				//n�� 0���� ũ�� 24������ ���
				else
				{
					emp.addWorkDay();
					emp.addWorkHrs(n);
					System.out.println("�̸� : " + emp.getName());
					System.out.println("�����ٹ��ð� : " + emp.getWorkHrs());
					System.out.println("No Exception has been occurred");
				}
			}
			//������ ��� catch
			catch(NegativeException e)
			{
				System.out.println(e.getMessage());
			}
			//24���� Ŭ ��� catch
			catch(TooMuchStuffException e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getInputNum() + " occurs TooMuchStuffException");
			}
			//0�� ��� catch
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.exit(0);
			}
			//finally��
			finally
			{
				System.out.println("End of try-catch statement");
			}
		}
	}

}
