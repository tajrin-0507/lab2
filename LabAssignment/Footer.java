import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 * Simple Swing based component to hold two buttons in a FlowLayout
 * 
 * Footer.java
 * @author Porf. Autorino
 * @author Edited by Tamana Bashardost, Selena Persaud
 */
public class Footer {
    private JPanel footerPanel = null;
    private JButton  clearBtn = null;
    private JButton exitBtn = null;

    /**
     * Default Footer constructor
     */
    public Footer() {
        this("Clear Text Fields", 
        "Exit Program");
    }

    /**
     * Constructor with parameters
     * 
     * @param clrButton the clear button text
     * @param extButton the exit button text
     */
    public Footer (String clrButton, String extButton) {
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        footerPanel.setBackground(Color.DARK_GRAY);

        clearBtn = new JButton(clrButton);
        exitBtn = new JButton(extButton);
        
        footerPanel.add(clearBtn);
        footerPanel.add(exitBtn);
    }

    /* Getter Methods */
    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getClearButton() {
        return clearBtn;
    }

    public JButton getExitButton() {
        return exitBtn;
    }

    /* Setter Methods */
    public void setClearButton( String clrButton){
        clearBtn.setText(clrButton);
    }

    public void setExitButton( String extBtn){
        exitBtn.setText(extBtn);
    }

}