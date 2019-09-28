
public class MaterialPoints {

    private Point[] pa;

    public MaterialPoints(Point[] a)
    {
        pa = new Point[a.length];
        for (int i=0;i<a.length;i++) {
            pa[i] = a[i];
        }
    }

    public double centerOfMassX(){
        double xMas, mas;
        xMas = 0;
        mas = 0;
        for (int i=0;i<pa.length;i++){

            xMas+=  pa[i].x * pa[i].m;
            mas +=  pa[i].m;
        }
        return  xMas/mas;
    }
    public double centerOfMassY(){
        double yMas, mas;
        yMas = 0;
        mas = 0;

        for (int i=0;i<pa.length;i++){
            yMas +=  pa[i].y * pa[i].m;
            mas +=  pa[i].m;

        }
        return   yMas/mas;
    }
}
