/**
 * Exercise (Chapter 1: Introduction to Java) — Strings and StringBuilder.
 *
 * Complete {@link #firstLetters(String)} below.
 *
 *
 * Relevant reading: 1.4. Strings and 1.4.4. StringBuilder.
 */
public class FirstLetters {

    public static void main(String[] args) {
        String phrase = "Idol Long Oolong Vertical Europe University Toyota";
        // Should print ILOVEUT once firstLetters is implemented.
        System.out.println("First letters of \"" + phrase + "\": " + firstLetters(phrase));
    }

    /**
     * Given a string of words separated by single spaces, returns a new string
     * made of the first character of each word, in order. You may assume the
     * input contains at least one word.
     *
     * Example: {@code firstLetters("Good Morning")} returns {@code "GM"}.
     *
     * @param words a non-empty string of words separated by single spaces
     * @return the first character of each word, concatenated
     */
    public static String firstLetters(String words) {
        StringBuilder wordscopy = new StringBuilder(words);
        StringBuilder ret_string = new StringBuilder(String.valueOf(wordscopy.charAt(0)));
        int i = wordscopy.indexOf(" ");
        while (i != -1) {
            ret_string.append(wordscopy.charAt(i + 1));
            wordscopy.replace(i, i + 1, "X");
            i = wordscopy.indexOf(" ");
        }
        return new String(ret_string);
    }
}
