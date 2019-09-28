

public class Test {

    public static void main(String[] args){
       Point[] pa = new Point[4];
       pa[0] = new Point(1,-8.7,5);
       pa[1] = new Point(2,-6.9,6);
       pa[2] = new Point(6,1.2,20);
       pa[3] = new Point(6.4,-7.2,45);

       MaterialPoints ma = new MaterialPoints(pa);

       System.out.println(pa[0]);
       System.out.println(pa[1]);
       System.out.println(pa[2]);
       System.out.println(pa[3]);

       System.out.println(ma.centerOfMassX());
       System.out.println(ma.centerOfMassY());


    }

}
