package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Definition de la commande ajouter et comment l'utiliser */
public class CommandeAjouter extends CommandeDocument {


    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Ajoute du texte
     * Aller voir la méthode {@link Document#ajouter(String)}*/
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
