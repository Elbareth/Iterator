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
public interface Agregator {
    public abstract List <Piosenka> listaPiosenek();    
    public abstract MyIterator createIterator(List <Piosenka> piosenka);
}
