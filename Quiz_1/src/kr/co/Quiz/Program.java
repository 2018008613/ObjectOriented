package kr.co.Quiz;
import java.util.Scanner;
import kr.co.Quiz.Collection.*;

public class Program {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력 하세요 : ");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		/*
		 * for문을 돌면서 각각의 학생 정보를 입력
		 */
		for(int i=0;i < n;i++)
		{
			sc.nextLine();
			System.out.print("학생 이름을 입력 하세요 : ");
			String name = sc.nextLine();
			System.out.print("국어 성적을 입력 하세요 : ");
			int k = sc.nextInt();
			System.out.print("수학 성적을 입력 하세요 : ");
			int m = sc.nextInt();
			System.out.print("영어 성적을 입력 하세요 : ");
			int e = sc.nextInt();
			s[i] = new Student(name, k, m, e);
		}
		/*
		 * 학번 순으로 정렬
		 */
		Student.makeRank(s);
		/*
		 * 정렬된 학생들의 정보를 출력
		 */
		for(int i=0;i < n;i++)
			System.out.println((i + 1) + ". " + s[i].toString());
	}

}