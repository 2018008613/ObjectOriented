import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();
		String[] line_arr = line.split(" ");
		int num = line_arr.length - 1;
		System.out.println("Name Length(Korean) : " + num);
		String na = "";
		for(int i=1;i<num;i++)
		{
			na = na + line_arr[i].substring(0,1).toUpperCase() + ".";
		}
		na = na + line_arr[0].substring(0,1).toUpperCase() + line_arr[0].substring(1).toLowerCase();
		String hw = line_arr[num].replace("ppt","pdf");
		hw = hw.substring(0,1).toUpperCase() + hw.substring(1).toLowerCase();
		System.out.println(na + " submitted " + hw);
	}

}
