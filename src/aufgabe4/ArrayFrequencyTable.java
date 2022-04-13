package aufgabe4;

import java.util.Arrays;

/**
 * @author oliverbittel
 * @since 25.03.2021
 */
public class ArrayFrequencyTable<T> extends AbstractFrequencyTable<T> {
    private int size;
    private Element<T>[] fqTable;

    public ArrayFrequencyTable() {
        clear();
    }

    @Override
    public int size() {
        // throw muss noch auskommentiert werden!
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Ihr Code:
        // ...
        return this.size;
    }

    @Override
    public final void clear() {
        // throw muss noch auskommentiert werden!
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Ihr Code:
        // ...
        size = 0;
        fqTable = new Element[100];
    }

    @Override
    public void add(T w, int f) {
        // throw muss noch auskommentiert werden!
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Ihr Code:
        // ...
        if(this.size() >= this.fqTable.length) {
            this.fqTable = Arrays.copyOf(fqTable, size*2); //verdoppelt die länge das Arrays, falls es voll ist
        }
        int index;
        for (int i = 0; i < this.size; i++) { // überprüft, ob das Wort schon vorhanden ist
            if (this.fqTable[i].getWord().equals(w)) {
                index = i;
                this.fqTable[index].addFrequency(f);
                this.movetoleft(index);
                return;
            }
        }
         // fügt ein neues Wort mit seiner Anzahl hinzu
            this.fqTable[size++] = new Word(w, f);
            this.movetoleft(size-1);
    }

    private void movetoleft(int pos) {
        if(pos==0)
            return;
        Element w= fqTable[pos];
        int i = pos-1;
        while(i>= 0 && w.getFrequency() > fqTable[i].getFrequency()){
            fqTable[i+1]=fqTable[i];
            i--;
        }
        fqTable[i+1]=w;
    }


    @Override
    public Element get(int pos) {
        // throw muss noch auskommentiert werden!
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Ihr Code:
        // ...
        return fqTable[pos];
    }

    @Override
    public int get(T w) {
        // throw muss noch auskommentiert werden!
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Ihr Code:
        // ...
        for (int i = 0; i < this.size; i++) { // fügt Wörter der Ausgabe hinzu
            if (this.fqTable[i].getWord().equals(w))
                return this.fqTable[i].getFrequency();

        }
        return 0;
    }
}