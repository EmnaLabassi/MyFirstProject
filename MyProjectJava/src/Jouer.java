public class Jouer {
    // Attributs d'objet
    private int idActeur,idFilm;
    private String role;

    // Constructeur sans attributs

    public Jouer (){
    }

    // Constructeur avec attributs

    public Jouer(int idActeur, int idFilm, String role) {
        this.idActeur = idActeur;
        this.idFilm = idFilm;
        this.role = role;
    }

    // Getters et setters


    public int getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(int idActeur) {
        this.idActeur = idActeur;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Redefinition des classes toString()
    @Override
    public String toString() {
        return ("L'acteur qui a l'identifiant : "+this.idActeur +" joue le role : "+ this.role +" dans le film de l'id : "+ this.idFilm);
    }
}
