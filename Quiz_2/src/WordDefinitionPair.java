
public class WordDefinitionPair {
	
	//instance variable
	private String word;
	private String definition;
	
	//word�� definition�� ���ڷ� �޴� ������
	public WordDefinitionPair(String w, String d)
	{
		word = w;
		definition = d;
	}
	
	//word�� getter
	public String getWord()
	{
		return word;
	}
	
	//definition�� getter
	public String getDefinition()
	{
		return definition;
	}
	
	//word�� setter
	public void setWord(String w)
	{
		word = w;
	}
	
	//definition�� setter
	public void setDefinition(String d)
	{
		definition = d;
	}
}
