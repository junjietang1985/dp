package strategy;

import strategy.club.Arsenal;
import strategy.club.Chelsea;
import strategy.club.Club;
import strategy.club.Spur;

public class Test
{
	private static void updateBalance(Club club)
	{
		long profit = club.computeNetProfit();
		long cost = club.computeCost();
		club.setTotalBalance(club.getTotalBalance() + profit - cost);
		System.out.println(club);
	}

	public static void main(String[] args)
	{
		Arsenal arsenal = new Arsenal();
		Chelsea chelsea = new Chelsea();
		Spur spur = new Spur();
		System.out.println(arsenal.getClubInfo());
		for (int i = 0; i < 10; i++)
		{
			updateBalance(arsenal);
		}
		System.out.println("---------------------");
		System.out.println(chelsea.getClubInfo());
		for (int i = 0; i < 10; i++)
		{
			updateBalance(chelsea);
		}
		System.out.println("---------------------");
		System.out.println(spur.getClubInfo());
		for (int i = 0; i < 10; i++)
		{
			updateBalance(spur);
		}
	}

}
