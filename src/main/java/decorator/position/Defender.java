package decorator.position;

import decorator.AbstractFootballPlayer;
import decorator.Skill;

public class Defender extends AbstractFootballPlayer
{

	@Override
	public int getValue()
	{
		return 10;
	}

	@Override
	public Skill[] getSkills()
	{
		return new Skill[] { Skill.TACKLING };
	}
}
