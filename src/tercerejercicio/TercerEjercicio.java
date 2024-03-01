/*
 * Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de retención en la fuente 
   es del 12,5% del salario bruto. 
   Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador
 */
package tercerejercicio;

public class TercerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Definición de las variables
        double horasTrabajadas = 48;
        double precioHora = 5000; 
        double porcentajeRetencion = 12.5; 

        // formulas para calcular los procedimientos
        double salarioBruto = horasTrabajadas * precioHora ;
        double retencionFuente = salarioBruto * porcentajeRetencion / 100;
        double salarioNeto = salarioBruto - retencionFuente ;

        // Mostrar resultados
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención en la Fuente: $" + retencionFuente);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
 
    
}
