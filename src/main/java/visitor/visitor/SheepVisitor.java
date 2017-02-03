package visitor.visitor;

import visitor.element.Cabbage;
import visitor.element.Room;
import visitor.element.Wolf;

public class SheepVisitor implements Visitor
{

	@Override
	public void visit(Wolf wolf)
	{
		System.out.println("wolf -> sheep");

	}

	@Override
	public void visit(Cabbage cabbage)
	{
		System.out.println("sheep -> cabbage");
	}

	@Override
	public void visit(Room room)
	{
		System.out.println("The sheep entered the room");
	}

}
