import java.util.Arrays;
import java.util.InputMismatchException;
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
        boolean tamanoValido = false;

        // Bucle para pedir el tamaño del vector hasta que el dato sea válido
        while (!tamanoValido) {
            try {
                System.out.println("Ingrese tamaño del Vector:");
                int tamano = sc.nextInt();
                vector = new int[tamano];
                tamanoValido = true;  // Tamaño válido, salir del bucle
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido, por favor ingrese un número entero.");
                sc.next();  // Limpiar el valor incorrecto del scanner
            }
        }


        System.out.println("Cargue datos numericos al Vector");
        for (int i = 0; i < vector.length; i++) {
            boolean datoValido = false;
            while (!datoValido) {
                System.out.println("Dato para posición " + i + " : ");
                if (sc.hasNextInt()) {  // Verifica si el dato es un número entero
                    int dato = sc.nextInt();
                    vector[i] = dato;
                    datoValido = true;  // El dato es válido, salir del bucle
                } else {
                    System.out.println("Dato no válido, por favor ingrese un número entero.");
                    sc.next();  // Descarta el valor incorrecto
                }
            }
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

        int posicion = -1;

        for(int i = 0; i < vector.length; i++){
            if(vector[i] == datoBuscar){
                posicion = i;
                break;
            }
        }

        if(posicion != -1){
            System.out.println("Elemento encontado mediante Busqueda Secuencial, en la posicion: " + posicion);
        }
        else{
            System.out.println("Elemento no encontrado");
        }
    }


    public static void main(String[] args) {
        tamanoDelVector();
        System.out.println("El tamaño del vector es: " + vector.length);
        System.out.println(Arrays.toString(vector));
        System.out.println("****************");

        //System.out.println("Ingrese un valor numerico para buscar");

        boolean dato = false;
        while (!dato){
            System.out.println("Ingrese un valor numerico para buscar");
            if (sc.hasNextInt()){
                int buscar = sc.nextInt();
                busquedaSecuencial(buscar);
                dato = true;
            } else{
                System.out.println("Solo se acepta un valor numerico entero");
                sc.next();
            }

        }


    }
}
