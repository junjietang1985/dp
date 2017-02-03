package decorator.position;

import decorator.AbstractFootballPlayer;
import decorator.Skill;

public class Forward extends AbstractFootballPlayer
{

	@Override
	public int getValue()
	{
		return 30;
	}

	@Override
	public Skill[] getSkills()
	{
		return new Skill[] { Skill.FINISHING };
	}
}
