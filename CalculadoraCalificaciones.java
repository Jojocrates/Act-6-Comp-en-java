package com.mycompany.calculadoracalificaciones;

import java.util.Scanner;

public class CalculadoraCalificaciones {
    private String nombre;
    private int[] calificaciones = new int[5];

    // Constructor
    public CalculadoraCalificaciones(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        System.out.println("Promedio: " + promedio);
        char calificacionFinal = obtenerCalificacionFinal(promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // Solicitar calificaciones
        int[] calificaciones = new int[5];
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Crear objeto de CalculadoraCalificaciones y mostrar resultados
        CalculadoraCalificaciones calculadora = new CalculadoraCalificaciones(nombre, calificaciones);
        calculadora.imprimirResultados();

        scanner.close();
    }
}


