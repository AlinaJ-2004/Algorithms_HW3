public class hashTable {

    private static final int DEFAULT_CAPACITY = 10;
    private Integer[] data;
    private int capacity;
    private int size;

    public hashTable() {
        this(DEFAULT_CAPACITY);
    }

    public hashTable(int capacity) {
        this.capacity = capacity;
        init();
    }

    private void init() {
        data = new Integer[capacity];
        size = 0;
    }

    public boolean put(int element) {
        if(data[hashFunction(element)] != null) {
            System.out.printf("The place is already occupied by the element", element, hashFunction(element));
            return false;
        }
        data[hashFunction(element)] = new Integer(element);
        size++;
        return true;
    }

    public Integer get(int element) {
        return data[hashFunction(element)];
    }

    public Integer remove(int element) {
        Integer removed = data[hashFunction(element)];

        if(removed != null) {
            data[hashFunction(element)] = null;
            size--;
        }

        return removed;
    }

    private int hashFunction(int element) {
        int hashValue = element%capacity;
        return hashValue;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void print() {
        System.out.print("Hash Table: ");
        if(isEmpty()) {
            System.out.print("it's empty");
        } else {
            for(int i = 0; i < capacity; i++) {
                if(data[i] != null) {
                    System.out.printf("%2d ", data[i]);
                }
            }
        }
        System.out.print("\n");
    }



}