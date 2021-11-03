
public class ObjectClone1 implements Cloneable {
	
	int rollno;
	String name;
	
	public ObjectClone1(int rollno,String name) {
		
		this.rollno=rollno;
		this.name=name;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args) {
		
		try
		{
			ObjectClone1 s1=new ObjectClone1(100, "amit");
			
			ObjectClone1 s2=(ObjectClone1)s1.clone();
			
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
		}
		catch (CloneNotSupportedException c) {
			// TODO: handle exception
		}

	}

}
