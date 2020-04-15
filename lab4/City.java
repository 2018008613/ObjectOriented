import java.util.Random;

public class City {
	private String name;
	private int location_x;
	private int location_y;
	public City(String n, int x, int y)
	{
		name = n;
		location_x = x;
		location_y = y;
	}
	public City(String n)
	{
		name = n;
		Random rnd = new Random();
		location_x =  rnd.nextInt(360);
		location_y =  rnd.nextInt(360);
	}
	public String getName()
	{
		return name;
	}
	public int getX()
	{
		return location_x;
	}
	public int getY()
	{
		return location_y;
	}
	public boolean equals(City c)
	{
		if(c.getName() == this.name && c.getX() == this.location_x && c.getY() == this.location_y)
			return true;
		return false;
	}
	public String toString()
	{
		return name +  ", " + Integer.toString(location_x) + ", " + Integer.toString(location_y);
	}
	public static double getDistance(City c1, City c2)
	{
		return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
	}
}
