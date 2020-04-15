package kr.co.Quiz.Collection;

import java.util.Random;

public class Student {
	private String name;
	private int StudentNumber;
	private int Korean;
	private int Math;
	private int English;
	private double Avg;
	/*
	 *�̸�, ����, ����, ���� ������ ���ڷ� �ް� �� ������ ����� ���ؼ� ������ ������ �Ҵ����ִ� ������
	 */
	public Student(String n, int k, int m, int e)
	{
		Random rnd = new Random();
		int num = rnd.nextInt(10000) + 2018000000;
		this.StudentNumber = num;
		name = n;
		Korean = k;
		Math = m;
		English = e;
		double d = k + m + e;
		Avg = d / 3;
	}
	/*
	 * Copy Constructor
	 */
	public Student(Student s)
	{
		this.name = s.name;
		this.StudentNumber = s.StudentNumber;
		this.Korean = s.Korean;
		this.Math = s.Math;
		this.English = s.English;
		this.Avg = s.Avg;
	}
	/*
	 * bubble sort�� �̿��ؼ� �й� ������ �������ִ� �Լ�
	 */
	public static void makeRank(Student[] s)
	{
		int n=s.length;
		for(int i = n - 1;i > 0;i--)
		{
			for(int j = 0;j < i;j++)
			{
				if(s[j].StudentNumber > s[j+1].StudentNumber)
				{
					Student tmp = s[j+1];
					s[j+1] = s[j];
					s[j] = tmp;
				}
			}
		}
	}
	/*
	 * �л��� ������ String���� return ���ִ� �Լ�
	 */
	public String toString()
	{
		return "�̸� : " + name + " �й� : " + StudentNumber + "\n" + "���� : " + Grade(Korean) + " ���� : " + Grade(Math) + " ���� : " + Grade(English) + "\n" + "��� : " + Avg;
	}
	/*
	 * ������ ���ڷ� �޾Ƽ� ������ return ���ִ� �Լ�
	 */
	public String Grade(int n)
	{
		if(n >= 90)
			return "A";
		else if(n >= 80)
			return "B";
		else if(n >= 70)
			return "C";
		else if(n >= 60)
			return "D";
		else
			return "F";
	}
}