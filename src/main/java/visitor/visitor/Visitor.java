package visitor.visitor;

import visitor.element.Cabbage;
import visitor.element.Room;
import visitor.element.Wolf;

public interface Visitor
{
	void visit(Wolf wolf);
	void visit(Cabbage cabbage);
	void visit(Room room);
}
