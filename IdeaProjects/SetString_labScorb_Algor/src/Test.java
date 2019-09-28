import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] str = new String[]{
                new String("ab"),
                new String("oo"),
                new String("kl"),
                new String("ab")

        };
        SetOfString strings = new SetOfString(str);

        for (List i : strings) {
            System.out.println(i);
        }
    }
}
