package com.loteria.jogo;

import java.util.Random;

/**
 * @version 0.1
 * @author carloshenkes
 */
class Sorteador {

    /**
     * @return Método que retorna um numero sorteado aleatóriamente
     * @since 2016-05-10
     * @param tamJogo 
     */
   public int geraNumero(int tamJogo) {
        Random numS = new Random();
        int num = numS.nextInt(tamJogo);
        return num;
    }

}
