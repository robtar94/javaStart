package pakiety.controller;
import pakiety.data.Point;

public class PointController {
    public void addX(Point p) {
        p.setX(p.getX() + 1);
    }

    public void addY(Point p) {
        p.setY(p.getY() + 1);
    }
    public void minusX (Point p) {
        p.setX(p.getX() - 1);
    }

    public void minusY(Point p) {
        p.setY(p.getY() - 1);
    }
}
