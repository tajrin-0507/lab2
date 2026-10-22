/*
    Author: Prof. Autorino

    Header.java

    Simple Swing based component to hold one label, one text area, and one button.
    Due to the FlowLayout design, this component class is intended to "head" the app.
*/

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Header {
    private JPanel headerPanel = null;
    private JLabel greetingLabel = null;
    private JTextField greetingField = null;
    private JButton updateBtn = null;

    public Header() {
        // Create a panel with a centered flow layout.
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        greetingLabel = new JLabel("Greeting:");
        headerPanel.add(greetingLabel);

        greetingField = new JTextField(20);
        greetingField.setText("Hello, World!");
        headerPanel.add(greetingField);

        updateBtn = new JButton("Submit");
        headerPanel.add(updateBtn);
    }

    // A new constructor for Header that uses paramaters to modify the elements

    public Header (String greeting, String field, String button) {
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        greetingLabel = new JLabel(greeting);
        headerPanel.add(greetingLabel);

        greetingField = new JTextField(20);
        greetingField.setText(field);
        headerPanel.add(greetingField);

        updateBtn= new JButton(button);
        headerPanel.add(updateBtn);

    }

    /* return elements so we can access their attributes. */
    public JPanel getHeaderPanel() {
        return headerPanel;
    }    

    public JLabel getGreetingLabel() {
        return greetingLabel;
    }

    public JTextField getGreetingField() {
        return greetingField;
    }

    public JButton getUpdateButton() {
        return updateBtn;
    }

    // Setters

    public void setGreetingLabel(String greeting) {
        greetingLabel.setText(greeting);
    }

    public void setGreetingField(String field) {
        greetingField.setText(field);
    }

    public void setUpdateButton(String button) {
        updateBtn.setText(button);
    }

}