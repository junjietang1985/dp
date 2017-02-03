package strategy.financeStatus;

public class PoorFinanceStatus implements FinanceStatus
{

	@Override
	public long getNetProfit()
	{
		//100%-500% = 1m-5m
		return (long) (1*(1+Math.random()*4));
	}

}
