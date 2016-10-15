package visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        Visitor visitor =  new VisitorArea();
        for (Figure figure : figures) {
            figure.accept(visitor);
        }
        return visitor.getResult();
    }

    public double totalNumberOfSides() {
    	Visitor visitor =  new VisitorNumberOfSides();
        for (Figure figure : figures) {
        	figure.accept(visitor);
        }
        return visitor.getResult();
    }

}
