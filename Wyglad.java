/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lenovo
 */
public class Wyglad extends JFrame{
    private JLabel vis;
    private JLabel albumCover;
    private JLabel band;
    private JLabel album;
    private JLabel name;
    private JLabel year;
    private String sciezka;
    private JButton play;
    private JButton next;
    private JLabel progressBar;
    private JLabel clock;
    private String [] tmpp;
    private Agregator agregator;
    private List <Piosenka> piosenka;
    private MyIterator iterator;
    public void tmp(){
        agregator = new KonkretnyAgregator();
        piosenka = agregator.listaPiosenek();
        iterator = agregator.createIterator(piosenka);        
    }
    public void teraz(){
        tmpp = iterator.currentItem().toString().split(", ");        
    }
    public void nastepny(){        
        iterator.next();
        iterator.hasNext();
    }
    public Wyglad(){
       tmp();
       teraz();
       setSize(750,520);
       setTitle("Odtwarzacz Muzyki");
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       vis = new JLabel(new ImageIcon("obraz\\lound.gif"));
       vis.setBounds(40, 100, 400, 270);
       add(vis);       
       albumCover = new JLabel(new ImageIcon(tmpp[4]));
       albumCover.setBounds(460, 50, 250, 250);
       add(albumCover);
       name = new JLabel(tmpp[0]);
       name.setForeground(Color.green);
       name.setBounds(460,310,150,50);
       add(name);
       band = new JLabel(tmpp[1]);
       band.setForeground(Color.green);
       band.setBounds(460,330,150,50);
       add(band);
       album = new JLabel(tmpp[2]);
       album.setForeground(Color.green);
       album.setBounds(460,350,150,50);
       add(album);
       year = new JLabel(tmpp[3]);
       year.setForeground(Color.green);
       year.setBounds(460,370,150,50);
       add(year);
       play = new JButton(new ImageIcon("obraz\\playButton.png"));
       play.setBounds(120,420,40,40);
       add(play);
       next = new JButton(new ImageIcon("obraz\\nextPlay.png")); // tutaj wykorzytsaj iterator
       next.setBounds(160,420,40,40);
       next.addActionListener(new nastepnyButton());
       add(next);
       progressBar = new JLabel(new ImageIcon("obraz\\progressBar.jpg"));
       progressBar.setBounds(200,420,300,40);
       add(progressBar);
       clock = new JLabel(new ImageIcon("obraz\\clock.jpg"));
       clock.setBounds(490,420,140,40);
       add(clock);
       setVisible(true);
    }    
    class nastepnyButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            nastepny();
            teraz();           
            setVisible(false);
            new Wyglad().setVisible(true);
        }        
    }
}
