package decorator.position;

import decorator.AbstractFootballPlayer;
import decorator.Skill;

public class Midfielder extends AbstractFootballPlayer
{

	@Override
	public int getValue()
	{
		return 20;
	}

	@Override
	public Skill[] getSkills()
	{
		return new Skill[] { Skill.PASSING };
	}
}
