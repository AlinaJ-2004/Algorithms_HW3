public class hashTest {

    public static void main(String[] args) {
        hashTable table = new hashTable();
        table.print();
        table.put(1);
        table.put(3);
        table.put(5);
        table.put(8);
        System.out.println("The size of the table - " + table.size());
        System.out.println("Is the hashtable empty? - " + table.isEmpty());
        System.out.println("Is the hashtable full? - " + table.isFull());
        table.print();
        System.out.println(table.get(8));
        System.out.println("Removing the element 1");
        table.remove(1);
        table.print();
    }

}