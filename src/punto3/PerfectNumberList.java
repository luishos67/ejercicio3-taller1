
package punto3;
import java.util.Scanner;

/**
 */
public class PerfectNumberList {

    public static void main(String[] args) {
     PerfectNumberList Numero = new PerfectNumberList();
                
        System.out.print("Introduzca el límite superior (entero positivo): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("El limite superior no es valido,intente nuevamente");
            return;
        }
        int LimiSup = in.nextInt();
        
        if (LimiSup < 0) {
            System.out.println("El límite superior no es válido. intenta nuevamente");
            return;
        }
        
        System.out.println("Estos son los numeros perfectos:");
        int ContNumPerfectos   = 0;
        for (int i = 1; i <= LimiSup; i++) {
            if ( ! Numero.esPerfecto(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            ContNumPerfectos++;
        }
        System.out.println("\n Numeros perfectos encontrados \n"+
                ContNumPerfectos+ ((double)100 * ContNumPerfectos/LimiSup)
        );
        
        System.out.println();
        
        System.out.println("Estos números no son ni deficientes ni perfectos::");
        int ContNumDeficientes = 0;
        for (int i = 1; i <= LimiSup; i++) {
            if ( Numero.esdeficiente(i) || Numero.esPerfecto(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            ContNumDeficientes++;
        }
        System.out.printf("\n[%1$d Numeros encontrados (%2$.2f%%)]\n",
                ContNumDeficientes, ((double)100 * ContNumDeficientes/LimiSup)
        );     
    }
      private boolean esdeficiente(int posInt)
    {
        int SumaDivisor = 0;
        for (int i = 1 ; i < posInt; i++) {
            SumaDivisor += (posInt%i == 0) ? i : 0;
        }
        return (SumaDivisor < posInt);
    }     
    
    private boolean esPerfecto(int posInt)
    {
        int SumDivi = 0;
        for (int i = 1 ; i < posInt; i++) {
            SumDivi += (posInt%i == 0) ? i : 0;
        }
        return (SumDivi == posInt);
    }
    
 
}    


        