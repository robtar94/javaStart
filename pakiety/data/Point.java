package pakiety.data;

public class Point {
    private int x;
     private int y;

     //konstruktor domyslny
     public Point() {

     }

     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }
     //getters
     public int getX () {
         return x;
     }

     public int getY () {
         return y;
     }
//setters
     public void setY (int y) {
         this.y = y;
     }
     public void setX (int x) {
         this.x = x;
     }

}
