package visitor.figure;

public interface Visitor {
	
	public void visitCircle (Circle circle);
	public void visitSquare (Square square);
	public void visitTriangle (Triangle triangle);
	public double getResult();

}
