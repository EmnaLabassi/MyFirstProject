public class Personne {

    // Attributs d'objet
    private int idPersonne;
    private String nom,prenom;

    // Constructeur sans attributs

    public Personne (){
    }

    // Constructeur avec attributs
    public Personne(int idPersonne, String nom, String prenom) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
    }
    // Getters et setters


    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Redefinition des classes toString()
    @Override
    public String toString() {
        return (" Identifiant : "+this.idPersonne +" nom : "+ this.nom +" prenom : "+ this.prenom);
    }
}
