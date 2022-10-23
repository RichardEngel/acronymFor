import java.util.ArrayList;
import java.util.Collections;

public class Acronym {

	public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        System.out.println("Testing: ");

        // Test Case 1
        Collections.addAll(wordList, "Be", "Right", "Back");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 2
        Collections.addAll(wordList, "Computer", "Science", "Engineering");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 3
        Collections.addAll(wordList, "laughing", "out", "loud");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 4
        Collections.addAll(wordList, "National", "Aeronautics", "Space", "Administration");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 5
        Collections.addAll(wordList, "United", "States");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 6
        Collections.addAll(wordList, "North", "American", "Free", "Trade", "Agreement");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 7
        Collections.addAll(wordList, "Supreme", "Court", "of", "the", "United", "States");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        // Test Case 8
        Collections.addAll(wordList," ");
        System.out.println("Word List: " + wordList);
        System.out.println("Acronym: " + acronymFor(wordList) + "\n");
        wordList.removeAll(wordList);

        System.out.println("End of Testing");
	} // End of main

    public static String acronymFor(ArrayList<String> words){
        String acronym = "";
        for(String letter : words){
            acronym += letter.toUpperCase().charAt(0);
        }
        return acronym;
    } // End of method acronymFor

} // End of Class Acronym