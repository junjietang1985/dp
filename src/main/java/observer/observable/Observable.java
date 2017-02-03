package observer.observable;

import observer.observer.Observer;

public interface Observable
{
	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void pushNotification();
}
