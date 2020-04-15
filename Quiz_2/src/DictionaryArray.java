import java.util.ArrayList;
import java.util.Iterator;

public class DictionaryArray implements Dictionary {
	
	//instance variable
	private ArrayList<WordDefinitionPair> DicList;
	
	//DicList�� �ʱ�ȭ���ִ� ������
	public DictionaryArray()
	{
		DicList = new ArrayList<WordDefinitionPair>();
	}
	
	//Diclist�� getter
	public ArrayList<WordDefinitionPair> getDicList()
	{
		return DicList;
	}
	
	//DicList�� ��������� true ��ȯ, �ƴϸ� false ��ȯ
	public boolean isEmpty()
	{
		return DicList.isEmpty();
	}
	
	//word�� �̹� ������ exception�� throw, �׷��� ������ word�� definition�� ������ �߰�
	public void insertEntry(String word, String definition) throws AlreadyExistInDicException
	{
		int cnt = 0;
		for(WordDefinitionPair p : DicList)
		{
			if(p.getWord().equals(word))
				cnt++;
		}
		if(cnt != 0)
			throw new AlreadyExistInDicException();
		DicList.add(new WordDefinitionPair(word, definition));
	}
	
	//word�� ������ ���ų� ������ ��������� exception throw, �׷��� ������ word�� definition ���
	public void getDefinition(String word) throws EmptyException, NotInDicException
	{
		if(isEmpty())
			throw new EmptyException();
		int cnt = 0;
		for(WordDefinitionPair p : DicList)
		{
			if(p.getWord().equals(word))
			{
				cnt++;
				System.out.println(word + " mean : " + p.getDefinition());
			}
		}
		if(cnt == 0)
			throw new NotInDicException();
	}
	
	//word�� ������ ���ų� ������ ��������� exception throw, �׷��� ������ word�� �������� ����
	public void removeWord(String word) throws EmptyException, NotInDicException
	{
		if(isEmpty())
			throw new EmptyException();
		int cnt = 0;
		Iterator<WordDefinitionPair>it = DicList.iterator();
		while(it.hasNext())
		{
			WordDefinitionPair p = it.next();
			if(word.equals(p.getWord()))
			{
				cnt++;
				it.remove();
			}
		}
		if(cnt == 0)
			throw new NotInDicException();
	}
	
	//������ ��������� exception throw, �׷��� ������ ��� ������ �ܾ���� ���
	public void printWords() throws EmptyException
	{
		if(isEmpty())
			throw new EmptyException();
		for(WordDefinitionPair p : DicList)
		{
			System.out.println((DicList.indexOf(p) + 1) + ". " + p.getWord());
		}
	}
	
	//������ ��������� exception throw, �׷��� ������ ������ ��� word�� definition�� ���
	public void printAll() throws EmptyException
	{
		if(isEmpty())
			throw new EmptyException();
		for(WordDefinitionPair p : DicList)
		{
			System.out.println("******************************************");
			System.out.println("Word : " + p.getWord() + "\nDefinition : " + p.getDefinition());
		}
	}
}
