package controllers;

import exceptions.LivreNotFoundException;
import views.GlobalView;

public class MainController {

    private GlobalView globalView;

    public MainController() throws LivreNotFoundException {
       // Initialiser la vue globale
        this.globalView = new GlobalView();

        // Initialiser et connecter les contrôleurs spécifiques
        initializeControllers();
    }

    private void initializeControllers() throws LivreNotFoundException {
        
         new LivreController(globalView);

        // Vous pourriez ajouter d'autres contrôleurs ici, comme :
        // new UserController(globalView);
        // new BooksController(globalView);
    }
}

