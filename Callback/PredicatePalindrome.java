package Callback;

public class PredicatePalindrome implements FilterPredicate<String> {
    @Override
    public boolean isMatching(String text) {
        StringBuilder sb = new StringBuilder(text);
        String reversetext = sb.reverse().toString();
        return text.equalsIgnoreCase(reversetext);
    }

}
