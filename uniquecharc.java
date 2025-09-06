package exp3;
import java.util.Scanner;
public class uniquecharc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();

        boolean unique = true;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    unique = false;
                }
            }
        }
        if (unique)
            System.out.println("PERFECT");
        else
            System.out.println("NOT PERFECT");
    }
}
