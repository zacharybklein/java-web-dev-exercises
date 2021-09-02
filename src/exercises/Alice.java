package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(firstSentence);

        String searchTerm;
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word in the text: ");
        searchTerm = input.nextLine();
        input.close();

        if (firstSentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("That word is included");
        } else {
            System.out.println("Sorry, that word was not found");
        }

        Integer index = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
