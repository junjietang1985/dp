package decorator;

import decorator.decorator.Centre;
import decorator.decorator.Side;
import decorator.position.Defender;
import decorator.position.Forward;
import decorator.position.Midfielder;

public class Test
{

	public static void main(String[] args)
	{
		AbstractFootballPlayer cb = new Centre(new Defender());
		cb.print();		
		AbstractFootballPlayer lb= new Side(new Defender());
		lb.print();
		
		AbstractFootballPlayer cm = new Centre(new Midfielder());
		cm.print();		
		AbstractFootballPlayer lm= new Side(new Midfielder());
		lm.print();
		
		AbstractFootballPlayer cf = new Centre(new Forward());
		cf.print();		
		AbstractFootballPlayer lf= new Side(new Forward());
		lf.print();
	}

}
