package bishi0806kedaxunfei;

public class question2 {
    public static void main(String[] args) {

    }
    public static long getArea (Point p1, Point p2, Point p3, Point p4) {
        // write code here
        Point point1 = new Point(p2.x - p1.x, p2.y - p1.y);
        Point point2 = new Point(p3.x - p3.y, p3.y - p1.y);
        long area1 = Math.abs(point1.x * point2.y - point1.y * point2.x);

        Point point3 = new Point(p4.x - p1.x, p4.y - p1.y);
        long area2 = Math.abs(point3.x * point2.y - point3.y * point2.x);

        return (area1 + area2) / 2;
    }
}
class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
