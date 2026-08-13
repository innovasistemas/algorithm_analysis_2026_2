import com.packages.arrays.*;
import java.util.Scanner;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String option;
        do {
            System.out.println("Menú de opciones");    
            System.out.println("0. Salir");
            System.out.println("1. Matrices");
            System.out.println("2. Vectores");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuMatrix();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }

    public static void menuMatrix()
    {
        String option;
        Matrix objMat = new Matrix();
        do {
            System.out.println("Menú matrices");    
            System.out.println("0. Regresar");
            System.out.println("1. Ingresar tamaño");
            System.out.println("2. Mostrar tamaño");
            System.out.println("3. Crear matriz");
            System.out.println("4. Mostrar matriz");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Número filas: ");
                    objMat.setM(input.nextInt());
                    input.nextLine();
                    System.out.print("Número columnas: ");
                    objMat.setN(input.nextInt());
                    input.nextLine();
                    break;
                case "2":
                    System.out.println("Tamaño matriz: " + objMat.getM() + "x" + objMat.getN());
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }
}