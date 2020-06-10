/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Desarrollo
 */
public class JavaApplication3 {
    
    public static void revertir(int[] numero, int poso, int posf){
        
        if(poso<posf){
            numero[poso] = numero[posf];
            numero[posf] = numero[poso];
            revertir(numero,poso+1,posf-1);
        }
                    
    }
    
    public  static int fibonacci(int num){
        switch (num) {
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return fibonacci(num-1)+ fibonacci(num-1);
        }
    }
    public static boolean esPalindromo(String a){
        if(a==null){
            return false;
        }else if(a.isEmpty()){
            return false;
        }else if(a.length()==1){
            return true;
        }else if(a.length()==2){
            return a.charAt(0)==a.charAt(1);
        }else{
            return a.charAt(0)==a.charAt(a.length()-1)&&esPalindromo(a.substring(1,a.length()-1));
        
        }
    }
    
    public static void main(String[] args) {
        int[] numero = {1,2,3,4,5};
        revertir(numero,0,numero.length-1);
        for(int i=0;i<numero.length;i++){
            System.out.print(numero[i]);
        }
        
        for(int i=2;i<=14;i++){
            System.out.println(i + ": "+fibonacci(i));
        }
    }
    
}


