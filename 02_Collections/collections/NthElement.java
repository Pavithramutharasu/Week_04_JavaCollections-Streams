import java.util.LinkedList;
import java.util.ListIterator;

public class NthElement {
    public static Character getNthFromEnd(LinkedList<Character> list, int n) {
        ListIterator<Character> first = list.listIterator();
        ListIterator<Character> second = list.listIterator();

        int count = 0;
        while (first.hasNext() && count < n) {
            first.next();
            count++;
        }

        if (count < n) return null;

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

        int n = 2;
        Character result = getNthFromEnd(list, n);

        if (result != null) {
            System.out.println(n + "th element from the end is: " + result);
        } else {
            System.out.println("List is shorter than " + n + " elements.");
        }
    }
}
