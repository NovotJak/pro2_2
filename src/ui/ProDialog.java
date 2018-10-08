package ui;

import model.ToDoItem;

import javax.swing.*;
import java.awt.*;

public class ProDialog extends JDialog {

    private ToDoItem item;


    public ProDialog(){
        setModal(true);
        setLayout(new GridLayout(2, 2));
        JLabel jLabel = new JLabel();
        add(jLabel);
        
        JTextField jTextField = new JTextField();
        add(jTextField);

        JButton btnOK = new JButton("OK");
        add(btnOK);

        btnOK.addActionListener(action ->{
            item = new ToDoItem(jTextField.getText());
            setVisible(false);
        });

        pack();
        setLocationRelativeTo(null);
    }

    public ToDoItem getItem(){
        setVisible(true);
        return item;
    }
}
