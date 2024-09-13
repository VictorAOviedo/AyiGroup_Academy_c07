import java.util.Arrays;
import java.util.Scanner;
/**
*@author: Victor Oviedo
*@version: 13/09/2024
*/

public class EjercicioDos {

    static int[] vector;
    static Scanner sc = new Scanner(System.in);

    /**
     * Solicita al usuario ingresar el tamaño de un vector (arreglo) de números enteros,
     * inicializa el vector con dicho tamaño y permite al usuario cargar datos numéricos
     * en cada posición del vector.
     *
     * <p>Este método no recibe parámetros y utiliza un objeto `Scanner` para capturar
     * la entrada del usuario. Posteriormente, recorre el vector pidiendo un valor
     * numérico para cada posición.</p>
     *
     * <p><strong>Requiere:</strong> Un objeto `Scanner` ya instanciado, llamado `sc`.</p>
     *
     * <p><strong>Salida:</strong> Se muestra un mensaje en la consola solicitando el
     * tamaño del vector y luego se pide un dato numérico para cada posición.</p>
     */
    static void tamanoDelVector(){
        System.out.println("Ingrese tamaño del Vector");
        int tamano = sc.nextInt();
        vector = new int[tamano];

        System.out.println("Cargue datos numericos al Vector");
        for (int i =0; i < vector.length; i++){
            System.out.println("Dato para posicion " + i + " : ");
            int dato = sc.nextInt();
            vector[i] = dato;
        }
    }

    /**
     * Realiza una búsqueda secuencial en el vector para encontrar un valor específico.
     *
     * <p>Este método recorre el vector elemento por elemento para buscar una coincidencia
     * con el dato proporcionado. Si encuentra el valor, se detiene y muestra la posición
     * en la que se encuentra; si no, indica que el elemento no fue encontrado.</p>
     *
     * @param datoBuscar El valor entero que se desea buscar en el vector.
     *
     * <p><strong>Requiere:</strong> Un vector ya inicializado y lleno de datos,
     * así como que el vector sea accesible dentro del método.</p>
     *
     * <p><strong>Salida:</strong> Se imprime en la consola la posición del elemento
     * si es encontrado; de lo contrario, se informa que el elemento no fue hallado.</p>
     */
    static void busquedaSecuencial(int datoBuscar){
        //int [] vect = new int[6];
        int posicion = -1;

        for(int i = 0; i < vector.length; i++){
            if(vector[i] == datoBuscar){
                posicion = i;
                break;
            }
        }

        if(vector[posicion] == datoBuscar)
            System.out.println("Elemento encontado mediante Busqueda Secuencial, en la posicion: " + posicion);
        else
            System.out.println("Elemento no encontrado");
    }


    public static void main(String[] args) {
        tamanoDelVector();
        System.out.println("El tamaño del vector es: " + vector.length);
        System.out.println(Arrays.toString(vector));
        System.out.println("****************");
        System.out.println("Ingrese un valor numerico para buscar");
        int buscar = sc.nextInt();
        busquedaSecuencial(buscar);
    }
}
