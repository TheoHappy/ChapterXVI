import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class LetterTypeCount
{
    public static void main(String[] args)
    {
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<Character, Integer> map)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String word = tokens[i].toLowerCase();
            for (int j = 0; j < word.length(); j++){
                Character letter = word.charAt(j);
                if (map.containsKey(letter))
                {
                    int count = map.get(letter);
                    map.put(letter, count + 1);
                }
                else
                    map.put(letter, 1);
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map)
    {
        Set<Character> keys = map.keySet();

        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (Character key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}


