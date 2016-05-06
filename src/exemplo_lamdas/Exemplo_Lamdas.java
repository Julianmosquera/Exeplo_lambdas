
package exemplo_lamdas;

/**
 *
 * @author julian
 */
public class Exemplo_Lamdas {

   
    public static void main(String[] args) {
   
   Ilamdas op =new Ilamdas() {
       
       @Override
       public void opreracion(int a, int b) {
           System.out.println("op: "+(a*b));
       }
   };
    op.opreracion(5, 9);
    //con expresion lambda
    Ilamdas op2= (int a, int b)->System.out.println("resultado"+(a*b));
    op2.opreracion(3, 6);
    op2.saudo();
    
    }
    
}
