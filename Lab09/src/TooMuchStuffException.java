
public class TooMuchStuffException extends Exception {
	 private int inputNum;
	 
	 //super class�� ���ڷ� Too much stuff!�� �Ѱ��ִ� ������
	 public TooMuchStuffException()
	 {
		 super("Too much stuff!");
	 }
	 //super class�� ���ڷ� Too much stuff!�� �Ѱ��ְ� ���ڷ� n�� �޾� inputNum�� �־��ִ� ������
	 public TooMuchStuffException(int n)
	 {
		 super("Too much stuff!");
		 inputNum = n;
	 }
	 //inputNum�� getter
	 public int getInputNum()
	 {
		 return inputNum;
	 }
}
