package visitor.figure;

public class VisitorArea implements Visitor{
	private double result = 0;

	@Override
	public void visitCircle (Circle circle) {
		result += Math.PI * circle.getRadius() * circle.getRadius();
	}

	@Override
	public void visitSquare(Square square) {
		result += square.getSide() * square.getSide();
	}
	
	@Override
	public void visitTriangle(Triangle triangle) {
		result += triangle.getBase() * triangle.getHeight() * 0.5;
	}
	
	@Override
	public double getResult() {
		return this.result;
	}

}
