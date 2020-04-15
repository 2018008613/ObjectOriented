public class Lab04 {
	public static void main(String[] args)
	{
		City c1 = new City("Seoul", 23, 45);
		System.out.println(c1.toString());
		City c2 = new City("Paris", 123, 41);
		System.out.println(c2.toString());
		City c3 = new City("Racoon City");
		System.out.println(c3.toString());
		City c4 = new City("Mega City");
		System.out.println(c4.toString());
		System.out.printf("Seoul-Paris : %.14f%n", City.getDistance(c1, c2));
		System.out.printf("Seoul-Racoon City : %.13f%n", City.getDistance(c1, c3));
		System.out.printf("Paris-Mega City : %.13f%n", City.getDistance(c2, c4));
	}
}

