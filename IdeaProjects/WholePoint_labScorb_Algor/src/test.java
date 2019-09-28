import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[] point1 = new int[]{1,2,3,8,2};
        int[] point2 = new int[]{1,2,4,6,9};
        int[] point3 = new int[]{20,10,2,8};
        int[] point4 = new int[]{44,3};
        IntegerSequence[] points = new IntegerSequence[4];
        points[0] = new IntegerSequence(point1);
        points[1] = new IntegerSequence(point2);
        points[2] = new IntegerSequence(point3);
        points[3] = new IntegerSequence(point4);
        Arrays.sort(points);
        for (IntegerSequence s : points) System.out.println(s);
    }
}
