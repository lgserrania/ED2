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
public class Insercao {
    
    public Insercao(int[] vet){
        
        int i, x, j;
        i = 1;
        while(i < vet.length){
            x = vet[i];
            j = i - 1;
            while(j >= 0 && x < vet[j]){
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = x;
            i++;
            Globais.display(vet, i - 1);
        }
        
    }
    
}
