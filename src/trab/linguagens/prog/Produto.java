/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab.linguagens.prog;

/**
 *
 * @author Rodolfo
 */
public class Produto {
    
    int cod;
    float preco;
    String nome;
    int quant;

    public Produto(int cod, float preco, String nome, int quant) {
        this.cod = cod;
        this.preco = preco;
        this.nome = nome;
        this.quant = quant;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

   
    
    
}
