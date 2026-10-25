/*
    Author: Prof. Autorino and Tamana Bashardost 

    Footer.java

    Simple Swing based component to hold two buttons in a FlowLayout
*/

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Tamana, Selena
 * Footer
 */

public class Footer {
    private JPanel footerPanel = null;
    private JButton  clearBtn = null;
    private JButton exitBtn = null;

    public Footer() {
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        clearBtn = new JButton("Clear Text Area");
        exitBtn = new JButton("Exit");
        
        footerPanel.add(clearBtn);
        footerPanel.add(exitBtn);
    }

    public Footer (String clrButton, String extButton) {
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        clearBtn = new JButton(clrButton);
        exitBtn = new JButton(extButton);
        
        footerPanel.add(clearBtn);
        footerPanel.add(exitBtn);
    }

    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getClearButton() {
        return clearBtn;
    }

    public JButton getExitButton() {
        return exitBtn;
    }

    // Setters

    public void setClearButton( String clrButton){
        clearBtn.setText(clrButton);
    }


    public void setExitButton( String extBtn){
        exitBtn.setText(extBtn);
    }

}