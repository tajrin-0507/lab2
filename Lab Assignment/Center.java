/*
    Author: Prof. Autorino

    Edited by: Sabrina Kessler, Selena Persaud

    Center.java

    Simple Swing based component to hold a label and a text field nested inside of a scroll pane.
*/

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Center {
    private JPanel centerPanel = null;
    private JTextArea textArea = null;
    private JLabel displayLabel = null;

    public Center() {
        centerPanel = new JPanel(new BorderLayout(5, 5));

        // This label will display the greeting text from the Header component.
        displayLabel = new JLabel("Hello, World!", SwingConstants.CENTER);
        displayLabel.setFont(displayLabel.getFont().deriveFont(Font.BOLD, 18f));
        centerPanel.add(displayLabel, BorderLayout.NORTH);

        textArea = new JTextArea(
            "This is a JTextArea.\n" +
            "You can type anything here.\n" +
            "It demonstrates a multi-line component."
        );
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
    }

    //Constructors with paramters to change center text

    public Center(String label, String text) {
        centerPanel = new JPanel(new BorderLayout(5, 5));
        displayLabel = new JLabel(label, SwingConstants.CENTER);
        displayLabel.setFont(displayLabel.getFont().deriveFont(Font.BOLD, 18f));
        centerPanel.add(displayLabel, BorderLayout.NORTH);

        textArea = new JTextArea(text);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        
        // Swing Hack #7 
        ScrollPaneWatermark viewport = new ScrollPaneWatermark();
        viewport.setView(textArea);
        viewport.setOpaque(false);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewport(viewport);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        new Thread(new BackgroundLoader(viewport)).start();
    }

    /* return elements so we can access their attributes. */
    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JLabel getDisplayLabel() {
        return displayLabel;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    //Setters
    public void setDisplayLabel(String label) {
        displayLabel.setText(label);
    }

    public void setTextArea(String text){
        textArea.setText(text);
    }
}
