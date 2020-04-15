import java.util.ArrayList;
import java.util.Iterator;

public class DictionaryArray implements Dictionary {
	
	//instance variable
	private ArrayList<WordDefinitionPair> DicList;
	
	//DicList를 초기화해주는 생성자
	public DictionaryArray()
	{
		DicList = new ArrayList<WordDefinitionPair>();
	}
	
	//Diclist의 getter
	public ArrayList<WordDefinitionPair> getDicList()
	{
		return DicList;
	}
	
	//DicList가 비어있으면 true 반환, 아니면 false 반환
	public boolean isEmpty()
	{
		return DicList.isEmpty();
	}
	
	//word가 이미 있으면 exception을 throw, 그렇지 않으면 word와 definition을 사전에 추가
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
	
	//word가 사전에 없거나 사전이 비어있으면 exception throw, 그렇지 않으면 word의 definition 출력
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
	
	//word가 사전에 없거나 사전이 비어있으면 exception throw, 그렇지 않으면 word를 사전에서 제거
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
	
	//사전이 비어있으면 exception throw, 그렇지 않으면 모든 사전의 단어들을 출력
	public void printWords() throws EmptyException
	{
		if(isEmpty())
			throw new EmptyException();
		for(WordDefinitionPair p : DicList)
		{
			System.out.println((DicList.indexOf(p) + 1) + ". " + p.getWord());
		}
	}
	
	//사전이 비어있으면 exception throw, 그렇지 않으면 사전의 모든 word와 definition을 출력
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
