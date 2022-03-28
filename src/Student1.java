
public class Student1 {
	private String name;
	private int age;
	private String gender;
	private int usn;
	private String address;
	private String pincode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
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
