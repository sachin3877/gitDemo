
public class Student1 {
	private String name;
	private int age;
	private String gender;
	private int usn;
	public void setData(String m,int n,String o,int p)
	{
		name= m;
		if(n>0)
		{
			age=n;
		}
		else
		{
			System.out.println("invalid output");
		}
		if(o=="male"||o=="female"||o=="others")
		{
		gender=o;	
		}
		else
		{
			System.out.println("invalid age");
		}
		usn=p;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public int getUsn()
	{
		return usn;
	}

}
