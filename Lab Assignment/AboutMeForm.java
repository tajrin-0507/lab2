import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * About me form which diplays user inputs on a panel and chnages backgrounds based on an external website.
 * 
 * AboutMeForm.java 
 * 
 * @author Tamana Bashardost, Sabrina Kessler, Selena Persaud
 * @author Edited by Tajrin for Lab 2 Group Project
 */
public class AboutMeForm {
   public static void main(String[] args) {
       SwingUtilities.invokeLater(AboutMeForm::createAndShowGUI);
   }
   /**
    * Adds the the panels together on one Jframe and displays them.
    */
   public static void createAndShowGUI() {
       JFrame frame = new JFrame("About Me Form");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500, 350);
       frame.setLocationRelativeTo(null);
       frame.setLayout(new BorderLayout());

       Header header = new Header("Type a title:", "", "Submit");
       Center center = new Center();
       Footer footer = new Footer("Clear", "Exit");

       frame.setBackground(Color.BLACK);
       frame.add(header.getHeaderPanel(), BorderLayout.NORTH);
       frame.add(center.getCenterPanel(), BorderLayout.CENTER);
       frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);
        
       /* Event Listeners */
    
       /* Update the display label with the content of the text field when updateBtn is clicked.*/
       header.getUpdateButton().addActionListener(e -> {
           String input = header.getGreetingField().getText();
           center.setDisplayLabel(input);
           System.out.println(input);
           System.out.println("Name: " + center.getName() + "\nMajor: "+ 
           center.getMajor() +"\nAge: "+ center.getAge() +"\nYear: "+ center.getYear());
       });


       /* Clear all text from textArea when clearBtn is clicked.*/
       footer.getClearButton().addActionListener(e -> {
            center.setName("");
            center.setDisplayLabel("");
            center.setAge("");
            center.setMajor("");
            center.setYear("");
            header.setGreetingField("");
            System.out.println("Texts cleared.");
       });

       /* Exit the application */
       footer.getExitButton().addActionListener(e -> {
           System.out.println("User exited the form.");
           System.exit(0);
       });


       frame.setVisible(true);
   }
}

