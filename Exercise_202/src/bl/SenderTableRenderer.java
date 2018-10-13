package bl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class SenderTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Sender s = (Sender) o;
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        if (s.getBand().equals("FM")) {
            switch (i1) {

                case 0:
                    label.setText("" + s.getSendername());
                    label.setBackground(Color.RED);
                    label.setForeground(Color.LIGHT_GRAY);
                    break;
                case 1:
                    label.setText(String.format("%.2f", s.getFrequenz()));
                    label.setBackground(Color.RED);
                    label.setForeground(Color.LIGHT_GRAY);
                    break;
                case 2:
                    label.setText("" + s.getBand());
                    label.setBackground(Color.RED);
                    label.setForeground(Color.LIGHT_GRAY);
                    break;

            }
            label.setBackground(bln ? new Color(0, 0, 0) : Color.RED);
            label.setForeground(bln ? new Color(255, 255, 255) : Color.LIGHT_GRAY);
        } else if (s.getBand().equals("AM")) {
            switch (i1) {

                case 0:
                    label.setText("" + s.getSendername());
                    label.setBackground(Color.BLUE);
                    label.setForeground(Color.LIGHT_GRAY);
                    break;
                case 1:
                    label.setText(String.format("%.2f", s.getFrequenz()));
                    label.setBackground(Color.BLUE);
                    label.setForeground(Color.LIGHT_GRAY);
                    break;
                case 2:
                    label.setText("" + s.getBand());
                    label.setBackground(Color.BLUE);
                    label.setForeground(Color.LIGHT_GRAY);
                    break;

            }
            label.setBackground(bln ? new Color(0, 0, 0) : Color.BLUE);
            label.setForeground(bln ? new Color(255, 255, 255) : Color.LIGHT_GRAY);

        }

        return label;
    }

}
