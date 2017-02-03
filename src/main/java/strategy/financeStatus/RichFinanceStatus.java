package strategy.financeStatus;

public class RichFinanceStatus implements FinanceStatus
{

	@Override
	public long getNetProfit()
	{
		//80%-100% = 16m-20m
		return (long) (20*(1-Math.random()*0.2));
	}

}
