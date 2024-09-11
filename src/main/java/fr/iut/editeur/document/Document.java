package fr.iut.editeur.document;
/**
 * Creer simule un document composer d'un texte des commandes pour l'éditer
 */
public class Document {

    /**
     * Texte du document*/
    private String texte;

    /**
    * Construteur de la classe */
    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute le texte saisie en parametre
     * @param texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace le texte entre les 2 borne par un nouveau
     * @param debut
     * @param fin
     * @param remplacement     *
     * */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met le texte entre les 2 bornes en majuscule
     * @param debut
     * @param fin */
    public void majuscules(int debut, int fin) {
        String maj = this.texte.substring(debut, fin + 1).toUpperCase();
        remplacer(debut, fin, maj);
    }

    /**
     * Efface le texte entre les 2 bornes
     * @param debut
     * @param fin */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin , "");
    }

    /**
     * Efface le texte au complet*/
    public void clear() {
        texte = "";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
