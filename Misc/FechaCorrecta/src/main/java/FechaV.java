/**
 *Ejercicio 4 de la tarea: determinar si una fecha ingresada es correcta.
 * @author IvanC
 * @version Marzo 2020
 */
import java.util.Scanner;
import static java.lang.System.*;

public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int d, m;
        long a;
        System.out.println("Se verificar� si cualquier fecha de formato "
                + "DD/MM/AAAA ingresada es v�lida.");
        System.out.println("Escribe el d�a: ");
        d = lector.nextInt();
        System.out.println("Escribe el mes: ");
        m = lector.nextInt();
        System.out.println("Escribe el a�o: ");
        a = lector.nextLong();
        if (d < 1 || m < 1 || a < 1){
            System.out.println("La fecha es inv�lida, pedazo de alcornoque."
                    + " �No sabes que no hay d�as, meses ni a�os negativos?");
        }
        else if(m > 12){
            System.out.println("La fecha es inv�lida, s�lo hay doce meses. Esf�mate.");
        }
        else if(d > 31){
            System.out.println("La fecha es inv�lida, no hay meses con m�s de 31 d�as. Tonto.");
        }
        else{
            if (d > 28){
                if(m == 2){
                    System.out.println("La fecha es inv�lida, febrero tiene 28"
                            + " d�as. Vuelve a la primaria.");
                }
                else{
                    if(d > 30){
                        if(m == 4 || m == 6 || m == 9 || m == 11){
                            System.out.println("La fecha es inv�lida, ese mes s�lo"
                                    + " tiene 30 d�as. No quiero verte jam�s.");
                        }
                        else{
                            System.out.println("La fecha es v�lida. Bien hecho.");
                        }                    
                    }
                }
            }
            else{
                System.out.println("La fecha es v�lida. Bien hecho.");
            }
        }
    }    
}