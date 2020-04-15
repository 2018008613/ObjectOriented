import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program {
	public static void main(String[] args)
	{
		//scanner 생성
		Scanner k = new Scanner(System.in);
		//DictionaryArray 생성
		DictionaryArray dic = new DictionaryArray();
		while(true)
		{
			//메뉴
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a word to dictionary");
			System.out.println("(2) Show definition of word");
			System.out.println("(3) Show word list");
			System.out.println("(4) Remove word");
			System.out.println("(5) print all contents");
			System.out.println("(6) Exit Program");
			System.out.println("=========================================");
			//어떤 메뉴를 실행할지 입력
			int n = k.nextInt();
			String trash = k.nextLine();
			String w;
			String d;
			switch(n)
			{
			//1을 입력받았을 때 word와 definition을 입력받은 뒤, word와 definition으로 insertEntry 실행
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
			//2를 입력받았을 때 word를 입력받고, 그 단어로 getDefinition 실행
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
			//3을 입력받았을 때 printWords 실행
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
			//4를 입력받았을 때 word를 입력받은 뒤 그 word로 removeWord 실행
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
			//5를 입력받았을 때 printAll 실행
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
			//6을 입력받았을 때 사전 속 정보를 저장할 file이름을 입력받은 뒤 그 file 안에 정보를 저장 후 system 종료
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
			//1~6 이외의 입력을 받았을 때 오류메세지 출력
				default:
					System.out.println("Insert 1 ~ 6");
					break;
			}
		}
	}
}
