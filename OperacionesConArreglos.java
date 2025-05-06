/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesconarreglos;

/**
 *
 * @author Zuriel Ali 
 */
public class OperacionesConArreglos {

    public static void main(String[] args) {
     //arrays definidos
     
     int[] arreglo1={5,10,15,20,25};
     int[] arreglo2={1,2,3,4,5};
     
     
     //sumar 2 arreglos elemento por elemento
     
     int[] suma= new int[arreglo1.length];
     
       for (int i=0; i<arreglo1.length;i++){
           suma[i]=arreglo1[i]+arreglo2[i];
       }
     //recorrer arreglo e imprimir sus elementos 
        System.out.println("Elementos del arreglo 1:");
        
        for(int i=0; i<arreglo1.length;i++){
            
            System.out.println("Elemento "+(i+1)+": "+arreglo1[i]);
        }
        
      // Suma del segundo arreglo :)  
      int[] suma2= new int[arreglo2.length];
     
       for (int j = 0; j<arreglo2.length; j++) {
           suma2[j]=arreglo2[j]+arreglo1[j];
       }    
        System.out.println("Elementos del arreglo 2 ");
             
        for (int j=0; j<arreglo2.length; j++) {
                
         System.out.println("Elemento "+(j+1)+": "+arreglo2[j]);
             
        }
        
     //multiplicar arreglos 
       System.out.println("");
       
       int [] multiplicacion= new int [arreglo1.length];
       
       for (int i=0; i<arreglo1.length;i++){
           multiplicacion [i]=arreglo1[i]*arreglo2[i];
       }
       
        System.out.println("Multiplicacion de arreglo 1 ");
        for(int i=0; i<multiplicacion.length;i++){
            System.out.println("Elemento "+(i+1)+":"+multiplicacion[i]);

        } 
       
       //extraer informacion: valor máximo,minimo y promedio
      
       int maximo=arreglo1[0];
       int maximo2=arreglo2[0];
       int minimo=arreglo1[0];
       int minimo2=arreglo2[0];
       int sumaTotal=0;
       int sumaTotal2=0;
        
       for (int i = 0; i < arreglo1.length; i++) {
            //encontrar el maximo y minimo
            if(arreglo1[i]>maximo){
                maximo=arreglo1[i];
            }
            if (arreglo1[i]<minimo){
                minimo=arreglo1[i];
            }
         //sumar los elementos para calcular el promedio
         sumaTotal +=arreglo1[i];
            
        }
       
  for (int i = 0; i < arreglo2.length; i++) {
              //encontraer el maximo y minimo para el arreglo 2
              if(arreglo2[i]>maximo2){
                  maximo2=arreglo2[i];
              }
              if(arreglo2[i]<minimo2){
                  minimo2=arreglo2[i];
              }
           sumaTotal2 +=arreglo2[i];
        }
       
       double promedio=(double)sumaTotal/arreglo1.length;
       double promedio2=(double)sumaTotal2/arreglo2.length;
       
       System.out.println("");
       System.out.println("Informacion extraida del arreglo 1");
       System.out.println("Valor máximo del arreglo1 : "+maximo);
       System.out.println("Valor minimo1: "+minimo);
       System.out.println("Valor promedio1: "+promedio);
       System.out.println("");
       System.out.println("Informacion extraida del arreglo 2");
       System.out.println("Valor maximo del arreglo2 :"+maximo2);
       System.out.println("Valor minimo del arreglo2 :"+minimo2);
       System.out.println("Valor promedio del arreglo2 :"+promedio2);
        
    }
}


