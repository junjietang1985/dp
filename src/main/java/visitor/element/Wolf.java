package visitor.element;

import visitor.visitor.Visitor;

public class Wolf implements Element
{
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
}
