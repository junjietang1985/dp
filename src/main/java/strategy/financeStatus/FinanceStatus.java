package strategy.financeStatus;

public interface FinanceStatus
{
	public long getNetProfit();
	
	default public long getBudget(long totalBalance){
		return (long) (totalBalance*0.5);
	}
}
