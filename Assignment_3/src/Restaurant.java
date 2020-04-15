import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Restaurant {
	static TableSet tbset;
	static ArrayList<Dish> dishes_lee;
	static ArrayList<Dish> dishes_kang;
	
	public static void main(String[] args) throws InterruptedException {
		tbset = new TableSet();
		//데이터를 불러와서 이 데이터들을 tbset에 넣어준다.
		Scanner ips = null;
		try
		{
			ips = new Scanner(new FileInputStream("OrderSheet.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.exit(0);
		}
		String tra = ips.next();
		for(int i = 0;i < 5; i++)
		{
			int n;
			String s = ips.next();
			n = Integer.parseInt(s.substring(1));
			while(ips.hasNext())
			{
				String s1 = ips.next();
				if(s1.equals("Table"))
					break;
				tbset.addtoTable(i, n, s1);
			}
		}
		ips.close();
		
		dishes_lee = new ArrayList<Dish>();
		dishes_kang = new ArrayList<Dish>();
		Kitchen kitchen = new Kitchen();
		//tbset 안의 데이터를 dishes_lee와 dishes_kang에 나누어 넣어준다
		Table[] t = tbset.getTableSet();
		for(int i = 0;i < 5;i++)
		{
			if(i % 2 == 0)
			{
				ArrayList<Dish> d1 = t[i].getDishSet();
				for(int j = 0;j < d1.size(); j++)
				{
					dishes_lee.add(d1.get(j));
				}
			}
			else if(i % 2 == 1)
			{
				ArrayList<Dish> d1 = t[i].getDishSet();
				for(int j = 0;j < d1.size(); j++)
				{
					dishes_kang.add(d1.get(j));
				}
			}
		}
		
		Chef lee = new Chef("Lee", kitchen, dishes_lee);
		Chef kang = new Chef("Kang", kitchen, dishes_kang);
		lee.start();
		kang.start();
	}
}
