/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benner;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Benner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializa classe
        Network network = new Network(8);
        boolean ligacao;
        //adiciona as posicao e os vinculos
        network.connect(1, 2);
        network.connect(1, 6); 
        network.connect(2, 4);
        network.connect(5, 8);
        // exibe os viculos com cada posicao
        network.exibe();
       // valida os vinculos com as posicoes informada
       ligacao =network.query(1, 6);
       
       if(ligacao){
           System.out.println("Ligação diretamente:"+ ligacao);
      }else{
            System.out.println("Ligação indirtamente:"+ ligacao);
       }
    }
    
    
}
