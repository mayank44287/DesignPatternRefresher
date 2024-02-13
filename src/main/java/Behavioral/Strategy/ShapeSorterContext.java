package Behavioral.Strategy;

public class ShapeSorterContext {
    private ShapeSorter sorter;

    public ShapeSorterContext(ShapeSorter sorter) {
        this.sorter = sorter;
    }

    public void setSorter(ShapeSorter sorter) {
        this.sorter = sorter;
    }

    public List<Shape> sortShapes(List<Shape> shapes) {
        return sorter.sortShapes(shapes);
    }
}
