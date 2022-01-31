/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benner;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class No {
    private int posicao;    
    //Array de viculos onde ca posicao podera ter enumero vinculos
    private ArrayList vinculos = new ArrayList();
    No(){};
    No( int posicao,int vinculo){        
        this.posicao = posicao;
        this.vinculos.add(vinculo);
    }

   
    /**
     * @return the posicao
     */
    public int getPosicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    /**
     * @return the vinculos
     */
    public ArrayList getVinculos() {
        return vinculos;
    }

    /**
     * @param vinculos the vinculos to set
     */
    public void setVinculos(int vinculos) {
  
        this.vinculos.add(vinculos);
    }

 
    
}
