import java.util.Scanner;

public class TimeTableApp {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TimeTable t = new TimeTable();
		while(true)
		{
			/*
			 * 메뉴얼 출력
			 */
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a class to my time table");
			System.out.println("(2) View the class");
			System.out.println("(3) Print the entire time table");
			System.out.println("(4) Exit the program");
			/*
			 * 실행시킬 메뉴얼의 숫자 입력
			 */
			int n = sc.nextInt();
			String trash = sc.nextLine();
			if(n == 1)
			{
				/*
				 * setschedule에 필요한 요소들을 모두 입력받고 setschedule을 시행해서 성공시 실패시 각각의 메세지를 출력
				 */
				System.out.print("Day : ");
				String Day = sc.next();
				Day = Day.toUpperCase();
				System.out.print("Period : ");
				int period = sc.nextInt();
				System.out.print("Name : ");
				String name = sc.next();
				System.out.print("Tutor : ");
				String tutor = sc.next();
				System.out.print("Room : ");
				String room = sc.next();
				if(t.setSchedule(Day, period, name, tutor, room))
					System.out.println("Class successfully added");
				else
					System.out.println("Class was NOT successfully added");
			}
			else if(n == 2)
			{
				/*
				 * 2를 입력받았을 때의 메뉴얼 출력
				 */
				System.out.println("==============View the Class=============");
				System.out.println("(1) At a specific period");
				System.out.println("(2) By subject title");
				int n1 = sc.nextInt();
				if(n1 == 1)
				{
					/*
					 * day와 period를 입력받아 그 시간의 subject 정보를 출력
					 */
					System.out.print("Day : ");
					String Day = sc.next();
					Day = Day.toUpperCase();
					System.out.print("Period : ");
					int period = sc.nextInt();
					System.out.println("At that time you have");
					System.out.println(t.getSchedule(Day, period).getDetails());
				}
				else if(n1 == 2)
				{
					System.out.println("=============By subject title============");
					System.out.println("(1) Specific title");
					System.out.println("(2) View all subjects");
					int n2 = sc.nextInt();
					if(n2 == 1)
					{
						/*
						 * 과목 이름을 입력받아 그 과목이 timetable 안에 있으면 그 subject의 정보를 출력, 없으면 에러메세지 출력
						 */
						System.out.print("Title : ");
						String name = sc.next();
						Subject sub = t.getSubjectByTitle(name);
						if(sub == null)
							System.out.println("It doesn't exist");
						else
							System.out.println(sub.getDetails());
					}
					else if(n2 == 2)
					{
						/*
						 * timetable 안의 모든 subject 출력
						 */
						Subject[] sub = t.getAllSubjects();
						for(int i=0;i<sub.length;i++)
						{
							System.out.println("------------");
							System.out.println(sub[i].getDetails());
							System.out.println("------------");
						}
					}
					else
					{
						System.out.println("Insert 1 ~ 2");
					}
				}
				else
				{
					System.out.println("Insert 1 ~ 2");
				}
			}
			else if(n == 3)
			{
				/*
				 * timetable 출력
				 */
				t.printTimetable();
			}
			else if(n == 4)
			{
				break;
			}
			else
			{
				System.out.println("Insert 1 ~ 4");
			}
		}
	}

}
