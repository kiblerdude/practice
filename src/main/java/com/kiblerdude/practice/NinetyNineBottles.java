package com.kiblerdude.practice;

public class NinetyNineBottles {

    private static final String[] VERSE = {
            " Bottles of Beer on the wall",
            " Bottles of Beer",
            "You take one down, pass it around"
    };

    private static final int decrBottleIdx = VERSE.length - 1;

    public static void main(String[] args) {
        int bottlesRemaining = 99;
        while (bottlesRemaining > 0) {
            for (int verseIdx = 0; verseIdx < VERSE.length; verseIdx++) {
                if (verseIdx != decrBottleIdx) {
                    System.out.print(bottlesRemaining);
                } else {
                    bottlesRemaining--;
                }
                System.out.println(VERSE[verseIdx]);
            }
            System.out.print(bottlesRemaining);
            System.out.println(VERSE[0]);
            System.out.println();
        }
    }
}
