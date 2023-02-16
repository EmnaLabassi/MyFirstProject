public class Projection implements CineInfo{
    // Attributs d'objet
    private int idCinema, idFilm;
    private String jour;

    // Constructeur avec attributs

    public Projection(int idCinema, int idFilm, String jour) {
        this.idCinema = idCinema;
        this.idFilm = idFilm;
        this.jour = jour;
    }


    // Getters et setters

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    // Redefinition des classes toString()
    @Override
    public String toString() {
        return ("idCinema : "+this.getIdCinema() +" idFilm : "+ this.getIdFilm() +" jour de projection: "+ this.jour);
    }

    // Implementation de la méthode afficheInfo()
    @Override
    public void afficherInfo() {
        System.out.println("idCinema : "+this.getIdCinema() +" idFilm : "+ this.getIdFilm() +" jour de projection: "+ this.jour);

    }
}
