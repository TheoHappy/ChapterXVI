import java.util.*;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        List<String> list = new ArrayList<>();
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            word = word.replaceAll("[\\W]", "");
            list.add(word);
        }
        int listCount = list.size();
        int listNonDuplicatesCount = getNonDuplicatesListSize(list);

        System.out.printf("\nThe number of duplicate words in a sentence is %d",listCount-listNonDuplicatesCount);
    }

    private static int getNonDuplicatesListSize(Collection<String> values)
    {
        Set<String> set = new HashSet<>(values);
        return set.size();
    }
}
