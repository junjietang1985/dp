package factory;

public class PcFactory
{
	public static Pc createPc(String pc)
	{
		try
		{
			String packageName = PcFactory.class.getCanonicalName().split("\\.")[0];
			@SuppressWarnings("unchecked")
			Class<Pc> clazz = (Class<Pc>) Class.forName(packageName + "." + pc);
			return clazz.newInstance();
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
