package adapter.adaptee;

public class Chinese
{
	private String xing;
	private String ming;
	private int age;	
	
	public Chinese(String xing, String ming, int age)
	{
		super();
		this.xing = xing;
		this.ming = ming;
		this.age = age;
	}
	public String getXing()
	{
		return xing;
	}
	public String getMing()
	{
		return ming;
	}
	public int getAge()
	{
		return age;
	}	
	
}
