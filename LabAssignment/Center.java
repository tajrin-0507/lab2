import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Center.java
 * 
 * Simple Swing based component to hold a label and a text field nested inside of a scroll pane
 * to add the questions for the user.
 * 
 * @author Prof. Autorino 
 * @author Edited by Sabrina Kessler & Selena Persuad (Hack #7 Usage)
 * @author Edited later by Tajrin for Lab 2 Group Project
 * 
 */
public class Center {
    /* Variables: Panels */
    private JPanel centerPanel = null;
    private JPanel questionPanel = null;

    /* Variables: Text Labels */
    private JLabel displayLabel = null;
    private JLabel nameLabel = null;
    private JLabel majorLabel = null;
    private JLabel ageLabel = null;
    private JLabel yearLabel = null;

    /* Variables: Text Fields */
    private JTextField nameField = null;
    private JTextField majorField = null;
    private JTextField ageField = null;
    private JTextField yearField = null;

    /**
     * Default constructor
     * (calls the constructor
     *  with the params)
     */
    public Center() {
        this("Hello World!", 
                    "Student 1", 
                    "Computer Science", 
                    "20", 
                    "Junior");
    }

    /**
     * Constructors with paramters to change center text
     * 
     * @param titleLabel the title at the top
     * @param name the user's name
     * @param major the user's major
     * @param age the user's age
     * @param year the user's year in university
     */
    public Center(String titleLabel, String name, String major, String age, String year) {
        /* Setting panels */
        centerPanel = new JPanel(new BorderLayout(0,5));
        questionPanel = new JPanel(new GridLayout(4, 2, 60, 10));
        
        /* Display Label */
        displayLabel = new JLabel(titleLabel, 
                        SwingConstants.CENTER);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setOpaque(true);
        displayLabel.setFont(displayLabel.getFont()
        .deriveFont(Font.BOLD, 18f));
        centerPanel.add(displayLabel, 
                        BorderLayout.NORTH);

        /* User's name */
        nameLabel = new JLabel("    Name: ");
        nameLabel.setBackground(Color.WHITE);
        nameLabel.setOpaque(true);
        nameField = new JTextField(name);
        questionPanel.add(nameLabel);
        questionPanel.add(nameField);
        
        /* User's major */
        majorLabel = new JLabel("    Major: ");
        majorLabel.setBackground(Color.WHITE);
        majorLabel.setOpaque(true);
        majorField = new JTextField(major);
        questionPanel.add(majorLabel);
        questionPanel.add(majorField);

        /* User's age */
        ageLabel = new JLabel("    Age: ");
        ageLabel.setBackground(Color.WHITE);
        ageLabel.setOpaque(true);
        ageField = new JTextField(age);
        questionPanel.add(ageLabel);
        questionPanel.add(ageField);

        /* User's Year of Study (Freshman, Sophomore, Junior, Senior) */
        yearLabel = new JLabel("    Year: ");
        yearLabel.setBackground(Color.WHITE);
        yearLabel.setOpaque(true);
        yearField = new JTextField(year);
        questionPanel.add(yearLabel);
        questionPanel.add(yearField);

        centerPanel.add(questionPanel, 
            BorderLayout.CENTER);

        /* Swing Hack #7 by Selena */ 

        /* Adding the question panel to 
        ScrollPaneWatermark's view port */
        ScrollPaneWatermark viewport = 
            new ScrollPaneWatermark();
        viewport.setView(questionPanel);
        viewport.setOpaque(false);

        /* Adding the viewport to scroll pane and 
        then adding scroll pane to centerpanel */
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewport(viewport);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        new Thread(new BackgroundLoader(viewport)).start();
    }

    /* Return elements so we can access their attributes. */
    public JLabel getDisplayLabel() {
        return displayLabel;
    }
    /**
     * Returns the Center Panel
     * @return the center panel
     */
    public JPanel getCenterPanel() {
        return centerPanel;
    }

    /**
     * Returns the user's name
     * @return the name text
     */
    public String getName(){ 
        return nameField.getText();
    }

    /**
     * Returns the user's major
     * @return the major text
     */
    public String getMajor(){ 
        return majorField.getText();
    }

    /**
     * Returns the user's age
     * @return the age text
     */
    public String getAge(){ 
        return ageField.getText();
    }

    /**
     * Returns the user's year
     * @return the year text
     */
    public String getYear(){ 
        return yearField.getText();
    }    
    
    /* Setter methods to apply custom changes */

    public void setDisplayLabel(String label) {
        displayLabel.setText(label);
    }

    /**
     * Sets name field to given string
     * @param name the user's name
     */
    public void setName(String name){
        nameField.setText(name);
    }

    /**
     * Sets major field to given string
     * @param major the user's major
     */
    public void setMajor(String major){
        majorField.setText(major);
    }
    
    /**
     * Sets age field to given string
     * @param age the user's age
     */
    public void setAge(String age){
        ageField.setText(age);
    }
    
    /**
     * Sets year field to given string
     * @param year the user's year
     */
    public void setYear(String year){
        yearField.setText(year);
    }
    

}
