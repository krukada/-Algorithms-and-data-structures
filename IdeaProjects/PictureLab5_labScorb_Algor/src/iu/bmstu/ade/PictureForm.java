package iu.bmstu.ade;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PictureForm {
    private JSpinner radiusLength;
    private JPanel mainPanel;
    CanvasPanel canvasPanel;
    private JComboBox coloring;
    private JTextField textField1;

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            canvasPanel.setColor((Color)coloring.getItemAt(coloring.getSelectedIndex()));
        }
    }

    public PictureForm() {
        radiusLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                coloring.addActionListener(new ColorListener());
                int side = (int) radiusLength.getValue();
                canvasPanel.setSide(side);
                if (side<=0) {
                    textField1.setText("Радиус мерьше нуля или равен ему!");
                }
                if (side > 0){
                    textField1.setText("");
                }
            }
        });


        coloring.addItem(Color.GREEN);
        coloring.addItem(Color.BLUE);
        coloring.setVisible(true);
        radiusLength.setValue(125);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Picture");
        frame.setContentPane(new PictureForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
