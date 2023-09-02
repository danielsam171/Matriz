/*
autor : Daniel
 */
//datos arq: lectura, procesamiento, entrega
package modelView;

import java.util.Scanner;

public class AsistenciaClase {

    static int edades[] = new int[10];
    static Scanner s = new Scanner(System.in);
    static Scanner t = new Scanner(System.in);
    static Estudiante el = new Estudiante();

    public static String Menu() {
        System.out.println("Escriba una de las opciones");
        System.out.println("1. Reportar asistencia");
        System.out.println("2. Realizar registro de estudiante :");
        System.out.print("Tu opcion es : ");
        String opcion = String.valueOf(s.nextInt());
        return opcion;
    }

    private static void mostrarMenu() {
        while (true) {
            String opi = Menu();

            while (!opi.equals("3")) {

                for (int i = 0; i < edades.length; i++) {
                    edades[i] = (1010 + i);
//              System.out.println(edades[i]);
                }

                System.out.print("Cual es tu numero de cedula : ");
                int cedula = s.nextInt();
                el.cedula = cedula;

                if (opi.equals("1")) {
                    for (int p = 0; p <= edades.length; p++) {
                        if (p == edades.length) {
                            System.out.println("Tu documento no se encuentra registrado \nDirijase a la otra opcion del menu");
                            break;
                        } else if (cedula == edades[p]) {
                            System.out.println("Asistencia registrada con exito ");

                            break;
                        } else {
                            continue;
                        }

                    }
                    break;
                } else if (opi.equals("2")) {
                    System.out.print("Ingrese su nombre : ");
                    String nombre = t.nextLine();
                    Estudiante nuevo = new Estudiante(nombre, cedula);
                    System.out.println("Se a registrado");
                    break;

                } else {
                    System.out.println("Opcion invalida");
                    System.out.println("buenas probando");
                    break;
                }

            }
            if (opi.equals("3")) {
                break;
            }
            else{
                System.out.println("\n\n");}
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
    }

}
