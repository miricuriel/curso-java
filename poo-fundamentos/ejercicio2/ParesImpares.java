import java.util.Scanner;

public class ParesImpares{    
    
   /*
   modificadorAcceso tipoRetorno nombreMetodo(param1, params2, ..., paramN) {
      //cuerpo del metodo
      //parametros : datos de entrada del metodo
      //retorno : posible valor que el metodo regresa
   }*/
        
   public int[] getArreglo (){
      int arreglo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      return arreglo;
   }
   
   public String identifyParesimpares(int arreglo[], String indicador){ 
      String resultado = "";
      if(indicador == "par"){
         resultado = "Pares : "  ;
         for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] % 2 == 0){
               resultado += arreglo[i] + ", ";
            }
         }
      }
      else if(indicador == "impar")
      {
         resultado = "Impares : "  ;
         for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] % 2 == 1){
               resultado += arreglo[i] + ", ";
            }
         }
      }
      else{
         resultado = "El indicador que has elegido es invalido";
      }
      return resultado;
   }    
 }
      