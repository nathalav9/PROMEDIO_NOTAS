
import java.util.Scanner;

/**
 *
 * @author nataj
 */
public class promedio {

    public static void main(String[] args) {

        Scanner informacion = new Scanner(System.in);
        String nombre_estu[] = new String[5];
        String nombres = "";

        for (int i = 0; i < nombre_estu.length; i++) {
            System.out.println("Ingrese los  nombres y apellidos del estudiante");
            nombres = informacion.nextLine();
            nombre_estu[i] = nombres;

        }

        for (int i = 0; i < nombre_estu.length; i++) {

            System.out.println("El nombre del estudiante es:" + nombre_estu[i]);

        }

        double valor_nota[] = new double[5];
        double notas = 0;

        for (int n = 0; n < valor_nota.length; n++) {

            System.out.println("Ingrese las notas de cada estudiante");
            notas = informacion.nextFloat();
            valor_nota[n] = notas;
        }

        for (int n = 0; n < valor_nota.length; n++) {

         System.out.println("El nombre del estudiante es: "+ nombre_estu[n] + "La nota del estudiante es: " + valor_nota[n]);
         
        }
        System.out.println("el promedio del curso es :" + promedio_notas(valor_nota));
        for (int n = 0; n < valor_nota.length; n++) {

         if (valor_nota[n] < promedio_notas(valor_nota)) {
                System.out.println(nombre_estu[n] + " La nota es: " + valor_nota [n] + " menor al promedio del curso ");

        }
          
        }
        
        
    }

   public static double promedio_notas(double[] valor_nota) {
       double notas_totales = 0;

        for (int i = 0; i < valor_nota.length; i++) {
            notas_totales += valor_nota[i];
        }
        return notas_totales / valor_nota.length;
    }

    

}
