package observer.observer;

import observer.observable.Observable;
import observer.observable.Player;

public class Monitor implements Observer
{
	@Override
	public void update(Observable observable)
	{
		if (observable instanceof Player)
		{
			Player player = (Player) observable;
			System.out.println(player);
		}
	}

}
