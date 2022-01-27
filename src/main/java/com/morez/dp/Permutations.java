package com.morez.dp;

import java.util.HashSet;
import java.util.Set;

public class Permutations {

    public static int allStringPermutationsWithoutDistinct(String sequence, String nextSequence, int total) {
        if (sequence.length() == 0) {
            System.out.print(nextSequence + "  ");
            total++;
            return total;
        }

        for(int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);
            String left_substr = sequence.substring(0, i);
            String right_substr = sequence.substring(i + 1);
            String rest = left_substr + right_substr;
            total = allStringPermutationsWithoutDistinct(rest, nextSequence + ch, total);
        }
        return total;
    }

    public static Set<String> allStringPermutationsWithDistinct(String sequence, String nextSequence, Set<String> vals) {
        if (sequence.length() == 0) {
            vals.add(nextSequence);
            return vals;
        }

        for(int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);
            String left_substr = sequence.substring(0, i);
            String right_substr = sequence.substring(i + 1);
            String rest = left_substr + right_substr;
            vals = allStringPermutationsWithDistinct(rest, nextSequence + ch, vals);
        }
        return vals;
    }

    public static void allIntegerPermutationsWithoutDistinct(String sequence, String nextSequence, int number) {
        if (sequence.length() == 0) {
            if(Integer.parseInt(nextSequence) > number)
                System.out.print(nextSequence + "  ");
            return;
        }

        for(int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);
            String left_substr = sequence.substring(0, i);
            String right_substr = sequence.substring(i + 1);
            String rest = left_substr + right_substr;
            allIntegerPermutationsWithoutDistinct(rest, nextSequence + ch, number);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nTotal combinations - " + Permutations.allStringPermutationsWithoutDistinct("abc", "", 0));
        System.out.println(Permutations.allStringPermutationsWithDistinct("AAa", "", new HashSet<>()));
        Permutations.allIntegerPermutationsWithoutDistinct("4231", "", 4231);
    }
}
