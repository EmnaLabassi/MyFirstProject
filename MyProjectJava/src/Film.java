public class Film {
    // Attributs d'objet
    private int idFilm,idRealisateur,annee;
    private String titre,genre;

    // Constructeur sans attributs

    public Film (){
    }

    // Constructeur avec attributs

    public Film(int idFilm, int idRealisateur, String titre, String genre, int annee) {
        this.idFilm = idFilm;
        this.idRealisateur = idRealisateur;
        this.titre = titre;
        this.genre = genre;
        this.annee = annee;
    }

    // Getters et setters


    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getIdRealisateur() {
        return idRealisateur;
    }

    public void setIdRealisateur(int idRealisateur) {
        this.idRealisateur = idRealisateur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Ajout de la méthode equals()
    public boolean equals(Film f) {
        if(this.idFilm==f.idFilm)return  true;
        else return false;
    }
}
