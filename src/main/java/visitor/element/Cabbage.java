package visitor.element;

import visitor.visitor.Visitor;

public class Cabbage implements Element
{
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

}
