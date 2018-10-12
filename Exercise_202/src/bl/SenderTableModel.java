package bl;

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
