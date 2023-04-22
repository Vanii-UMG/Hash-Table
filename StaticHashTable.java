public class StaticHashTable {
    private int SIZE = 7;
    private int[] hashTable;

    public StaticHashTable() {
        hashTable = new int[SIZE];
        for(int i = 0; i<SIZE;i++){
            hashTable{i} = -1;
        }
    }

    private int hash(int value) {
        // Función hash simple que calcula el índice
        // basado en la longitud de la cadena
        return value % SIZE;
    }

    public void put(int value) {
        int index = hash(value);
        hashTable[index] = value;
    }

    public int get(int key) {
        int index = hash(key);
        return hashTable[index];
    }

    public void listar(){
        for(int i = 0; i<SIZE;i++){
            System.out.println(i + ": " + hashTable[i]);
        }
    }
}