
public class WordDefinitionPair {
	
	//instance variable
	private String word;
	private String definition;
	
	//word와 definition을 인자로 받는 생성자
	public WordDefinitionPair(String w, String d)
	{
		word = w;
		definition = d;
	}
	
	//word의 getter
	public String getWord()
	{
		return word;
	}
	
	//definition의 getter
	public String getDefinition()
	{
		return definition;
	}
	
	//word의 setter
	public void setWord(String w)
	{
		word = w;
	}
	
	//definition의 setter
	public void setDefinition(String d)
	{
		definition = d;
	}
}
