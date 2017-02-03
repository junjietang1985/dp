package visitor;

import visitor.element.Room;
import visitor.visitor.HunterVisitor;
import visitor.visitor.SheepVisitor;
import visitor.visitor.Visitor;

public class Test
{

	public static void main(String[] args)
	{
		Room room = new Room();
		
		Visitor sheep = new SheepVisitor();
		room.accept(sheep);
		
		Visitor hunter = new HunterVisitor();
		room.accept(hunter);		
	}

}
