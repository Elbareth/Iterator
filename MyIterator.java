/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author lenovo
 */
public interface MyIterator {
    public abstract boolean hasNext();
    public abstract void next();
    public abstract Piosenka currentItem();
}
