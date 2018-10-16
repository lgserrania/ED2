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
public class Selecao {
    
    public Selecao(int[] vet){
        
        int menor, salva;
        for(int i = 0; i < vet.length - 1; i++){
            menor = i;
            for(int j = i + 1; j < vet.length; j++){
                if(vet[j] < vet[menor])
                    menor = j;
            }
            salva = vet[i];
            vet[i] = vet[menor];
            vet[menor] = salva;
            Globais.display(vet, i);
        }
        
    }
    
}
