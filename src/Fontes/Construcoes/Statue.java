/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Statue extends Construcao {

    public Statue(BancoDeDados bd) {
        super(bd, 999, "Vini's Statue", "A estátua mais maravilhosa do mundo. Aumenta a produção de todos os recursos em 1.000.000", 10_000_000, 10_000_000, 10_000_000, 10_000_000);
    }

    @Override
    public void construir() {
        
    }

    @Override
    public void acao() {
        this.getBd().addComida(1_000_000);
        this.getBd().addMadeira(1_000_000);
        this.getBd().addOuro(1_000_000);
        this.getBd().addPedra(1_000_000);
    }
    
}
