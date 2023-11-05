/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author Stefan
 */
public class Controller {
    
    private List<Knjiga> listaknjiga;
    private List<Autor>  listaautora;

    private static Controller instance;
    
    public static Controller getInstance(){
        if(instance==null)
            instance=new Controller();
        return instance;
    }
   
    private Controller() {
        
        Autor autor1=new Autor("Ivo", "Andric", 1892, "Nesto o Ivi Andricu");
        Autor autor2=new Autor("Danilo", "Kis", 1935, "Nesto o Danilu Kisu");
        Autor autor3=new Autor("Mesa", "Selimovic", 1910, "Nesto o Mesi Selimovicu");
        
        
        Knjiga knjiga1=new Knjiga("Na Drini Cuprija", autor1, "1234567890-", 1945, Zanr.ROMAN);
        Knjiga knjiga2=new Knjiga("Basta,pepeo", autor2, "2174721442214", 1982, Zanr.ISTORIJSKI);
        Knjiga knjiga3=new Knjiga("Tvrdjava", autor3, "8851212412", 1970, Zanr.NAUCNA_FANTASTIKA);


        listaknjiga=new ArrayList<>();
        listaautora=new ArrayList<>();
        
        listaknjiga.add(knjiga1);
        listaknjiga.add(knjiga2);
        listaknjiga.add(knjiga3);
        
        listaautora.add(autor1);
        listaautora.add(autor2);
        listaautora.add(autor3);
        
    }

    public List<Knjiga> getListaknjiga() {
        return listaknjiga;
    }

    public void setListaknjiga(List<Knjiga> listaknjiga) {
        this.listaknjiga = listaknjiga;
    }

    public List<Autor> getListaautora() {
        return listaautora;
    }

    public void setListaautora(List<Autor> listaautora) {
        this.listaautora = listaautora;
    }

    public void obrisiKnjigu(int selektovaniRed) {
        listaknjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga knjiga) {
        listaknjiga.add(knjiga);
    }
    
    
    
    
    
}
