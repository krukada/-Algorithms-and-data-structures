
public class Point {

    public double x, y, m;

    public Point(double x, double y, double m){
        this.x = x;
        this.y = y;
        this.m = m;

    }

    public String toString() {
        if (m > 0) {

            return "(x = " + x + ", y = " + y + ", m = " + m + ")";
        } else {
            throw new RuntimeException("Ошибка! Значение массы в этой материальной точке отрицательно!");
        }
    }


}
