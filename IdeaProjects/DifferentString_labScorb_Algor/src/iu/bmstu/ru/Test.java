package iu.bmstu.ru;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args){
        String[] str = new String[]{
                new String("ab"),
                new String("ad333333aksd g %%%% *ddeeeeeee"),
                new String("oei4aatt"),
                new String("ba")

        };
        ArrayOfString strings = new ArrayOfString(str);
        String intersection;
        for (String i : strings){
            for (String j: strings) {

                 i = i.replaceAll("[^A-Za-zA-Яа-я]","");
                 j = j.replaceAll("[^A-Za-zA-Яа-я]","");

                 intersection = ("");

                 List<String> repeatingResult = new ArrayList<>();
                if ((i.equals(j)) != true) {
                    for (int k = 0; k < j.length(); k++) {
                        if (i.indexOf(j.charAt(k)) == -1)

                            intersection += j.charAt(k);
                    }
                    String result = ("");
                    if ((j.equals(i)) != true) {
                        for (int k = 0; k < i.length(); k++) {
                            if (j.indexOf(i.charAt(k)) == -1)
                                intersection += i.charAt(k);
                        }
                        //убираем повторы букв

                        for (int m = 0; m < intersection.length(); m++) {
                                if (!result.contains(String.valueOf(intersection.charAt(m)))) {
                                    result += String.valueOf(intersection.charAt(m));
                                }
                        }
                        if (result.length() != 0){
                            repeatingResult.add(result);
                        }
                    }
                }
                if (repeatingResult.size() != 0)
                    System.out.println(" " + repeatingResult + " ");
            }
        }
    }
}
