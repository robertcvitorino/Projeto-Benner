package benner;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class Network {

    private No posicao[];

    
    Network(int tamanho) {
        try {
            if (!validaNumero(tamanho)) {
                throw new Exception("Numero invalido, deve ser posito!");
            } else {
                //Inicia array de objeto com tamanho informado
                this.posicao = new No[tamanho];
            }

        } catch (NullPointerException ne) {
            System.out.println(ne);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void connect(int numero, int ligacao) {
        try {
            if (!validaNumero(numero) && !validaNumero(ligacao)) {
                throw new Exception("Numero invalido,deve ser positivo");
            }
            ArrayList vinculo = new ArrayList();
            //verifica se na ja existe objeto na posicao, caso exista acessa o array de vinculos e adiciona um novo vinculo
            if (this.posicao[numero] != null) {
                this.posicao[numero].setVinculos(ligacao);
            } else {
                // adiciona um vinculo no array do objeto,conforme a posicao informada
                vinculo.add(ligacao);
                this.posicao[numero] = new No(numero, ligacao);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    ;
   
  public boolean query(int numero, int ligacao) {
        boolean diretamente = false;

        try {
            //verifica se numero é positivo
            if (!validaNumero(numero) || !validaNumero(ligacao)) {
                throw new Exception("Numero invalido,deve ser positivo");
            } else {
                // verifica se no array possui objeto
                if (this.posicao[numero] != null) {
                    for (int i = 0; i < this.posicao.length; i++) {
                        if (this.posicao[i] != null) {
                            // veririca no array dentro do objeto 
                            if (!this.posicao[i].getVinculos().isEmpty()) {
                                for (int j = 0; j < this.posicao[i].getVinculos().size(); j++) {
                                    // verifica se no array de vinculos existe alguma ligacao informada caso sim retrun true
                                    if (this.posicao[i].getVinculos().get(j).equals(ligacao)) {
                                        diretamente = true;
                                    }
                                }
                            }
                            return diretamente;
                        }

                    }

                }
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return diretamente;
        }

    }

    ;
   //verifica se numero é positivo
  private boolean validaNumero(int numero) {
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
    }

    ;
  // exibe as posicao e os viculos dos elementos
  public void exibe() {
        for (int i = 0; i < this.posicao.length; i++) {
            if (this.posicao[i] != null) {
                System.out.println("\nPosicao:" + this.posicao[i].getPosicao());
                if (this.posicao[i].getVinculos() != null) {
                    this.posicao[i].getVinculos().forEach(item -> System.out.println("vinculos:" + item));

                }
            }

        }
    }

}
