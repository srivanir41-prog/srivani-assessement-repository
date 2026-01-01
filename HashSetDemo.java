import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();

        set.add("banana");
        set.add("date");
        set.add("apple");

        // Append (add) new element
        set.add("cherry");

        System.out.println("Updated HashSet: " + set);
    }
}
