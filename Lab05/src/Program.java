import java.util.Calendar;
import java.util.Random;
import kr.co.Lab05.Collection.*;

public class Program {
	public static void main(String[] args)
	{
		/**
		 * ���� �� ���� �����Ѵ�.
		 */
		Employee p1 = new Employee("Ahn", 4500);
		/**
		 * ���� ��¥ ������ ��� �ִ� cal�� �����ϰ� syear,smonth,sday�� ��,��,���� ��´�.
		 */
		Calendar cal = Calendar.getInstance();
		int syear = cal.get(Calendar.YEAR);
		int smonth = cal.get(Calendar.MONTH) + 1;
		int sday = cal.get(Calendar.DAY_OF_MONTH);
		/**
		 * ���� ��¥�� ����Ѵ�.
		 */
		System.out.println("����� : " + syear + "/" + smonth + "/" + sday);
		/**
		 * ������ ������ ������ ����Ѵ�.
		 */
		System.out.printf("Name : %s%n", p1.getName());
		System.out.printf("���� : %f%n", p1.getYearlySalary());
		System.out.printf("���� : %f%n", p1.getMonthlySalary());
		System.out.printf("��� : %f%n", p1.getBalance());
		/**
		 * �μ�Ƽ�긦 ���� ������ ���� �����Ѵ�.
		 */
		Random rnd = new Random();
		int rmonth = rnd.nextInt(12) + 1;
		/**
		 * year�� ��������� ����
		 */
		int year = 1;
		/**
		 * ����� 20000�̻� �� ������ �ݺ����� ������.
		 */
		while(p1.getBalance() < 20000)
		{
			/**
			 * while���� �� ������ cal�� �� �޾� ������Ű�� ���� ���� month�� ��´�.
			 */
			cal.add(Calendar.MONTH, 1);
			int month = cal.get(Calendar.MONTH) + 1;
			/**
			 * ������ �޴´�.
			 */
			p1.receiveSalary();
			/**
			 * ���� ���� ���� �μ�Ƽ�긦 �޴� ���̸� �μ�Ƽ�긦 �޴´�.
			 */
			if(month == rmonth)
			{
				p1.receiveSalary();
				System.out.printf("%d���� %d���� �μ�Ƽ�긦 �޾ҽ��ϴ�.%n", year, month);
			}
			/**
			 * ���� �ٹ����� 12������ �����ٸ� ������ ������Ű�� �μ�Ƽ�긦 �ο��� ���� �ʱ�ȭ�Ѵ�.
			 */
			if(month == smonth)
			{
				year++;
				double rpersent = rnd.nextDouble() * 10;
				p1.increaseYearlySalary(rpersent);
				System.out.printf("%d���� ������ %f%% �λ�Ǿ����ϴ�.%n", year, rpersent);
				rmonth = rnd.nextInt(12) + 1;
			}
		}
		/**
		 * ������ ����� 20000�̻� �� ��¥�� �� ������ �����ϰ� ����Ѵ�.
		 */
		int endyear = cal.get(Calendar.YEAR);
		int endmonth = cal.get(Calendar.MONTH) + 1;
		int endday = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("��¥ : " + endyear + "/" + endmonth + "/" + endday);
		/**
		 * ������ ������ ����Ѵ�.
		 */
		System.out.printf("�̸� : %s%n", p1.getName());
		System.out.printf("���� : %f%n", p1.getYearlySalary());
		System.out.printf("���� : %f%n", p1.getMonthlySalary());
		System.out.printf("��� : %f%n", p1.getBalance());
	}
}
