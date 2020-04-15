import java.util.Scanner;

public class PriceListApp {
	public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			//pricelist 생성
			PriceList pl = new PriceList();
			//a는 현재까지 pricelist에 넣어준 oil을 count해준다
			int a = 0;
			while(true)
			{
				//menu를 출력해준다
				System.out.println("================Main Menu================");
				System.out.println("(1) Add a oil to price list");
				System.out.println("(2) View Region Information");
				System.out.println("(3) Print the entire price list");
				System.out.println("(4) Exit the program");
				System.out.println("=========================================");
				//몇번 메뉴를 실행할지를 입력받는다.
				System.out.print("choose a menu : ");
				int n = key.nextInt();
				//1~4 이외의 숫자를 입력한 경우 오류메세지를 출력한다
				if(n > 4 || n < 1)
					System.out.println("Insert 1 ~ 4");
				else if(n == 1)
				{
					try
					{
						//배열이 꽉 차있는 경우, 즉 pricelist의 줄의 개수와 이때까지 추가한 oil의 수가 같을 경우 full이므로, exception을 throw해준다
						if(a == pl.getVertical())
							throw new FullArrayException();
					}
					catch(FullArrayException e)
					{
						//메세지를 출력해준 뒤 추가할 줄의 수를 입력받은 뒤 그만큼 줄을 추가해준다
						System.out.println(e.getMessage());
						int ext = key.nextInt();
						pl.extendList(ext);
						System.out.println("list is extended.");
						System.out.println();
					}
					finally
					{
						//gasoline과 diesel의 company 이름과 supply price를 순서대로 입력받은 뒤 pricelist에 추가해준다.
						System.out.print("company : ");
						String c1 = key.next();
						System.out.print("supply price : ");
						int p1 = key.nextInt();
						Oil o1 = new Gasoline(p1, c1);
						pl.setPriceList(a, 0, o1);
						System.out.println("gasoline added");
						System.out.println();
						System.out.print("company : ");
						String c2 = key.next();
						System.out.print("supply price : ");
						int p2 = key.nextInt();
						Oil o2 = new Diesel(p2, c2);
						pl.setPriceList(a, 1, o2);
						System.out.println("diesel added");
						System.out.println();
						//현재까지 추가한 oil의 수를 하나 추가해준다
						a++;
					}
				}
				else if(n == 2)
				{
					//출력할 printlist의 region을 입력받고, 그 region의 정보를 출력해준다
					System.out.print("region number to view : ");
					int k = key.nextInt();
					System.out.println(pl.getRegionInfo(k - 1));
				}
				else if(n == 3)
				{
					//printlist의 모든 정보를 출력해준다
					pl.printList();
				}
				else if(n == 4)
				{
					//system을 종료시킨다
					System.out.println("Exit application");
					System.exit(0);
				}
			}
	}
}
