package strategy.type;

public class SaveType implements Type
{

	@Override
	public long getCost(long budget)
	{
		//0%-10%
		return (long) (budget*Math.random()*0.1);
	}

}
