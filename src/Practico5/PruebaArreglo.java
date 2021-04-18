/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico5;

/**
 *
 * @author Chony
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ar1[]={1,5,6,9,7,8,12,15,19,26};
        int matriz1[][]={{97,78,5,98}, {25,3,2},{49,7,6,5,9,32}};
        String letras = "Me llama usted, entonces voy, don barredora es quien yo soy";
        
        
        Arreglo.sumarLista(ar1);
        Arreglo.buscarMayor(matriz1);
        Arreglo.cuentaVocales(letras);
        Arreglo.cuentaCaracter(letras, 'a');
    }
    
}
