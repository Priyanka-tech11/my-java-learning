public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Java is a powerful language";
        System.out.println("Number of words: " + countWords(input));
    }
}
