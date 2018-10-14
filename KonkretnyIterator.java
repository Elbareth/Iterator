/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class KonkretnyIterator implements MyIterator{
    private static int pozycja = 0;
    private List<Piosenka> lista;
    public KonkretnyIterator(List <Piosenka> lista){
        this.lista = lista;
    }
    @Override
    public boolean hasNext(){
        if(pozycja < lista.size()) return true;
        else {
            pozycja = 0;
            return false;
        }
    }
    @Override
    public void next(){
        pozycja++;
    }
    @Override
    public Piosenka currentItem(){        
        return lista.get(pozycja);
    }
}
