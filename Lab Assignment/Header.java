import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Simple Swing based component to hold one label, one text area, and one button.
 * Due to the FlowLayout design, this component class is intended to "head" the app.
 * 
 * Header.java
 * 
 * @author Prof. Autorino
 * @author Edited by Selena Persaud, Tamana Bashardost,
 * @author Edited documentation by Tajrin for Lab 2 Group Project
 */
public class Header {

    /* Variables */
    private JPanel headerPanel = null;
    private JLabel greetingLabel = null;
    private JTextField greetingField = null;
    private JButton updateBtn = null;

    /**
     * Default constructor
     */
    public Header() {
        this("Greetings:", "Hello, World!", "Submit");
    }

    /**
     * Constructor with parameters that modifies elements
     * @param greeting the greeting text
     * @param field the input field
     * @param button the update button
     */
    public Header (String greeting, String field, String button) {
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        headerPanel.setBackground(Color.BLACK);

        greetingLabel = new JLabel(greeting);
        greetingLabel.setForeground(Color.GREEN);
        headerPanel.add(greetingLabel);

        greetingField = new JTextField(20);
        greetingField.setText(field);
        headerPanel.add(greetingField);

        updateBtn= new JButton(button);
        headerPanel.add(updateBtn);
    }

    /* Return elements so we can access their attributes. */
    
    /**
     * Returns the header panel
     * @return the header panel
     */
    public JPanel getHeaderPanel() {
        return headerPanel;
    }    

    /**
     * Returns the greeting label
     * @return greeting label
     */
    public JLabel getGreetingLabel() {
        return greetingLabel;
    }

    /**
     * Returns the greeting field
     * @return the greeting field
     */
    public JTextField getGreetingField() {
        return greetingField;
    }

    /**
     * Returns the update button
     * @return the update button
     */
    public JButton getUpdateButton() {
        return updateBtn;
    }

    /* Setter methods */

    /**
     * Sets the greeting label to given text
     * @param greeting the greeting text
     */
    public void setGreetingLabel(String greeting) {
        greetingLabel.setText(greeting);
    }

    /**
     * Sets the greeting text field
     * @param field the text input field
     */
    public void setGreetingField(String field) {
        greetingField.setText(field);
    }

    /**
     * Sets the update button
     * @param button the update button
     */
    public void setUpdateButton(String button) {
        updateBtn.setText(button);
    }

}