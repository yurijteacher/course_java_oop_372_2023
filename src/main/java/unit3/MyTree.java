package unit3;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        System.out.println(treeSet);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());

        treeSet2.add(4);
        treeSet2.add(1);
        treeSet2.add(2);

        System.out.println(treeSet2);

        TreeSet<Integer> treeSet1 = new TreeSet<>(treeSet);
        treeSet1.addAll(treeSet2);
        System.out.println(treeSet1);

        TreeSet<Integer> treeSet3 = new TreeSet<>(treeSet);
        treeSet3.retainAll(treeSet2);
        System.out.println(treeSet3);

        TreeSet<Integer> treeSet4 = new TreeSet<>(treeSet);
        treeSet4.removeAll(treeSet2);
        System.out.println(treeSet4);

    }
}
