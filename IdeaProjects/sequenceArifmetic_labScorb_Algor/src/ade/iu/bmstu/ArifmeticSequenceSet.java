package ade.iu.bmstu;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class ArifmeticSequenceSet {

    public ArrayList<ArifmeticSequence> sequenceSet;

    public ArifmeticSequenceSet(ArrayList<ArifmeticSequence> sequenceSet){
        this.sequenceSet = sequenceSet;
    }

    public Stream<ArifmeticSequence> streamSet(){
        return sequenceSet.stream()
                .flatMap(sequence -> sequenceSet.stream()
                        .filter(sequence1 -> sequenceSet
                                .indexOf(sequence) - sequenceSet.indexOf(sequence1) == 1 && sequence.include(sequence1)));
    }

    public Optional<ArifmeticSequence> optionalArifmeticSequence(){
        return sequenceSet.stream()
                .filter(a -> sequenceSet.stream()
                        .filter(b -> a.include(b))
                        .count() == sequenceSet.size()).findAny();
    }
}
