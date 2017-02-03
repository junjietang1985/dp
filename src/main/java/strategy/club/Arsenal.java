package strategy.club;

import strategy.financeStatus.PoorFinanceStatus;
import strategy.type.SaveType;

public class Arsenal extends Club
{
	public Arsenal()
	{
		this.financeStatus = new PoorFinanceStatus();
		this.type = new SaveType();
	}
}
