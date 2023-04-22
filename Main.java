
public class Main {
    public static void main(String[] args) {
        StaticHashTable hashTable = new StaticHashTable();

        // Agregar elementos a la tabla hash
        hashTable.put(11);
        hashTable.put(24);
        hashTable.put(33);
        //hashTable.put("tres", "6");

        // Obtener elementos de la tabla hash
        hashTable.listar();
        //System.out.println("Valor de 'seis': " + hashTable.get("tres"));
    }

}
