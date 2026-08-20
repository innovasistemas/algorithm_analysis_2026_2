import com.packages.arrays.*;
import java.util.Scanner;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String option;
        do {
            System.out.println("-----Menú de opciones-----");    
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
            System.out.println("\n-----Menú matrices-----");    
            System.out.println("0. Regresar");
            System.out.println("1. Crear matriz");
            System.out.println("2. Mostrar tamaño");
            System.out.println("3. Mostrar matriz");
            System.out.println("4. Diagonal principal");
            System.out.println("5. Diagonal secundaria");
            System.out.println("6. Triangular inferior");
            System.out.println("7. Total números primos");
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
                    if (objMat.getM() > 0 && objMat.getN() > 0) {
                        objMat.fillMatrix();
                        System.out.println("Matriz creada");
                    } else {
                        System.out.println("Tamaño de la matriz no válido");
                    }
                    break;
                case "2":
                    System.out.println("Tamaño matriz: " + objMat.getM() + "x" + objMat.getN());
                    break;
                case "3":
                    if (objMat.getM() > 0 && objMat.getN() > 0) {
                        objMat.showMatrix();
                    } else {
                        System.out.println("No ha definido el tamaño de la matriz");
                    }
                    break;
                case "4":
                    if (objMat.getM() > 0 && objMat.getN() == objMat.getM()) {
                        objMat.mainDiagonal();
                    } else {
                        System.out.println("Defina el tamaño de la matriz como cuadrada");
                    }
                    break;
                case "5":
                    if (objMat.getM() > 0 && objMat.getN() == objMat.getM()) {
                        objMat.secondaryDiagonal();
                    } else {
                        System.out.println("Defina el tamaño de la matriz como cuadrada");
                    }
                    break;
                case "6":
                    if (objMat.getM() > 0 && objMat.getN() == objMat.getM()) {
                        objMat.triangularUp();
                    } else {
                        System.out.println("Defina el tamaño de la matriz como cuadrada");
                    }
                    break;
                case "7":
                    if (objMat.getM() > 0 && objMat.getN() > 0) {
                         System.out.println("Total números primos: " + objMat.countPrimes());
                    } else {
                        System.out.println("No ha creado la matriz");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }
}