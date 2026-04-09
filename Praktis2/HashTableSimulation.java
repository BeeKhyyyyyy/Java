public class HashTableSimulation {
    public static void main(String[] args) {
        int[] ids = {1011, 1021, 1051, 1161, 2022, 2123};
        int size = 10;
        Integer[] table = new Integer[size];

        for (int id : ids) {
            int hash = id % size;
            int index = hash;
            while (table[index] != null) {
                index = (index + 1) % size; // Linear probing
            }
            table[index] = id;
            System.out.println("Inserted " + id + " at index " + index);
        }

        System.out.println("\nFinal Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] == null ? "-" : table[i]));
        }
    }
}
