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
public class Arreglo {
    
    public static void sumarLista(int[] a){
    int total = 0;
    double promedio;
    for(int i=0;i<a.length;i++){
        total += a[i];
       }
        promedio=total/a.length;
        System.out.println("La suma de los enteros del arreglo es de: " + total);
        System.out.println("el promedio del arreglo es: "+promedio);
    }
    
    public static void buscarMayor(int[][] a){
        int elMayor=0;
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[j] > elMayor) {
                    elMayor = a1[j];
                }
            }
        }
        System.out.println("El mayor del arreglo es: "+elMayor);
    }
    
    public static void cuentaVocales(String s){
      
        int totalVocales;
        totalVocales = (int) s.chars().filter((int ch) -> ch == 'a'|| ch=='A'||ch == 'e'|| ch=='E'||ch == 'i'|| ch=='I'||ch == 'o'|| ch=='O'||ch == 'u'|| ch=='U').count();

        System.out.println("Hay un total de " + totalVocales + " vocales.");
    }
    
    public static void cuentaCaracter(String s,char c){
        int totalCaracter;
        totalCaracter=(int) s.chars().filter(ch->ch == c).count();
        
        System.out.println("El caracter "+c+" aparece " + totalCaracter+" veces");
    }
    
}
