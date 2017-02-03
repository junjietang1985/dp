package decorator;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class AbstractFootballPlayer implements FootballPlayer
{
	@Override
	public String getPosition()
	{
		return "I'm a " + this.getClass().getSimpleName();
	}

	@Override
	public String getDescription()
	{
		return this.getPosition() + "\nMy value is " + this.getValue() + ".\nMy skills: "
				+ Arrays.asList(this.getSkills()).stream().map(Skill::toString).collect(Collectors.joining(","));
	}
	@Override
	public void print()
	{
		System.out.println(this.getDescription());
	}

	abstract public int getValue();

	abstract public Skill[] getSkills();

}
