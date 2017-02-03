package strategy.club;

import strategy.financeStatus.RichFinanceStatus;
import strategy.type.CrazyType;

public class Chelsea extends Club
{
	public Chelsea()
	{
		this.financeStatus = new RichFinanceStatus();
		this.type = new CrazyType();
	}

}
