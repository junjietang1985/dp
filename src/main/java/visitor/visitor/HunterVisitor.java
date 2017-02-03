package visitor.visitor;

import visitor.element.Cabbage;
import visitor.element.Room;
import visitor.element.Wolf;

public class HunterVisitor implements Visitor
{

	@Override
	public void visit(Wolf wolf)
	{
		System.out.println("hunter -> wolf");

	}

	@Override
	public void visit(Cabbage cabbage)
	{
		System.out.println("hunter -> cabbage");
	}

	@Override
	public void visit(Room room)
	{
		System.out.println("The hunter entered the room");
	}

}
