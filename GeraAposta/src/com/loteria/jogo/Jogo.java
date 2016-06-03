package com.loteria.jogo;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @version 0.1
 * @author carloshenkes
 */

public class Jogo {

    private int tamJogo, tamAposta, qntJogos;
    private final String jogo;
    private ArrayList aposta, numExclude;
    private final Sorteador sort = new Sorteador();

    public int getQntJogos() {
        return qntJogos;
    }

    public void setQntJogos(int qntJogos) {
        this.qntJogos = qntJogos;
    }

    public Jogo(String jogo) {
        this.jogo = jogo;
        this.aposta = new ArrayList();
    }

    public String selecionaJogo() {
        if (jogo.equals("loto")) {
            tamAposta = 15;
            tamJogo = 30;
            return "loto";
        } else if (jogo.equals("mega")) {
            tamAposta = 4;
            tamJogo = 60;
            return "mega";
        } else if (jogo.equals("quina")) {
            tamAposta = 5;
            tamJogo = 80;
            return "quina";
        }else{
            return "nulo";
        }
    }

    public ArrayList geraAposta() {
        aposta = new ArrayList();
        while (aposta.size() < tamAposta) {
            int numSort = sort.geraNumero(tamJogo);//call the method to generate a number
            if (numSort != 0) {
                if (!numExclude.contains(numSort)) {
                    if (!aposta.contains(numSort)) {
                        aposta.add(numSort);
                    }
                }
            }
        }
        return aposta;
    }

    public ArrayList separaNumeros(String numRemove) {
        numExclude = new ArrayList();
        if (numRemove != null) {
            String[] numRemS = numRemove.split(",");
            for (String numRemS1 : numRemS) {
                numExclude.add(Integer.valueOf(numRemS1));
            }
        }
        return numExclude;
    }
}
