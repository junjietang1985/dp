package visitor.element;

import visitor.visitor.Visitor;

public interface Element
{
	public void accept(Visitor visitor);
}
