package observer.observable;

import observer.observer.Observer;

public class Player implements Observable
{
	public final String name;

	public boolean isHealthy = true;

	public int stamina = 100;

	public Observer observer;

	public Player(String name, Observer o)
	{
		this.name = name;
		this.addObserver(o);
	}

	@Override
	public void addObserver(Observer o)
	{
		this.observer = o;
	}

	@Override
	public void removeObserver(Observer o)
	{
		this.observer = null;
	}

	@Override
	public void pushNotification()
	{
		this.observer.update(this);
	}

	public void updateStatus(boolean isHealthy, int stamina)
	{
		this.isHealthy = isHealthy;
		this.stamina = stamina;
		pushNotification();
	}

	public boolean isAllowedToStay()
	{
		return this.isHealthy && this.stamina >= 60;
	}

	@Override
	public String toString()
	{
		return "name: " + this.name + " isHealthy: " + this.isHealthy + " stamina: " + this.stamina + " isAllowedToStay: " + this.isAllowedToStay();
	}
}
