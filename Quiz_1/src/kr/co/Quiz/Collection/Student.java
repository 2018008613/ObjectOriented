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
	 *이름, 국어, 수학, 영어 성적을 인자로 받고 이 성적의 평균을 구해서 각각의 변수에 할당해주는 생성자
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
	 * bubble sort를 이용해서 학번 순으로 나열해주는 함수
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
	 * 학생의 정보를 String으로 return 해주는 함수
	 */
	public String toString()
	{
		return "이름 : " + name + " 학번 : " + StudentNumber + "\n" + "국어 : " + Grade(Korean) + " 수학 : " + Grade(Math) + " 영어 : " + Grade(English) + "\n" + "평균 : " + Avg;
	}
	/*
	 * 점수를 인자로 받아서 학점을 return 해주는 함수
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