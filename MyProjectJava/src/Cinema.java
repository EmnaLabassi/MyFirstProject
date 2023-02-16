public class Cinema extends Entreprise implements CineInfo{

    // Attributs d'objet
    private int idCinema;

    // Constructeur avec attributs
    public Cinema(String nom, String adresse, int idCinema) {
        super(nom, adresse);
        this.idCinema = idCinema;
    }

    // Getters et setters
    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }
    // Redefinition des classes toString()
    @Override
    public String toString() {
        return (" Nom : "+this.getNom() +" adresse : "+ this.getAdresse() +" identifiant cinema : "+ this.idCinema);
    }

    // Implementation de la méthode afficheInfo()
    @Override
    public void afficherInfo() {
        System.out.println(" Nom : "+this.getNom() +" adresse : "+ this.getAdresse() +" identifiant cinema : "+ this.idCinema);

    }
}
