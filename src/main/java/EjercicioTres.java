import java.util.Objects;
import java.util.Scanner;

public class EjercicioTres {


        public static void convInt(Scanner sc){

            boolean inputValido = false;

            while (!inputValido){
                try {
                    System.out.println("Ingrese un numero entero:");
                    String entradaString = sc.nextLine();

                    int inputInt = Integer.parseInt(entradaString);
                    System.out.println("Imprimiendo wrapper: " + inputInt);
                    inputValido = true;
                }catch (NumberFormatException  e){
                    System.out.println("Se necesita numero entero");
                }
            }

        }

    public static void convDouble(Scanner sc){

        boolean inputValido = false;

        while (!inputValido){
            try {
                System.out.println("Ingrese un numero double:");
                String entradaString = sc.nextLine();

                double inputDouble = Double.parseDouble(entradaString);
                System.out.println("Imprimiendo wrapper: " + inputDouble);
                inputValido = true;
            }catch (NumberFormatException  e){
                System.out.println("Se necesita numero double");
            }
        }

    }


    public static void convBoolean(Scanner sc){

        boolean inputValido = false;

        while (!inputValido){
            try {
                System.out.println("Ingrese un boolean (true o false):");
                String entradaString = sc.nextLine();

                if (Objects.equals(entradaString, "true") ||
                        Objects.equals(entradaString, "TRUE") ||
                        Objects.equals(entradaString, "false") ||
                        Objects.equals(entradaString, "FALSE")){
                    boolean inputBoolean = Boolean.parseBoolean(entradaString);
                    System.out.println("Imprimiendo wrapper: " + inputBoolean);
                    inputValido = true;
                }else {
                    System.out.println("debe ingresar TRUE o FALSE");
                }


            }catch (NumberFormatException  e){
                System.out.println("Se necesita un boolean");
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        convInt(sc);
        convDouble(sc);
        convBoolean(sc);

        sc.close();
    }
}
