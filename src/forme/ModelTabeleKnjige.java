/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Knjiga;

/**
 *
 * @author Stefan
 */
public class ModelTabeleKnjige extends AbstractTableModel {

    private List<Knjiga> listaknjiga;
    private final String[] kolone={"Naslov","Autor","ISBN","Godina izdanja"};

    public ModelTabeleKnjige(List<Knjiga> listaknjiga) {
        this.listaknjiga = listaknjiga;
    }
    
    
    
    @Override
    public int getRowCount() {
       return listaknjiga.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Knjiga knjiga=listaknjiga.get(rowIndex);
        switch(columnIndex){
            case 0:
                return knjiga.getNaslov();
            case 1:
                return knjiga.getAutor().getPrezime()+" "+knjiga.getAutor().getIme();
            case 2:
                return knjiga.getISBN();
            case 3:
                return knjiga.getGodinaIzdanja();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    void osveziPodatke() {
        fireTableDataChanged();
    }
    
    
    
    
}
