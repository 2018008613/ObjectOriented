import java.util.Calendar;
import java.util.Random;
import kr.co.Lab05.Collection.*;

public class Program {
	public static void main(String[] args)
	{
		/**
		 * 직원 한 명을 생성한다.
		 */
		Employee p1 = new Employee("Ahn", 4500);
		/**
		 * 현재 날짜 정보를 담고 있는 cal을 생성하고 syear,smonth,sday에 년,월,일을 담는다.
		 */
		Calendar cal = Calendar.getInstance();
		int syear = cal.get(Calendar.YEAR);
		int smonth = cal.get(Calendar.MONTH) + 1;
		int sday = cal.get(Calendar.DAY_OF_MONTH);
		/**
		 * 현재 날짜를 출력한다.
		 */
		System.out.println("계약일 : " + syear + "/" + smonth + "/" + sday);
		/**
		 * 생성한 직원의 정보를 출력한다.
		 */
		System.out.printf("Name : %s%n", p1.getName());
		System.out.printf("연봉 : %f%n", p1.getYearlySalary());
		System.out.printf("월급 : %f%n", p1.getMonthlySalary());
		System.out.printf("재산 : %f%n", p1.getBalance());
		/**
		 * 인센티브를 받을 랜덤한 월을 생성한다.
		 */
		Random rnd = new Random();
		int rmonth = rnd.nextInt(12) + 1;
		/**
		 * year에 몇년차인지 저장
		 */
		int year = 1;
		/**
		 * 재산이 20000이상 될 때까지 반복문을 돌린다.
		 */
		while(p1.getBalance() < 20000)
		{
			/**
			 * while문이 돌 때마다 cal에 한 달씩 증가시키며 현재 월을 month에 담는다.
			 */
			cal.add(Calendar.MONTH, 1);
			int month = cal.get(Calendar.MONTH) + 1;
			/**
			 * 월급을 받는다.
			 */
			p1.receiveSalary();
			/**
			 * 만약 현재 월이 인센티브를 받는 달이면 인센티브를 받는다.
			 */
			if(month == rmonth)
			{
				p1.receiveSalary();
				System.out.printf("%d년차 %d월에 인센티브를 받았습니다.%n", year, month);
			}
			/**
			 * 만약 근무한지 12개월이 지났다면 연봉을 증가시키고 인센티브를 부여할 월을 초기화한다.
			 */
			if(month == smonth)
			{
				year++;
				double rpersent = rnd.nextDouble() * 10;
				p1.increaseYearlySalary(rpersent);
				System.out.printf("%d년차 연봉이 %f%% 인상되었습니다.%n", year, rpersent);
				rmonth = rnd.nextInt(12) + 1;
			}
		}
		/**
		 * 직원의 재산이 20000이상 된 날짜를 각 변수에 저장하고 출력한다.
		 */
		int endyear = cal.get(Calendar.YEAR);
		int endmonth = cal.get(Calendar.MONTH) + 1;
		int endday = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("날짜 : " + endyear + "/" + endmonth + "/" + endday);
		/**
		 * 직원의 정보를 출력한다.
		 */
		System.out.printf("이름 : %s%n", p1.getName());
		System.out.printf("연봉 : %f%n", p1.getYearlySalary());
		System.out.printf("월급 : %f%n", p1.getMonthlySalary());
		System.out.printf("재산 : %f%n", p1.getBalance());
	}
}
