import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CopyingAndReversingLinkedLists {
    public static void main(String[] args) {
        Character[] characters = {'a','b','c','d','e','f','g','h','z'};
        List<Character> list1 = new LinkedList<>(Arrays.asList(characters));
        List<Character> list2 = getReversedList(list1);
        System.out.println(list2);
    }
    private static List<Character> getReversedList(List<Character> list)
    {
        ListIterator<Character> iterator = list.listIterator(list.size());
        List<Character> reverseList = new LinkedList<>();

        while (iterator.hasPrevious())
            reverseList.add(iterator.previous());

        return reverseList;
    }
}
