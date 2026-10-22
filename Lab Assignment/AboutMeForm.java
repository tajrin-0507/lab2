import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/// Author: Tamana Bashardost, Sabrina Kessler, Selena Persaud


public class AboutMeForm {
   public static void main(String[] args) {
       SwingUtilities.invokeLater(AboutMeForm::createAndShowGUI);
   }


   public static void createAndShowGUI() {
       JFrame frame = new JFrame("About Me Form");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500, 350);
       frame.setLocationRelativeTo(null);
       frame.setLayout(new BorderLayout(10, 10));


       Header header = new Header("Input:", "", "Submit");
       Center center = new Center("About me", "Name: \nMajor: \nAge: \nYear:");
       Footer footer = new Footer("Clear", "Exit");


       frame.add(header.getHeaderPanel(), BorderLayout.NORTH);
       frame.add(center.getCenterPanel(), BorderLayout.CENTER);
       frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);
        
       /* Event Listeners */
        // Update the display label with the content of the text field when updateBtn is clicked.

       header.getUpdateButton().addActionListener(e -> {
           String input = header.getGreetingField().getText();
           center.setDisplayLabel(input);
           System.out.println("User input: " + input);
           System.out.println(center.getTextArea().getText());
       });

    

       // Clear all text from textArea when clearBtn is clicked.
       footer.getClearButton().addActionListener(e -> {
           center.setTextArea("");
           System.out.println("Text area cleared.");
       });

       // Exit the application
       footer.getExitButton().addActionListener(e -> {
           System.out.println("User exited the form.");
           System.exit(0);
       });


       frame.setVisible(true);
   }
}

