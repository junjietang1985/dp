package strategy.type;

public class RandomType implements Type
{

	@Override
	public long getCost(long budget)
	{
		//0%-200%
		return (long) (budget*Math.random()*2);
	}

}
