package app;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final double META_VENTAS = 500_000;

    public static void main(String[] args) {

        String[] productos = {"Hamburguesas", "Perros Calientes","Papas Fritas"};

        String[] turnos = {"Almuerzo", "Tarde", "Noche",
                "Madrugada"
        };

        double[][] ventas = new double[productos.length][turnos.length];

        registrarVentas(productos, turnos, ventas);
        SCANNER.close();
    }

    private static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private static void registrarVentas(String[] productos, String[] turnos, double[][] ventas) {
        mostrarMensaje("Sistema de ventas - Food Truck Express");

        for (int producto = 0; producto < productos.length; producto++) {
            for (int turno = 0; turno < turnos.length; turno++) {
                String mensaje = "Ingrese las ventas de "
                        + productos[producto] + " en el turno " + turnos[turno] + ": ";
                ventas[producto][turno] = leerDato(mensaje);
            }
        }
    }

    private static double leerDato(String mensaje){
        System.out.print(mensaje);
        return SCANNER.nextDouble();
    }
    }

