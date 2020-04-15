
public class TooMuchStuffException extends Exception {
	 private int inputNum;
	 
	 //super class의 인자로 Too much stuff!를 넘겨주는 생성자
	 public TooMuchStuffException()
	 {
		 super("Too much stuff!");
	 }
	 //super class의 인자로 Too much stuff!를 넘겨주고 인자로 n을 받아 inputNum에 넣어주는 생성자
	 public TooMuchStuffException(int n)
	 {
		 super("Too much stuff!");
		 inputNum = n;
	 }
	 //inputNum의 getter
	 public int getInputNum()
	 {
		 return inputNum;
	 }
}
