package bl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel {

    private LinkedList<Sender> sender = new LinkedList<>();

    private static String[] colNames = {"Sender", "Frequenz", "Band"};

    public void add(Sender s) {
        sender.add(s);
        sort();
        fireTableDataChanged();
    }

    public void updateNumCols(boolean hide) {
        if (hide) {
            colNames = new String[]{"Sender", "Frequenz"};
        } else {
            colNames = new String[]{"Sender", "Frequenz", "Band"};
        }

        fireTableStructureChanged();
    }

    public void load(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            br.readLine();

        } catch (Exception e) {
        }
    }

    public void save(File f) {

    }

    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Sender s = sender.get(i);
        return s;
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

    public void sort() {
        Collections.sort(sender, new sortByFrequenz());
    }

}
