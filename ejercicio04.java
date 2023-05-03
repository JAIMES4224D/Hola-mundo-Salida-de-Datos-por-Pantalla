package SalidaDeDatis01;

public class ejercicio04 {
    public static void main(String[] args) {
        //Escribe un programa que muestre tu horario de clase. Puedes usar espacios o
        //tabuladores para alinear el texto.
        System.out.printf("\t\t\t\t\t\t\t\tMI HORARIO\n");
        System.out.printf("            %-15s %s\n","7:00-9:00","9:00-12:00");
        System.out.print("Lunes \t\t");System.out.printf("%-15s %s\n", "Ingles", "Redacción");
        System.out.print("Martes \t\t");System.out.printf("%-15s %s\n", "Matematica", "Gestion");
        System.out.print("Miercoles \t");System.out.printf("%-15s %s\n", "Emprendurismo", "Estadistica");
        System.out.print("Jueves\t\t");System.out.printf("%-15s %s\n", "Algebra", "Algebra");
    }
}
