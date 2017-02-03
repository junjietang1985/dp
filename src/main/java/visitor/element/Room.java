package visitor.element;

import visitor.visitor.Visitor;

public class Room implements Element
{
	private Wolf wolf = new Wolf();
	
	private Cabbage cabbage = new Cabbage();
	
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
		
		cabbage.accept(visitor);
		wolf.accept(visitor);
	}

}
