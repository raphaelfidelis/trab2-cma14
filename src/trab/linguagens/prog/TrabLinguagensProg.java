/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab.linguagens.prog;

import java.util.ArrayList;

/**
 *
 * @author Rodolfo
 */
public class TrabLinguagensProg {
    private ArrayList<Produto> produtos;
    
    public TrabLinguagensProg(){
        produtos = new ArrayList();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto p) {
        produtos.add(p);
    }
    
    
    public static void main(String[] args) {
        Menu principal = new Menu();
        principal.setVisible(true);
    }
    
}
