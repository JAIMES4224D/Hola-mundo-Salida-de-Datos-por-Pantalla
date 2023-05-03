package SalidaDeDatis01;

public class ejercicio05 {
    public static void main(String[] args) {
        //Modifica el programa anterior añadiendo colores. Puedes mostrar cada asig-
        //natura de un color diferente.
        String rojo = "\033[31m";
        String naranja = "\033[33m";
        String morado = "\033[35m";
        System.out.printf("\t\t\t\t\t\t\t\tMI HORARIO\n");
        System.out.printf(morado+"            %-15s %s\n","7:00-9:00","9:00-12:00");
        System.out.print(rojo+"Lunes \t\t");System.out.printf(naranja +"%-15s %s\n", "Ingles", "Redacción");
        System.out.print(rojo+"Martes \t\t");System.out.printf(naranja+"%-15s %s\n", "Matematica", "Gestion");
        System.out.print(rojo+"Miercoles \t");System.out.printf(naranja+"%-15s %s\n", "Emprendurismo", "Estadistica");
        System.out.print(rojo+"Jueves\t\t");System.out.printf(naranja+"%-15s %s\n", "Algebra", "Algebra");
    }
}
