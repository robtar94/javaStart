package pakiety.app;

import pakiety.data.Point;
import pakiety.controller.PointController;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point();
        p2.setX(7);
        p2.setY(8);
        PointController pc = new PointController();
        System.out.println("Wspolrzedne punktu X " + p1.getX() + " y: " + p1.getY());

        pc.addX(p1); // dodanie x + 1

        System.out.println("Punkt addX  X: " + p1.getX() + " y: " + p1.getY());

        pc.addY(p1);

        System.out.println("Punkt addY: " + p1.getX() + " " + p1.getY());

        pc.minusX(p1);

        System.out.println("Punkt minusX: " + p1.getX() + " " + p1.getY());

        pc.minusY(p1);

        System.out.println("Punkt minusY: " + p1.getX() + " " + p1.getY());

        System.out.println("Punkt 2");
        System.out.println("Oś X: " + p2.getX() + " Oś Y " + p2.getY());

        pc.addX(p2);
        pc.addY(p2);

        System.out.println("Punkt 2 x+1 i y+1");
        System.out.println("Oś X: " + p2.getX() + " Oś Y " + p2.getY());

        pc.minusX(p2);
        pc.minusX(p2);
        pc.minusY(p2);
        pc.minusY(p2);
        System.out.println("Punkt 2 x - 2 i y - 2");
        System.out.println("Oś X: " + p2.getX() + " Oś Y " + p2.getY());


    }


}
