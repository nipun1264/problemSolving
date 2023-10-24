/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

/**
 *
 * @author User
 */

    import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static List<String> justifyText(String str, int L) {
        String[] words = str.split(" ");
        List<String> result = new ArrayList<>();
        int currentLineLength = 0;
        List<String> currentLineWords = new ArrayList<>();

        for (String word : words) {
            if (currentLineLength + currentLineWords.size() + word.length() <= L) {
                currentLineWords.add(word);
                currentLineLength += word.length();
            } else {
                result.add(justifyLine(currentLineWords, L, false));
                currentLineWords.clear();
                currentLineLength = 0;
                currentLineWords.add(word);
                currentLineLength += word.length();
            }
        }

        result.add(justifyLine(currentLineWords, L, true));
        return result;
    }

    public static String justifyLine(List<String> words, int L, boolean isLastLine) {
        int totalWordsLength = words.stream().mapToInt(String::length).sum();
        int extraSpaces = L - totalWordsLength;
        int wordCount = words.size();

        if (wordCount == 1 || isLastLine) {
            return String.join(" ", words);
        }

        int spacesBetweenWords = extraSpaces / (wordCount - 1);
        int extraSpacesRemaining = extraSpaces % (wordCount - 1);

        StringBuilder justifiedLine = new StringBuilder(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            int spacesToAdd = spacesBetweenWords + (i <= extraSpacesRemaining ? 1 : 0);
            for (int j = 0; j < spacesToAdd; j++) {
                justifiedLine.append(' ');
            }
            justifiedLine.append(words.get(i));
        }

        return justifiedLine.toString();
    }

    public static void main(String[] args) {
        String input = "This is a sample text that needs to be justified in lines of width L.";
        int lineLength = 20;

        List<String> justifiedText = justifyText(input, lineLength);

        for (String line : justifiedText) {
            System.out.println(line);
        }
    }
}


