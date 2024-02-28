import java.util.ArrayList;

public class Bubblesort{ // objeto para ordenar nota de forma ascendente
    //aqui va la funcion del array de nota
    
    public static void imprimirArreglo(String estado, ArrayList<Integer> array) {
        System.out.println(estado);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }
    public static void NotaDescendente(ArrayList<Integer> notas){
        //imprimirArreglo("antes:",notas);
        boolean intercambio = false; // O(1)
        //System.out.println(notas);
        int size = notas.size()-1;
        //primer ciclo, donde se itera respecto a la longitud de nuestro arreglo
        // menos una posicion porque el ultimo valor, se supone esta ordenado
        for(int i=0; i< size; i++){
            //System.out.println("Iteracion " + (i + 1) + ":"); // O(1)
            // ciclo que itera desde la segunda pocision del arreglo
            for (int j=0; j < size - i; j++) { // O(6n) => O(n)
                // condicion para intercambiar datos
                if (notas.get(j) > notas.get(j + 1)) { // es el actual, mayor que el siguiente // O(1)
                    int temp = notas.get(j); // O(1)
                    //System.out.println("Intercambiando " + notas.get(j) + " con " + notas.get(j + 1)); // O(1)
                    notas.set(j, notas.get(j + 1)); // O(1)
                    notas.set(j + 1,temp); // O(1)
                    intercambio = true; // O(1)
                }
            }
            // Imprime el estado del arreglo después de cada iteración
            //imprimirArreglo("iterando:",notas);
            if (!intercambio) {
                break;
            }
        }
        imprimirArreglo("despues:",notas);
    }
    
}
