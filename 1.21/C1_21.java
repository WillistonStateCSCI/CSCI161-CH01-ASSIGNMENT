//Exercise C-1.21
//Hint - Consider using swaps to reshuffle the array one entry at a time, starting from the beginning and moving to the end
//Your instructor's favorite is the Fisher-Yates Algorithm https://www.geeksforgeeks.org/dsa/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/

import java.util.Random;

public class C1_21 {
    public static void main(String[] args) {
        // Main method has been provided to generate an array, and print your shuffled
        // array.
        // You should not have to change anything in this method.

        // Create array containing 1 through 52
        int[] cards = new int[52];

        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

        // Shuffle the array
        shuffle(cards);

        // Print shuffled array
        for (int card : cards) {
            System.out.print(card + " ");
        }
    }

    public static void shuffle(int[] arr) {
        //Add code here to properly shuffle the incoming array.
    }

}
