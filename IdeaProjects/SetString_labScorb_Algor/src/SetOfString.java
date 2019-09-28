
import java.util.*;


import java.util.Iterator;

public class SetOfString implements Iterable<List> {
    private String[] str;

    public SetOfString(String[] str){
        this.str = str;

    }
    public Iterator<List> iterator(){
        return new StringIterator();
    }

    private class StringIterator implements Iterator<List>{
        private int n;
        private int i, j,k;

        public StringIterator(){

            i = 0;
            j = 0;
            k = 0;


            for (int li = 0; li < str.length; li++) {
                for (int lj = 0; lj < str.length; lj++) {
                    if (li == lj)
                            continue;

                    if (checkTwoStrings(str[li], str[lj])) {
                        k++;
                    }
                }
            }
        }
        public boolean hasNext(){
            return n < k;
        }

        public boolean checkTwoStrings(String a, String b) {
            boolean p = false;
            for (int k = 0; k < b.length(); k++) {
                if (a.indexOf(b.charAt(k)) == -1) {
                     p = true;
                }
            }
            return p;
        }
        public List<String> next(){
            List<String> repeatingResult = new ArrayList<>();
            if (hasNext()){
                n++;
                for (int li = i; li < str.length; li++) {
                    for (int lj = j; lj < str.length; lj++) {
                        if (li == lj)
                            continue;
                        if (checkTwoStrings(str[li], str[lj])) {
                            i = li;
                            j = lj+1;
                            repeatingResult.add(str[li] + str[lj]);
                            return repeatingResult;
                        }
                    }
                    j = 0;
                }
                i = str.length;
            }
            return repeatingResult;
        }
    }

}












