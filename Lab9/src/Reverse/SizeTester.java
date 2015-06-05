package Reverse;

/**
 * Created by Brandon Kirklen on 6/5/2015.
 * Given main
 */
public class SizeTester
{
    public static void main(String[] args)
    {
        LinkedList names = new LinkedList();
        names.addFirst("Tom");
        names.addFirst("Romeo");
        names.addFirst("Harry");
        names.addFirst("Dick");

        ListIterator iterator = names.listIterator();
        iterator.next();
        iterator.next();
        iterator.remove();
        iterator.next();
        iterator.remove();
        iterator.add("Juliet");
        iterator.next();
        iterator.set("Emily");

        names.removeFirst();

        iterator = names.listIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.println("Expected: Juliet Emily");
        System.out.println(names.size());
        System.out.println("Expected: 2");
    }
}
