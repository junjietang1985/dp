package factory;

public interface Pc
{
	public String getOsName();

	default public void display()
	{
		System.out.println(this.getClass().getSimpleName() + " is using " + this.getOsName());
	}
}
