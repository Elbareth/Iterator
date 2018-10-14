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
public class Piosenka {
    private String tytul;
    private String wykonawca;
    private String album;
    private String zdjecie;
    private Integer rok;

    public String getTytul() {
        return tytul;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public String getAlbum() {
        return album;
    }

    public String getZdjecie() {
        return zdjecie;
    }

    public Integer getRok() {
        return rok;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setZdjecie(String zdjecie) {
        this.zdjecie = zdjecie;
    }

    public void setRok(Integer rok) {
        this.rok = rok;
    }
    @Override
    public String toString(){
        return wykonawca+", "+tytul+", "+album+", "+rok+", "+zdjecie;
    }

    public Piosenka(String tytul, String wykonawca, String album, Integer rok, String zdjecie ) {
        this.tytul = tytul;
        this.wykonawca = wykonawca;
        this.album = album;
        this.zdjecie = zdjecie;
        this.rok = rok;
    }
    
}
