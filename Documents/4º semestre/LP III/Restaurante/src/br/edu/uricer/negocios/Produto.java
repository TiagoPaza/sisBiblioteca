package br.edu.uricer.negocios;

import java.math.BigDecimal;

/**
 *
 * @author -Tiago
 */
public class Produto {
    String descricao;
    BigDecimal preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
}

