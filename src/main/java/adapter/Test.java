package adapter;

import adapter.adaptee.Chinese;

public class Test
{

	public static void main(String[] args)
	{
		Chinese jacky = new Chinese("chen", "long", 60);
		System.out.println("xing:"+jacky.getXing());
		System.out.println("ming:"+jacky.getMing());
		System.out.println("age:"+jacky.getAge());
		
		British jackyB = new ChineseAdapter(jacky);
		System.out.println("family name:"+jackyB.getFamilyName());
		System.out.println("first name:"+jackyB.getFirstName());
		System.out.println("middle name:"+jackyB.getMiddleName());
		System.out.println("age:"+jackyB.getAge());
	}

}
