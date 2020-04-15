import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Chef extends Thread {
	//instance variable
	private String name;
	private Kitchen kitchen;
	private ArrayList<Dish> dishes;
	
	//name, dishes를 인자로 받는 생성자
	public Chef(String n, Kitchen k, ArrayList<Dish> d)
	{
		name = n;
		dishes = d;
		kitchen = k;
	}
	
	//Chef Thread가 Running 상태가 되었을 경우 역할을 수행해준다
	public void run()
	{
		try 
		{
			for(int i = 0;i < dishes.size(); i++)
			{
				Dish d = dishes.get(i);
				if(d.getTool().equals("fryingpan"))
					kitchen.useFriedpan();
				else if(d.getTool().equals("pot"))
					kitchen.usePot();
				else if(d.getTool().equals("oven"))
					kitchen.useOven();
				Thread.sleep(d.getTime());
				System.out.println("Table #"+ d.getTableNum() +" / " + d.getName() + " is completed by " + name + ". " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis()));
				if(d.getTool().equals("fryingpan"))
					kitchen.releaseFriedpan();
				else if(d.getTool().equals("pot"))
					kitchen.releasePot();
				else if(d.getTool().equals("oven"))
					kitchen.releaseOven();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
