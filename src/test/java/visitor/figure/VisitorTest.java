package visitor.figure;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
	
	private FiguresManager figureManager;

    @Before
    public void ini() {
    	figureManager = new FiguresManager();
        figureManager.add(new Square("Square", 2));
        figureManager.add(new Triangle("Triangle", 3, 2));
    }

    @Test
    public void testArea() {
    	figureManager.add(new Circle("Circle", 3));
        assertEquals(figureManager.totalArea(), 35.2743388, 10e-5);
    }

    @Test
    public void testNumberOfSides() {
    	assertEquals(figureManager.totalNumberOfSides(), 7, 10e-5);
    }
}
