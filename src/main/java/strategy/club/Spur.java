package strategy.club;

import strategy.financeStatus.MediumFinanceStatus;
import strategy.type.RandomType;

public class Spur extends Club
{
	public Spur()
	{
		this.financeStatus = new MediumFinanceStatus();
		this.type = new RandomType();
	}
}
