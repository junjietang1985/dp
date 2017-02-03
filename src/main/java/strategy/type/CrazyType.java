package strategy.type;

public class CrazyType implements Type
{	
	@Override
	public long getCost(long budget)
	{
		//100*(50%-100%) = 50m-100m
		return (long) (100*(1-Math.random()*0.5));
	}

}
