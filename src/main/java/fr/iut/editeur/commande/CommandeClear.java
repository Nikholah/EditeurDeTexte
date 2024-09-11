package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Definition de la commande clear et comment l'utiliser */
public class CommandeClear extends CommandeDocument{

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Suppression du texte
     * Aller voir la méthode {@link Document#clear()}*/
    @Override
    public void executer() {
        document.clear();
        super.executer();
    }
}
