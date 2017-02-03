package observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import observer.observable.Player;
import observer.observer.Monitor;

public class Test
{
	public static void training(Player p)
	{
		while (p.isAllowedToStay())
		{
			p.updateStatus(p.isHealthy, p.stamina - 10);
			try
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		Monitor monitor = new Monitor();
		Player pires = new Player("pires", monitor);
		Player henry = new Player("henry", monitor);
		Player ozil = new Player("ozil", monitor);
		henry.updateStatus(true, 99);
		pires.updateStatus(true, 75);
		ozil.updateStatus(true, 71);

		Runnable r1 = () -> {
			training(pires);
		};

		Runnable r2 = () -> {
			training(henry);
		};

		Runnable r3 = () -> {
			training(ozil);
		};

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(r1);
		executor.submit(r2);
		executor.submit(r3);
		executor.shutdown();
	}
}
