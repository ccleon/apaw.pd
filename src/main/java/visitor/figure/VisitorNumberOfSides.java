package visitor.figure;

public class VisitorNumberOfSides implements Visitor{
	private double result = 0;

	@Override
	public void visitCircle(Circle circle) {
		result += Double.POSITIVE_INFINITY;
	}
	
	@Override
	public void visitSquare(Square s) {
		result += 4;
	}
	
	@Override
	public void visitTriangle(Triangle triangle) {
		result += 3;
	}

	@Override
	public double getResult() {
		return this.result;
	}
}
