package decorator.decorator;

import org.apache.commons.lang3.ArrayUtils;

import decorator.AbstractFootballPlayer;
import decorator.Skill;

public class Side extends AbstractFootballPlayer
{
	private final AbstractFootballPlayer player;
	
	public Side(AbstractFootballPlayer player)
	{
		this.player = player;
	}

	@Override
	public int getValue()
	{
		return this.player.getValue()+5;
	}

	@Override
	public Skill[] getSkills()
	{
		return ArrayUtils.add(this.player.getSkills(), Skill.DRIBBLING);
	}
	
	@Override
	public String getPosition()
	{
		return this.player.getPosition() + "+" +this.getClass().getSimpleName();
	}

}