/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2;

/**
 *
 * @author CLIENTE
 */
public class Shellsort {
    
    //Algoritmo de inserção mais eficiente
    public Shellsort(int[] vet){
        
        int i, j, h, x;
        h = 1;
        do h = 3 * h + 1; while (h < vet.length);
        do{
            h = h / 3;
            i = h;
            while(i < vet.length){
                x = vet[i];
                j = i - h;
                while(j >= 0 && x < vet[j]){
                    vet[j + h] = vet[j];
                    j -= h;
                }
                vet[j + h] = x;
                i++;
                Globais.display(vet, i - 1);
            }
            System.out.println("h = " + h);
        }while(h != 1);
        
    }
    
}
