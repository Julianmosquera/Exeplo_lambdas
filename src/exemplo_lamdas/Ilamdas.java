/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_lamdas;

/**
 *
 * @author julian
 */
@FunctionalInterface
public interface Ilamdas {
    public abstract void opreracion (int a, int b);
  //  public abstract void metodo();
    default void saudo(){
        System.out.println("Saudo");
    }
}
