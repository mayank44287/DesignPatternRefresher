package Behavioral.Strategy;

public class AreaSorter implements ShapeSorter {
    @Override
    public List<Shape> sortShapes(List<Shape> shapes) {
        return shapes.stream()
                .sorted(Comparator.comparing(Shape::getPerimeter))
                .collect(Collectors.toList());
    }
}
