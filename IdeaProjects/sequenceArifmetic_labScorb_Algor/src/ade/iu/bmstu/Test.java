package ade.iu.bmstu;


import java.util.ArrayList;
        import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        ArrayList<ArifmeticSequence> arifmeticSequences = new ArrayList<>();
        arifmeticSequences.add(new ArifmeticSequence(1, 8));
        arifmeticSequences.add(new ArifmeticSequence(1, 6));
        arifmeticSequences.add(new ArifmeticSequence(1, 4));
        arifmeticSequences.add(new ArifmeticSequence(1, 2));

        ArifmeticSequenceSet arifmeticSequenceSet = new ArifmeticSequenceSet(arifmeticSequences);
        arifmeticSequenceSet.streamSet()
                .collect(Collectors.groupingBy(ArifmeticSequence::getGroup))
                .forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.print("Optional:");
        arifmeticSequenceSet.optionalArifmeticSequence().ifPresent(System.out::println);
    }
}