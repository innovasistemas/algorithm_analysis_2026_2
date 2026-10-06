import com.packages.arrays.*;
import com.packages.primes.*;
import com.packages.utils.*;
import com.packages.linked_list.*;
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
            System.out.println("3. Primos");
            System.out.println("4. Listas Ligadas");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuMatrix();
                    break;
                case "2":
                    menuVector();
                    break;
                case "3":
                    menuPrimos();
                    break;
                case "4":
                    menuLinkedList();
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
        Matrix matA = new Matrix();
        Matrix matB = new Matrix();
        Matrix matC = new Matrix();
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
            System.out.println("8. Producto matrices");
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
                case "8":
                    matA.setM(2);
                    matA.setN(2);
                    matB.setM(2);
                    matB.setN(3);
                    matC.setM(matA.getM());
                    matC.setN(matB.getN());
                    matA.fillMatrix();
                    matB.fillMatrix();
                    System.out.println("Matriz A");
                    matA.showMatrix();
                    System.out.println("Matriz B");
                    matB.showMatrix();
                    int C[][] = matC.matrixProduct(
                        matA.getMat(), matB.getMat(), matA.getM(), 
                        matA.getN(), matB.getN()
                    );
                    System.out.println("Matriz C");
                    int i, j;
                    for (i = 0; i < matC.getM(); i++) {
                        for (j = 0; j < matC.getN(); j++) {
                            System.out.print(C[i][j] + "  ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }

    public static void menuVector()
    {
        String option;
        Vector objVec = new Vector();
        int datum, position;
        do {
            System.out.println("\n-----Menú vectores-----");    
            System.out.println("0. Regresar");
            System.out.println("1. Agregar dato");
            System.out.println("2. Mostrar vector");
            System.out.println("3. Buscar dato (secuencial)");
            System.out.println("4. Ordenar (burbuja)");
            System.out.println("5. Llenar vector aleatorio");
            System.out.println("6. Buscar dato (binaria)");
            System.out.println("7. Ordenar (merge sort)");
            System.out.println("8. Descifrar mensaje");
            System.out.println("9. Ordenar (selección)");
            System.out.println("10. Ordenar (inserción)");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    break;
                case "1":
                    if (objVec.getN() < objVec.getT()) {
                        System.out.print("Dato: ");
                        datum = input.nextInt();
                        input.nextLine();
                        objVec.addVector(datum);
                        System.out.println("Dato agregado en el vector");
                    } else {
                        System.out.println("Vector lleno");
                    }
                    break;
                case "2":
                    if (objVec.getN() > 0) {
                        objVec.showVector();
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "3":
                    if (objVec.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = objVec.searchSequential(datum);
                        if (position == -1) {
                            System.out.println("Dato no encontrado");
                        } else {
                            System.out.println("Dato encontrado en posición " + position);
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "4":
                    if (objVec.getN() > 0) {
                        objVec.bubbleSort();
                        System.out.println("Vector ordenado");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "5":
                    objVec.fillVector();
                    System.out.println("Vector llenado con números aleatorios");
                    break;
                case "6":
                    if (objVec.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = objVec.searchSequential(datum);
                        if (position == -1) {
                            System.out.println("Dato no encontrado");
                        } else {
                            System.out.println("Dato encontrado en posición " + position);
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "7":
                    if (objVec.getN() > 0) {
                        objVec.sort(objVec.getVec(), 0 , objVec.getN() - 1);
                        System.out.println("Vector ordenado");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "8":
                    if (objVec.getN() > 0) {
                        System.out.println("Mensaje: " + objVec.decryptMessage());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "9":
                    if (objVec.getN() > 0) {
                        objVec.sortSelection();
                        System.out.println("Vector ordenado");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "10":
                    if (objVec.getN() > 0) {
                        objVec.sortInsertion();
                        System.out.println("Vector ordenado");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }

    public static void menuPrimos()
    {
        String option;
        PrimeNumbers prime = new PrimeNumbers();
        Operations oper = new Operations();
        int P[] = new int[100];
        int t = 0;
        P[t] = 2;
        int P1[] = new int[100];
        int t1 = 0;
        P1[t1] = 2;
        do {
            System.out.println("\n-----Menú primos-----");    
            System.out.println("0. Regresar");
            System.out.println("1. Ingresar número");
            System.out.println("2. Primos Euclides");
            System.out.println("3. Primos sin Euclides");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    break;
                case "1":
                    break;
                case "2":
                    P[++t] = prime.newPrimeEuclides(P, t);
                    oper.showArray(P, t);
                    break;
                case "3":
                    P1[++t1] = prime.newPrimeWithoutEuclides(P1, t1);
                    oper.showArray(P1, t1);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }

    public static void menuLinkedList()
    {
        String option;
        int datum;
        LinkedSimpleList list = new LinkedSimpleList();
        NodeLSL q;
        do {
            System.out.println("\n-----Menú Listas Ligadas-----");    
            System.out.println("0. Regresar");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar dato");
            System.out.println("4. Eliminar dato");
            System.out.print("Ingrese su opción: ");
            option = input.next();
            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato: ");
                    datum = input.nextInt();
                    input.nextLine();
                    list.addNodeLSLBegin(datum);
                    break;
                case "2":
                    if (list.head != null) {
                        list.showLSL();
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "3":
                    if (list.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        q = list.searchNodeLSL(datum);
                        if (q != null) {
                            System.out.println("Dato encontrado en dirección " + q);
                        } else {
                            System.out.println("El dato no existe en la lista");
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "4":
                    if (list.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        if (list.deleteNodeLSL(datum)) {
                            System.out.println("Nodo eliminado correctamente");
                        } else {
                            System.out.println("El dato no existe en la lista");
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }
}
