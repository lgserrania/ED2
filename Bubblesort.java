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
public class Bubblesort {
    
    public Bubblesort (int[] vet){
        
        int salva;
        boolean troca;
        
        do{
            troca = false;
            for(int i = 0; i < vet.length - 1; i++){
                if(vet[i] > vet[i + 1]){
                    salva = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = salva;
                    troca = true;
                    Globais.display(vet,i);
                }
            }
        }while(troca);
        
    }
    
    
    
}
