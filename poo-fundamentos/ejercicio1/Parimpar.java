import java.util.Scanner;
import java.util.Arrays;

public class Parimpar {

   public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      
      //tipoDato nombrevariable = valorInicializado;
      ParesImpares utilidad = new ParesImpares();
      int arreglo[] = utilidad.getArreglo();
      
      System.out.println(Arrays.toString(arreglo));
       
     }
}