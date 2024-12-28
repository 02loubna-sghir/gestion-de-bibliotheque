package views;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class GlobalView extends JFrame {

    private JTabbedPane tabbedPane = new JTabbedPane();

    public GlobalView() {
        this.setTitle("Bibliothèque");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(700, 500));
        this.setLocationRelativeTo(null);

        // Set a modern Look and Feel
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        ajouterComposantes();
        this.setVisible(true); 
    } 

    
    
    
    
    
    public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}






	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}



    private void ajouterComposantes() {
        this.add(tabbedPane, BorderLayout.CENTER);
    }


/*	private void ajouterComposantes() {
        this.add(tabbedPane, BorderLayout.CENTER);
        //tabbedPane.addTab("Gestion des utilisateurs", new UserPanel());  // Use UserPanel class
        //tabbedPane.addTab("Gestion des livres", new LivrePanel());       // Use LivrePanel class
        tabbedPane.addTab("Gestion des emprunts", new EmpruntsPanel()); // Use EmpruntPanel class
    }
    
*/
}