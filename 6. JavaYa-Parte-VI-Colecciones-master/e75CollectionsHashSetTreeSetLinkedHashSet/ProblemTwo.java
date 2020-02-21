package e75CollectionsHashSetTreeSetLinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

public class ProblemTwo {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new TreeSet<Integer>();
        while (conjunto1.size() < 10) {
            int aleatorio = (int) (Math.random() * 100) + 1;
            conjunto1.add(aleatorio);
        }
        System.out.println(conjunto1);
    }
}
