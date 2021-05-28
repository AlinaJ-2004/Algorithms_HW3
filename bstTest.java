
public class bstTest {

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.add(new Integer[]{50, 3, 13, 6, 1});
        tree.print();
        System.out.println("Size of the tree - " +tree.size());

        boolean isFound = tree.find(17);
        System.out.println("Is there element 50? - " + isFound);

        isFound = tree.find(10);
        System.out.println("Is there element 7? - " + isFound);

        isFound = tree.find(20);
        System.out.println("Is there element 1? - " + isFound);

        System.out.println("Height of the tree - " +tree.height());

        tree.print();
    }

}