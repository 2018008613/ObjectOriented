
public class Subject {
	private String name;
	private String tutor;
	private String room;
	/*
	 * name , tutor, room 을 모두 할당해주는 생성자
	 */
	public Subject(String n, String t, String r)
	{
		name = n;
		tutor = t;
		room = r;
	}
	/*
	 * name만을 할당해주는 생성자
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
	 * name의 getter
	 */
	public String getName()
	{
		return name;
	}
	/*
	 * tutor의 getter
	 */
	public String getTutor()
	{
		return tutor;
	}
	/*
	 * room의 getter
	 */
	public String getRoom()
	{
		return room;
	}
	/*
	 * tutor의 setter
	 */
	public void setTutor(String t)
	{
		tutor = t;
	}
	/*
	 * room의 setter
	 */
	public void setRoom(String r)
	{
		room = r;
	}
	/*
	 * name을 return
	 */
	public String toString()
	{
		return name;
	}
	/*
	 * subject의 자세한 정보를 string으로 return
	 */
	public String getDetails()
	{
		return "Name : " + name + "\n" + "Tutor : " + tutor + "\n" + "Room : " + room;
	}
}
