package factory;

public class Test
{

	public static void main(String[] args)
	{
		Pc apple = PcFactory.createPc("ApplePc");
		Pc windows = PcFactory.createPc("WindowsPc");
		
		apple.display();
		windows.display();
	}

}
