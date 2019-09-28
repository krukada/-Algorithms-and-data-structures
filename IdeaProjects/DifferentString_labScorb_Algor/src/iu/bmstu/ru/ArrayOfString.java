package iu.bmstu.ru;

import java.util.Iterator;


public class ArrayOfString implements Iterable<String> {
    private String[] str;
    //private int count ;

    public ArrayOfString(String[] str){
        this.str = str;
        //count = str.length;
    }
    public Iterator<String> iterator(){
        return new StringIterator();
    }

    private class StringIterator implements Iterator<String>{
        private int n;

        public StringIterator(){
            n = 0;
        }
        public boolean hasNext(){
            return n < str.length;
        }

        public String next() {
            n++;
            return  str[n-1] ;
        }

    }

}

