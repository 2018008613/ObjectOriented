import java.util.Scanner;

public class PriceListApp {
	public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			//pricelist ����
			PriceList pl = new PriceList();
			//a�� ������� pricelist�� �־��� oil�� count���ش�
			int a = 0;
			while(true)
			{
				//menu�� ������ش�
				System.out.println("================Main Menu================");
				System.out.println("(1) Add a oil to price list");
				System.out.println("(2) View Region Information");
				System.out.println("(3) Print the entire price list");
				System.out.println("(4) Exit the program");
				System.out.println("=========================================");
				//��� �޴��� ���������� �Է¹޴´�.
				System.out.print("choose a menu : ");
				int n = key.nextInt();
				//1~4 �̿��� ���ڸ� �Է��� ��� �����޼����� ����Ѵ�
				if(n > 4 || n < 1)
					System.out.println("Insert 1 ~ 4");
				else if(n == 1)
				{
					try
					{
						//�迭�� �� ���ִ� ���, �� pricelist�� ���� ������ �̶����� �߰��� oil�� ���� ���� ��� full�̹Ƿ�, exception�� throw���ش�
						if(a == pl.getVertical())
							throw new FullArrayException();
					}
					catch(FullArrayException e)
					{
						//�޼����� ������� �� �߰��� ���� ���� �Է¹��� �� �׸�ŭ ���� �߰����ش�
						System.out.println(e.getMessage());
						int ext = key.nextInt();
						pl.extendList(ext);
						System.out.println("list is extended.");
						System.out.println();
					}
					finally
					{
						//gasoline�� diesel�� company �̸��� supply price�� ������� �Է¹��� �� pricelist�� �߰����ش�.
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
						//������� �߰��� oil�� ���� �ϳ� �߰����ش�
						a++;
					}
				}
				else if(n == 2)
				{
					//����� printlist�� region�� �Է¹ް�, �� region�� ������ ������ش�
					System.out.print("region number to view : ");
					int k = key.nextInt();
					System.out.println(pl.getRegionInfo(k - 1));
				}
				else if(n == 3)
				{
					//printlist�� ��� ������ ������ش�
					pl.printList();
				}
				else if(n == 4)
				{
					//system�� �����Ų��
					System.out.println("Exit application");
					System.exit(0);
				}
			}
	}
}
