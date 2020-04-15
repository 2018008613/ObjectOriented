
public class Subject {
	private String name;
	private String tutor;
	private String room;
	/*
	 * name , tutor, room �� ��� �Ҵ����ִ� ������
	 */
	public Subject(String n, String t, String r)
	{
		name = n;
		tutor = t;
		room = r;
	}
	/*
	 * name���� �Ҵ����ִ� ������
	 */
	public Subject(String n)
	{
		name = n;
	}
	/*
	 * copy constructor
	 */
	public Subject(Subject s)
	{
		this.name = s.name;
		this.tutor = s.tutor;
		this.room = s.room;
	}
	/*
	 * name�� getter
	 */
	public String getName()
	{
		return name;
	}
	/*
	 * tutor�� getter
	 */
	public String getTutor()
	{
		return tutor;
	}
	/*
	 * room�� getter
	 */
	public String getRoom()
	{
		return room;
	}
	/*
	 * tutor�� setter
	 */
	public void setTutor(String t)
	{
		tutor = t;
	}
	/*
	 * room�� setter
	 */
	public void setRoom(String r)
	{
		room = r;
	}
	/*
	 * name�� return
	 */
	public String toString()
	{
		return name;
	}
	/*
	 * subject�� �ڼ��� ������ string���� return
	 */
	public String getDetails()
	{
		return "Name : " + name + "\n" + "Tutor : " + tutor + "\n" + "Room : " + room;
	}
}
