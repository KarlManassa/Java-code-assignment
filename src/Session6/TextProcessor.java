package Session6;

public class TextProcessor {

    public static void main(String[] args) {
        countAndPrintWords("I Love Route Academy");
        reverseText("Karl");
        addSpaces("I Love Route Academy");
    }

    public static void countAndPrintWords(String text) {
        String[] words = text.split(" ");

        // System.out.println("Your text contains " + words.length + " words");
        System.out.println(String.format("Your Text Contains %d words", words.length));

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseText(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println(reversed);
    }

    public static void addSpaces(String text) {
        StringBuilder modifiedText = new StringBuilder(text);

        for (int i = 1; i < modifiedText.length(); i++) {
            if (Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}