import java.util.*;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner inputStrings = new Scanner(System.in);
        Scanner inputNumbers = new Scanner(System.in);

        System.out.println("How first names do you want to add in list?");
        int fNamesCount = inputNumbers.nextInt();
        String [] firstNames = new String[fNamesCount];

        System.out.println("Enter first names:");
        for (int i = 0; i < fNamesCount; i++){
            String temp = inputStrings.nextLine();
            firstNames[i] = temp;
        }

        List<String> list = Arrays.asList(firstNames);

        printNonDuplicates(list);
        System.out.println("Enter first name you want to search in the list:");
        String searchedName = inputStrings.nextLine();
        search(list,searchedName);
    }
    private static void printNonDuplicates(Collection<String> values)
    {
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for (String value : set)
            System.out.printf("%s ", value);

        System.out.println();
    }
    private static void search(Collection<String> values, String searchValue)
    {
        Set<String> set = new HashSet<>(values);
        boolean result = set.add(searchValue);
        if (result == true) {
            System.out.println("This first name is'nt present in set");
        }else
            System.out.println("This first name is present in set");

        System.out.println();
    }

}
