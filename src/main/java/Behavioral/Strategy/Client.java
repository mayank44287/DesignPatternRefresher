package Behavioral.Strategy;

public class Client {
    public static void main(String[] args) {
        ShapeSorterContext context = new ShapeSorterContext(new AreaSorter());
        List<Shape> shapes = ...; // List of shapes

        List<Shape> sortedShapes = context.sortShapes(shapes);

        context.setSorter(new PerimeterSorter());
        sortedShapes = context.sortShapes(shapes); // Sort again using perimeter
    }
}

/***
 * ShapeSorter defines the sorting behavior.
 * AreaSorter and PerimeterSorter implement the interface with specific sorting logic.
 * ShapeSorterContext holds a reference to a ShapeSorter and delegates sorting calls to it.
 * The client can change the sorting strategy (AreaSorter to PerimeterSorter) at runtime.
 *  Points to consider:
 *
 * Choose the Strategy pattern when you need to change algorithms frequently or have well-defined algorithms for specific tasks.
 * Overusing strategies can increase complexity and overhead.
 * Carefully consider the cost of creating and managing multiple strategy objects.
 */