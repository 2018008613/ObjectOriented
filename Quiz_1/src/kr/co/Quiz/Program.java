package kr.co.Quiz;
import java.util.Scanner;
import kr.co.Quiz.Collection.*;

public class Program {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� ���� �Է� �ϼ��� : ");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		/*
		 * for���� ���鼭 ������ �л� ������ �Է�
		 */
		for(int i=0;i < n;i++)
		{
			sc.nextLine();
			System.out.print("�л� �̸��� �Է� �ϼ��� : ");
			String name = sc.nextLine();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int k = sc.nextInt();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int m = sc.nextInt();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int e = sc.nextInt();
			s[i] = new Student(name, k, m, e);
		}
		/*
		 * �й� ������ ����
		 */
		Student.makeRank(s);
		/*
		 * ���ĵ� �л����� ������ ���
		 */
		for(int i=0;i < n;i++)
			System.out.println((i + 1) + ". " + s[i].toString());
	}

}