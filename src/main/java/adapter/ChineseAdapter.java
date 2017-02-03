package adapter;

import adapter.adaptee.Chinese;


public class ChineseAdapter implements British
{
	private final Chinese chinese;
	public ChineseAdapter(Chinese chinese)
	{
		this.chinese = chinese;
	}

	@Override
	public String getFamilyName()
	{
		return this.chinese.getXing();
	}

	@Override
	public String getFirstName()
	{
		return this.chinese.getMing();
	}

	@Override
	public String getMiddleName()
	{
		return null;
	}

	@Override
	public int getAge()
	{
		return this.chinese.getAge()-1;
	}

}
