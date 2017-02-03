package strategy.club;

import strategy.financeStatus.FinanceStatus;
import strategy.type.Type;

public abstract class Club
{
	Type type;

	FinanceStatus financeStatus;

	long totalBalance;
	long budget;
	long cost;
	long profit;

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	public FinanceStatus getFinanceStatus()
	{
		return financeStatus;
	}

	public void setFinanceStatus(FinanceStatus financeStatus)
	{
		this.financeStatus = financeStatus;
	}

	public long getTotalBalance()
	{
		return totalBalance;
	}

	public void setTotalBalance(long totalBalance)
	{
		this.totalBalance = totalBalance;
	}

	public long getBudget()
	{
		return budget;
	}

	public void setBudget(long budget)
	{
		this.budget = budget;
	}

	public long getCost()
	{
		return cost;
	}

	public void setCost(long cost)
	{
		this.cost = cost;
	}

	public long getProfit()
	{
		return profit;
	}

	public void setProfit(long profit)
	{
		this.profit = profit;
	}

	public long computeBudget(long totalBalance)
	{
		this.setBudget(this.financeStatus.getBudget(totalBalance));
		return this.getBudget();
	}

	public long computeCost()
	{
		this.setCost(this.type.getCost(this.computeBudget(totalBalance)));
		return this.getCost();
	}

	public long computeNetProfit()
	{
		this.setProfit(this.financeStatus.getNetProfit());
		return this.getProfit();
	}
	
	public String getClubInfo(){
		return "Finance Status:\t"+this.getFinanceStatus().getClass().getSimpleName()+"\tType:\t"+ this.getType().getClass().getSimpleName();
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " : \tbalance:" + this.getTotalBalance() + "\tprofit:" + this.getProfit() + "\tbudget:"
				+ this.getBudget() + "\tcost:" + this.getCost();
	}

}
