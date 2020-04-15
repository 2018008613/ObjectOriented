import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program {
	public static void main(String[] args)
	{
		//scanner ����
		Scanner k = new Scanner(System.in);
		//DictionaryArray ����
		DictionaryArray dic = new DictionaryArray();
		while(true)
		{
			//�޴�
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a word to dictionary");
			System.out.println("(2) Show definition of word");
			System.out.println("(3) Show word list");
			System.out.println("(4) Remove word");
			System.out.println("(5) print all contents");
			System.out.println("(6) Exit Program");
			System.out.println("=========================================");
			//� �޴��� �������� �Է�
			int n = k.nextInt();
			String trash = k.nextLine();
			String w;
			String d;
			switch(n)
			{
			//1�� �Է¹޾��� �� word�� definition�� �Է¹��� ��, word�� definition���� insertEntry ����
				case 1:
					System.out.println("word :");
					w = k.nextLine();
					System.out.println("definition :");
					d = k.nextLine();
					try
					{
						dic.insertEntry(w, d);
					}
					catch(AlreadyExistInDicException e)
					{
						System.out.println(e.getMessage());
					}
					break;
			//2�� �Է¹޾��� �� word�� �Է¹ް�, �� �ܾ�� getDefinition ����
				case 2:
					System.out.println("word for searching :");
					w = k.nextLine();
					try
					{
						dic.getDefinition(w);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
			//3�� �Է¹޾��� �� printWords ����
				case 3:
					try
					{
						dic.printWords();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
			//4�� �Է¹޾��� �� word�� �Է¹��� �� �� word�� removeWord ����
				case 4:
					System.out.print("word to remove : ");
					w = k.nextLine();
					try
					{
						dic.removeWord(w);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
			//5�� �Է¹޾��� �� printAll ����
				case 5:
					try
					{
						dic.printAll();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
			//6�� �Է¹޾��� �� ���� �� ������ ������ file�̸��� �Է¹��� �� �� file �ȿ� ������ ���� �� system ����
				case 6:
					System.out.println();
					System.out.println("Enter a file name :");
					String f = k.nextLine();
					PrintWriter o = null;
					try
					{
						o = new PrintWriter(new FileOutputStream(f));
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
						System.exit(0);
					}
					ArrayList<WordDefinitionPair> l = dic.getDicList();
					int cnt = 1;
					for(WordDefinitionPair pa : l)
					{
						o.println(cnt + ". word : " + pa.getWord() + "\ndefinition : " + pa.getDefinition());
						cnt++;
					}
					System.out.println("saved as " + f);
					System.out.println("exit program");
					o.close();
					System.exit(0);
					break;
			//1~6 �̿��� �Է��� �޾��� �� �����޼��� ���
				default:
					System.out.println("Insert 1 ~ 6");
					break;
			}
		}
	}
}
