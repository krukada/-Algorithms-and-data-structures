
public class IntegerSequence implements Comparable<IntegerSequence>{

    private int[] point;
    private int count;

    public IntegerSequence(int[] point){
        this.point = point;
        this.count = -1;

    }


    private static void bubbleSorter(IntegerSequence a) {
        a.count = 0;
        int[] aCopy = a.point.clone();
        for (int i=aCopy.length-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (a.point[j]>aCopy[j+1]) {
                    int m = aCopy[j];
                    aCopy[j] = aCopy[j+1];
                    aCopy[j+1] = m;
                     a.count ++;
                }

            }

        }
    }
    public String toString(){

        StringBuilder builder = new StringBuilder();

        for (int i=0;i<point.length;i++){

            builder.append(point[i] + " ");

        }
       // System.out.print("\ncount this Whole points = "+count+"\n");
        return builder.toString();
    }


    public int compareTo(IntegerSequence obj) {
        if (this.count == -1) {
            bubbleSorter(this);
        }
        if (obj.count == -1) {
            bubbleSorter(obj);
        }

         return  this.count - obj.count;

    }
}
