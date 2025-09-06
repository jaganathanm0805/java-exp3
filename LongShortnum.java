package exp3;
public class LongShortnum {
    public static void main(String[] args) {
        String text = "Welcome to Java Program";
        String[] words = text.split(" ");
        
        String longest = words[0];
        String shortest = words[0];
        
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
            if (w.length() < shortest.length()) shortest = w;
        }
        
        System.out.println("Longest Word: " + longest + " - " + longest.length() + " characters");
        System.out.println("Shortest Word: " + shortest + " - " + shortest.length() + " characters");
    }
}
