package Salario;
import java.util.Scanner;

/*Programa que calcula e imprime 
el salario semanal de un empleado 
a partir de sus horas semanales trabajadas 
y de su salario por hora.*/

public class SalarioSemanal {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double horasTrabajadas;
        double salarioHora = 5.0;
        double salarioSemanal;
        
        System.out.println("\t\tPrograma que calcula salario semanal");
        
        System.out.println(" Cuantas Horas se trabajo esta semana: "); // Se obtiene la cantidad de horas trabajadas esa semana
        horasTrabajadas = input.nextDouble();
        
        salarioSemanal = salarioHora*horasTrabajadas; /* se calcula el salario semanal al multiplicar las 
        horas trabajadas por el salario por hora*/
        
        System.out.println("El salario semanal es: "+salarioSemanal);  // Se imprime el salario semanal      
    }
}
