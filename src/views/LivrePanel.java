package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LivrePanel extends JPanel {

    private JTextField searchField = new JTextField(30); // Taille du champ de recherche
    private JButton searchButton = new JButton("Rechercher");
    private JTable livresTable;
    private JButton addButton = new JButton("Ajouter Livre");
    private JButton editButton = new JButton("Modifier");
    private JButton deleteButton = new JButton("Supprimer");
    private JButton emprunterButton = new JButton("Emprunter");

    public LivrePanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        // Search panel setup
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Centrage du panneau
        searchPanel.setBackground(Color.WHITE);

        searchField.setFont(new Font("Arial", Font.PLAIN, 14));
        searchPanel.add(searchField);

        searchButton.setFont(new Font("Arial", Font.PLAIN, 14));
        searchButton.setBackground(new Color(70, 130, 180));
        searchButton.setForeground(Color.WHITE);
        searchPanel.add(searchButton);

        // Table setup (modified columns without "Date d'ajout")
        String[] columns = {"ID", "Titre", "Auteur", "Année", "Genre", "ISBN", "Éditeur", "Langue", "Disponibilité"};
        Object[][] data = {}; // Initial data, to be updated dynamically
        livresTable = new JTable(new DefaultTableModel(data, columns));
        livresTable.setFont(new Font("Arial", Font.PLAIN, 14));
        livresTable.setRowHeight(30);
        livresTable.setGridColor(Color.LIGHT_GRAY);
        livresTable.setSelectionBackground(new Color(70, 130, 180));
        livresTable.setSelectionForeground(Color.WHITE);
        livresTable.setDefaultEditor(Object.class, null); // Disable editing directly on the table

        JScrollPane scrollPane = new JScrollPane(livresTable);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        scrollPane.setPreferredSize(new Dimension(800, 300));

        // Button panel setup
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Boutons centrés avec espacement
        buttonPanel.setBackground(Color.WHITE);

        // Customize and add buttons
        customizeButton(addButton);
        buttonPanel.add(addButton);

        customizeButton(editButton);
        buttonPanel.add(editButton);

        customizeButton(deleteButton);
        buttonPanel.add(deleteButton);

        customizeButton(emprunterButton);
        buttonPanel.add(emprunterButton);

        // Add components to the main panel
        this.add(searchPanel, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    // Utility to customize buttons
    private void customizeButton(JButton button) {
        button.setPreferredSize(new Dimension(150, 40));
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    // Getters and setters for components
    public JTextField getSearchField() {
        return searchField;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JTable getLivresTable() {
        return livresTable;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getEmprunterButton() {
        return emprunterButton;
    }
}
