import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjercicioCuatro {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(6);
        lista.add(9);
        lista.add(87);

        System.out.println("Recorriendo lista e imprimiendo cada valor:");
        for (Integer numeros : lista){
            System.out.println(numeros);
        }

        int maximo = Collections.max(lista);
        System.out.println("El numero maximo de la lista es: " + maximo);
    }
}
