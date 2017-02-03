package strategy.financeStatus;

public class MediumFinanceStatus implements FinanceStatus
{
	@Override
	public long getNetProfit()
	{
		//100%-500% = 5m-15m
		return (long) (5*(1+Math.random()*2));
	}

}
