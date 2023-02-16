
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Ajout personne dans ArrayList
        ArrayList<Personne> alp = new ArrayList<Personne>();

        Personne p1 = new Personne(1,"Worthington","Sam");
        Personne p2 = new Personne(2,"Saldana","Zoe");

        alp.add(p1);
        alp.add(p2);

        //Ajout Film dans ArrayList
        ArrayList<Film> alf = new ArrayList<Film>();

        Film f1 = new Film(1,1,"Avatar 1","science-fiction",2009);
        Film f2 = new Film(2,2,"Avatar 2","science-fiction",2022);

        alf.add(f1);
        alf.add(f2);

        //Ajout Cinema dans ArrayList
        ArrayList<Cinema> alc= new ArrayList<Cinema>();

        Scanner s = new Scanner(System.in);
        //Ajout du premeir objet cinema
        System.out.println("Ecrire l'identifiant du 1er cinema");
        int id1 = s.nextInt();
        System.out.println("Ecrire le nom du 1er cinema");
        String nom1 = s.next();
        System.out.println("Ecrire l'adresse du 1er cinema");
        String adr1 = s.next();

        Cinema c1 = new Cinema(nom1,adr1,id1);

        //Ajout du deuxieme objet cinema
        System.out.println("Ecrire l'identifiant du 2eme cinema");
        int id2 = s.nextInt();
        System.out.println("Ecrire le nom du 2eme cinema");
        String nom2 = s.next();
        System.out.println("Ecrire l'adresse du 2eme cinema");
        String adr2 = s.next();

        Cinema c2 = new Cinema(nom2,adr2,id2);

        alc.add(c1);
        alc.add(c2);

        // Afficher les elements dans ArrayListCinema

        for (Cinema c:alc){
            System.out.println((c.toString()));
        }
        System.out.println("------------------------");

        // Afficher les elements dans ArrayListPersonne

        for (Personne p:alp){
            System.out.println((p.toString()));
        }
        System.out.println("------------------------");
        // Afficher les elements de la Liste Cinema en utiloisant for et affichInfo()

        for (Cinema c:alc){
            c.afficherInfo();
        }
        System.out.println("------------------------");
        //Connexion BD
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinebase_emna","root","");

            //Creation de statement
            Statement statement = c.createStatement();

            //Requete pour afficher les personnes dont le nom commence par "S"
            String myQuery = "Select * from personne where nom like \"s%\"";

            ResultSet resultSet = statement.executeQuery(myQuery);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("idPersonne")+" | "
                        +resultSet.getString("nom"));
            }
            System.out.println("------------------------");
            //Requete pour afficher les film dont le titre contient "blanc"
            String myQuery2 = "Select * from film where titre like \"%blanc%\"";

            ResultSet resultSet2 = statement.executeQuery(myQuery2);

            while (resultSet2.next()){
                System.out.println(resultSet2.getInt("idFilm")+" | "
                        +resultSet2.getString("titre"));
            }
            System.out.println("------------------------");

            // //Requete pour inserer les elements de la liste cinema dans la BD

            for (Cinema cin:alc){
                PreparedStatement ps = c.prepareStatement("insert into cinema values (?,?,?) ");

                ps.setInt(1,cin.getIdCinema());
                ps.setString(2,cin.getNom());
                ps.setString(3,cin.getAdresse());

                ps.executeUpdate();
            }

            // changer le nom d'un cinema existant
            Scanner sc = new Scanner(System.in);

            System.out.println("Choisir un identifiant du cinema");
            int idCi = s.nextInt();

            System.out.println("Tapez un nouveau nom du cinema");
            String nomCi = s.next();

            PreparedStatement ps1 = c.prepareStatement("update cinema set nom =? where idCinema=? ");
            int idTemp = idCi;
            String nomTemp = nomCi;

            ps1.setString(1,nomTemp);
            ps1.setInt(2,idTemp);

            int rs=  ps1.executeUpdate();

            //Supprimer les projections pour idFilm3
            PreparedStatement ps2 = c.prepareStatement("delete from projection where idFilm=? ");
            int idTempFilm = 10;
            ps2.setInt(1,idTempFilm);

            int rs2=  ps2.executeUpdate();







        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}