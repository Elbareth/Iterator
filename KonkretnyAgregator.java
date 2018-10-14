/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class KonkretnyAgregator implements Agregator{
    private List <Piosenka> lista = new ArrayList <Piosenka> ();
    public void wgrajPlik(){        
    }
    @Override
    public List <Piosenka> listaPiosenek(){
        try{
            BufferedReader buffor = new BufferedReader(new FileReader("piosenki.txt"));
            String linia = "";
            while((linia = buffor.readLine())!= null){
                String [] tmp = linia.split(", ");
                Piosenka piosenka = new Piosenka(tmp[0],tmp[1],tmp[2],Integer.parseInt(tmp[3]),tmp[4]); // separator to przecinek
                piosenka.toString();
                lista.add(piosenka);
            }
        }        
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return lista;
    } 
    @Override
    public MyIterator createIterator(List <Piosenka> lista){
        return new KonkretnyIterator(lista);
    }
}
